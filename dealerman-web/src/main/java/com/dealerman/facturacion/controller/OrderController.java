package com.dealerman.facturacion.controller;

import com.dealerman.enumerator.BusquedaCustomersEnum;
import com.dealerman.enumerator.BusquedaProductsEnum;
import com.dealerman.enumerator.CategoryDeudorEnum;
import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.facturacion.dataManager.OrderDM;
import com.dealerman.orders.Customers;
import com.dealerman.orders.Orders;
import com.dealerman.facturacionServicesUI.ICustomersService;
import com.dealerman.facturacionServicesUI.IOrderLineItemsService;
import com.dealerman.facturacionServicesUI.IOrdersService;
import com.dealerman.facturacionServicesUI.ISalesmenService;
import com.dealerman.general.CreditTerms;
import com.dealerman.generalServicesUI.ICreditTermsService;
import com.dealerman.inventary.Products;
import com.dealerman.inventaryServicesUI.IProductsService;
import com.dealerman.orders.OrderLineItems;
import com.dealerman.orders.Salesmen;
import com.dealerman.utils.BaseController;
import com.dealerman.utils.UtilVista;
import com.dealerman.utils.UtilsGlobal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import org.primefaces.PrimeFaces;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author eddie
 */
@ManagedBean(name = "orderController")
@ViewScoped
public class OrderController extends BaseController {
    
    @ManagedProperty("#{orderDM}")
    OrderDM orderDM;
    @EJB
    ICustomersService customersService;
    @EJB
    ICreditTermsService creditTermsService;
    @EJB
    ISalesmenService salesmenService;
    @EJB
    IProductsService productsService;
    @EJB
    IOrdersService ordersService;
    @EJB
    IOrderLineItemsService orderLineItemsService;
    
    public void init() {
        //Instancia nueva order
        orderDM.setOrder(new Orders());
        ordersService.instanciarOrder(orderDM.getOrder());
        if (accessDM.getBranchSelect() != null) {
            orderDM.getOrder().setCompanyBodega(accessDM.getBranchSelect());
            orderDM.getOrder().setLocalId(accessDM.getBranchSelect().getLocalId());
            orderDM.getOrder().setIssueId(accessDM.getBranchSelect().getIssueId());
        }

        // Instance order line items
        orderDM.setListOrderLineItems(new ArrayList<OrderLineItems>());
        orderLineItemsService.instanciaOrderItems(orderDM.getListOrderLineItems());

        //Instanciar customers
        orderDM.setCustomerSelect(new Customers());
        orderDM.setListFiltroBusquedaCustomers(BusquedaCustomersEnum.values());
        orderDM.setListFiltroBusquedaProducts(BusquedaProductsEnum.values());
    }
    
    public void buscarCustomers(String buscar) {
        try {
            buscar = buscar.trim();//Quita espacios en blancos
            List<Customers> listRespuesta = customersService.busquedaCoinciendia(buscar, CategoryDeudorEnum.CLIENTES);
            if (listRespuesta == null) {//Ingreso nuevo cliente
                ingresoCustomers(buscar);
            } else if (!(listRespuesta.isEmpty()) && (UtilVista.isNumeric(buscar))) {//Encontro cédula, ruc o código del cliente
                orderDM.setCustomerSelect(listRespuesta.get(0));
                cargarInfoAdicional();
                validarEmail(orderDM.getCustomerSelect().geteMail());
            } else if (!UtilVista.isNumeric(buscar)) {//Muestra pantalla de ayuda para buscar por coincidencias
                orderDM.setListCustomers(listRespuesta);
                PrimeFaces.current().executeScript("PF('dlgBuscarCustomers').show();");
            }
        } catch (EntidadNoGrabadaException ex) {
            addErrorMessage(ex.getMessage());
        }
    }
    
    public void buscarProducts(String buscar) {
        try {
            buscar = UtilsGlobal.quitarEspacios(buscar);//Quita espacios en blancos
            List<Products> listRespuesta = productsService.busquedaCoinciendia(buscar);
            if (UtilsGlobal.busquedaXPunto(buscar)) {//Muestra pantalla de ayuda para buscar por coincidencias
                orderDM.setListProducts(listRespuesta);
                orderDM.setTextBuscarProducto(buscar.substring(1, buscar.length()));//instancia el campo para buscar y elimina el punto
                PrimeFaces.current().executeScript("PF('dlgBuscarProducts').show();");
            } else {
                orderLineItemsService.addProductToLineItems(orderDM.getListOrderLineItems(), orderDM.getOrder(), listRespuesta.get(0));
                PrimeFaces.current().ajax().update("pnlOrdenVenta");
                PrimeFaces.current().ajax().update("txtTotalOrder");
                PrimeFaces.current().ajax().update("txtNumItems");
            }
        } catch (EntidadNoGrabadaException ex) {
            addErrorMessage(ex.getMessage());
        }
    }
    
    public void buscarCustomersAvanzado(String buscar) {
        orderDM.setListCustomers(customersService.buscarFiltroCoinciendia(buscar.trim(), orderDM.getBusquedaCustomerSelect(), CategoryDeudorEnum.CLIENTES));
    }
    
    public void buscarProductsAvanzado(String buscar) {
        orderDM.setListProducts(productsService.buscarFiltroCoinciendia(buscar.trim(), orderDM.getBusquedaProductsSelect()));
    }
    
    private void ingresoCustomers(String ruc) {
        orderDM.setCustomerSelect(new Customers());
        orderDM.getCustomerSelect().setCedula(ruc);
        orderDM.getCustomerSelect().setCustomerId(ruc);
        editarCustomers(false);
        updatePanelClientes();
        addSuccessMessage("Ingreso de nuevo cliente");
    }
    
    public void guardarOrder() {
        try {
            ordersService.guardarOrder(orderDM.getOrder(), orderDM.getListOrderLineItems(),
                    orderDM.getCustomerSelect(), accessDM.getEmployeeSelect());
            addSuccessMessage("Venta realizada correctamente.");
        } catch (EntidadNoGrabadaException ex) {
            System.out.println(ex.getCause());
            addErrorMessage(ex.getMessage());
        }
    }
    
    public void guardarCustomers() {
        try {
            orderDM.getCustomerSelect().setBranchSelect(accessDM.getBranchSelect());
            orderDM.getCustomerSelect().setEmployeeSelect(accessDM.getEmployeeSelect());
            customersService.guardarCustomers(orderDM.getCustomerSelect(), CategoryDeudorEnum.CLIENTES);
            editarCustomers(true);
            addSuccessMessage("Registro guardado correctamente");
        } catch (EntidadNoGrabadaException ex) {
            addErrorMessage(ex.getMessage());
        }
    }
    
    public void cancelarCustomers() {
        orderDM.setCustomerSelect(new Customers());
        orderDM.setListCreditTermis(new ArrayList<CreditTerms>());
        orderDM.setListSalesmen(new ArrayList<Salesmen>());
        editarCustomers(true);
    }
    
    public void editarCustomers(boolean band) {
        orderDM.setEditCustomers(band);
        orderDM.setEditEmail(band);
    }
    
    public void onRowSelectCustomers(SelectEvent event) {
        orderDM.setCustomerSelect((Customers) event.getObject());
        orderDM.getCustomerSelect().setCustomerId(orderDM.getCustomerSelect().getCustomerId().trim()); //Quita los espacios en blanco
        cargarInfoAdicional();
        validarEmail(orderDM.getCustomerSelect().geteMail());
    }
    
    public void onRowSelectProducts(SelectEvent event) {
        try {
            orderLineItemsService.addProductToLineItems(orderDM.getListOrderLineItems(), orderDM.getOrder(), (Products) event.getObject());
        } catch (EntidadNoGrabadaException ex) {
            addErrorMessage(ex.getMessage());
        }
    }
    
    public void calcularOrderLineItem(OrderLineItems orderLine) {
        orderLineItemsService.calcularTotalesOrderLineItem(orderLine);
        ordersService.calcularTotalesOrder(orderDM.getListOrderLineItems(), orderDM.getOrder());
    }
    
    public void removeOrderLineItem(OrderLineItems orderLine) {
        orderLineItemsService.removeOrderItems(orderDM.getListOrderLineItems(), orderLine);
        ordersService.calcularTotalesOrder(orderDM.getListOrderLineItems(), orderDM.getOrder());
    }
    
    private void cargarInfoAdicional() {
        orderDM.setListCreditTermis(creditTermsService.buscar(new CreditTerms()));
        orderDM.setListSalesmen(salesmenService.buscar(new Salesmen()));
        PrimeFaces.current().ajax().update("pnlDatosAdicional");
    }
    
    private void validarEmail(String email) {
        if ((email == null) || (email.isEmpty())) {
            editarCustomers(false);
            PrimeFaces.current().executeScript("$('#btnGuardarCustomers').click()");
            PrimeFaces.current().focus("txtEmail");
        }
        updatePanelClientes();
    }
    
    private void updatePanelClientes() {
        PrimeFaces.current().ajax().update("pnlDatosCliente");
        PrimeFaces.current().ajax().update("botonesCustomers");
    }
    
    public void closeBusquedaCustomers() {
        orderDM.setListCustomers(new ArrayList<Customers>());
    }
    
    public OrderDM getOrderDM() {
        return orderDM;
    }
    
    public void setOrderDM(OrderDM orderDM) {
        this.orderDM = orderDM;
    }
    
}

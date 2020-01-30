package com.dealerman.facturacion.controller;

import com.dealerman.enumerator.BusquedaCustomersEnum;
import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.facturacion.dataManager.OrderDM;
import com.dealerman.orders.Customers;
import com.dealerman.orders.Orders;
import com.dealerman.facturacionServicesUI.ICustomersService;
import com.dealerman.facturacionServicesUI.ISalesmenService;
import com.dealerman.general.CreditTerms;
import com.dealerman.generalServicesUI.ICreditTermsService;
import com.dealerman.orders.Salesmen;
import com.dealerman.utils.BaseController;
import com.dealerman.utils.UtilVista;
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

    public void init() {
        orderDM.setOrder(new Orders());
        orderDM.getOrder().setOrderDate(accessDM.getFechaActual());

        //Instanciar customers
        orderDM.setCustomerSelect(new Customers());
        orderDM.setListaBusquedaCustomers(BusquedaCustomersEnum.values());
    }

    public void buscarCustomers(String buscar) {
        try {
            List<Customers> listRespuesta = customersService.busquedaCoinciendia(buscar);
            if (listRespuesta == null) {//Ingreso nuevo cliente
                ingresoCustomers(buscar);
            } else if (!(listRespuesta.isEmpty()) && (UtilVista.isNumeric(buscar))) {//Encontro cédula, ruc o código del cliente
                orderDM.setCustomerSelect(listRespuesta.get(0));
                cargarInfoAdicional();
                validarEmail(orderDM.getCustomerSelect().geteMail());
                PrimeFaces.current().ajax().update("pnlDatosCliente");
            } else if (!UtilVista.isNumeric(buscar)) {//Muestra pantalla de ayuda para buscar por coincidencias
                orderDM.setListCustomers(listRespuesta);
                PrimeFaces.current().executeScript("PF('dlgBuscarCustomers').show();");
            }
        } catch (EntidadNoGrabadaException ex) {
            addErrorMessage(ex.getMessage());
        }
    }

    public void buscarCustomersAvanzado(String buscar) {
        orderDM.setListCustomers(customersService.buscarFiltroCoinciendia(buscar, orderDM.getBusquedaCustomerSelect()));
    }

    private void ingresoCustomers(String ruc) {
        orderDM.setCustomerSelect(new Customers());
        orderDM.getCustomerSelect().setCedula(ruc);
        orderDM.getCustomerSelect().setCustomerId(ruc);
        editarCustomers(false);
        PrimeFaces.current().ajax().update("pnlDatosCliente");
        PrimeFaces.current().ajax().update("botonesCustomers");
        addSuccessMessage("Ingreso de nuevo cliente");
    }

    public void guardarCustomers() {
        try {
            orderDM.getCustomerSelect().setCompanyId(accessDM.getEmployeeSelect().getCompanyId());
            orderDM.getCustomerSelect().setBranchSelect(accessDM.getBranchSelect());
            orderDM.getCustomerSelect().setEmployeeSelect(accessDM.getEmployeeSelect());
            customersService.guardarCustomers(orderDM.getCustomerSelect());
            editarCustomers(true);
            addSuccessMessage("Registro guardado correctamente");
        } catch (EntidadNoGrabadaException ex) {
            addErrorMessage(ex.getMessage());
        }
    }

    public void cancelarCustomers() {
        orderDM.setCustomerSelect(new Customers());
        editarCustomers(true);
    }

    private void editarCustomers(boolean band) {
        orderDM.setEditCustomers(band);
        orderDM.setEditEmail(band);
    }

    public void onRowSelectCustomers(SelectEvent event) {
        orderDM.setCustomerSelect((Customers) event.getObject());
        orderDM.getCustomerSelect().setCustomerId(orderDM.getCustomerSelect().getCustomerId().trim()); //Quita los espacios en blanco
        cargarInfoAdicional();
        validarEmail(orderDM.getCustomerSelect().geteMail());

    }

    private void cargarInfoAdicional() {
        orderDM.setListCreditTermis(creditTermsService.buscar(new CreditTerms()));
        orderDM.setListSalesmen(salesmenService.buscar(new Salesmen()));
        PrimeFaces.current().ajax().update("pnlDatosAdicional");
    }

    private void validarEmail(String email) {
        if ((email == null) || (email.isEmpty())) {
            orderDM.setEditEmail(false);
            addErrorMessage("Debe ingresar un correo electrónico válido");
        }
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

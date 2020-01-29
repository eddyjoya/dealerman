/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.facturacion.controller;

import com.dealerman.enumerator.BusquedaCustomers;
import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.facturacion.dataManager.OrderDM;
import com.dealerman.orders.Customers;
import com.dealerman.orders.Orders;
import com.dealerman.facturacionServicesUI.ICustomersService;
import com.dealerman.utils.BaseController;
import com.dealerman.utils.UtilVista;
import com.dealerman.utils.UtilsGlobal;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public void init() {
        orderDM.setOrder(new Orders());
        orderDM.getOrder().setOrderDate(accessDM.getFechaActual());

        //Instanciar customers
        orderDM.setCustomerSelect(new Customers());
        orderDM.setListaBusquedaCustomers(BusquedaCustomers.values());
    }
    
    public void buscarCustomers(String buscar) {
        if (UtilVista.isNumeric(buscar)) {
            if (buscar.length() < 10) {
                orderDM.setListCustomers(customersService.buscar(new Customers(buscar, null)));
                if (orderDM.getListCustomers().isEmpty()) {
                    addWarnMessage("¡Código no existente!");
                    return;
                }
            }
            if ((buscar.length() >= 10) && (buscar.length() <= 13)) {
                orderDM.setListCustomers(customersService.buscar(new Customers(null, buscar)));
                if (orderDM.getListCustomers().isEmpty()) {
                    try {
                        if (UtilsGlobal.validadorDeCedula(buscar)) {
                            ingresoCustomers(buscar);
                            return;
                        }
                    } catch (EntidadNoGrabadaException ex) {
                        addErrorMessage(ex.getMessage());
                        return;
                    }
                }
            }
            orderDM.setCustomerSelect(orderDM.getListCustomers().get(0));
            PrimeFaces.current().ajax().update("pnlDatosCliente");
            
        } else if (buscar.length() > 0) {
            orderDM.setListCustomers(customersService.buscar(new Customers(null, buscar, null)));
            PrimeFaces.current().executeScript("PF('dlgBuscarCustomers').show();");
        }
    }
    
    private void ingresoCustomers(String ruc) {
        orderDM.setCustomerSelect(new Customers());
        orderDM.getCustomerSelect().setCedula(ruc);
        orderDM.getCustomerSelect().setCustomerId(ruc);
        orderDM.setEditCustomers(false);
        orderDM.setEditEmail(false);
        PrimeFaces.current().ajax().update("pnlDatosCliente");
        PrimeFaces.current().ajax().update("botonesCustomers");
        addSuccessMessage("Ingreso de nuevo cliente");
    }
    
    public void guardarCustomers() {
        try {
            orderDM.getCustomerSelect().setCompanyId(accessDM.getEmployeeSelect().getCompanyId());
            customersService.guardarCustomers(orderDM.getCustomerSelect());
        } catch (EntidadNoGrabadaException ex) {
            addErrorMessage(ex.getMessage());
        }
    }
    
    public void cancelarCustomers() {
        orderDM.setCustomerSelect(new Customers());
        orderDM.setEditCustomers(true);
        orderDM.setEditEmail(true);
    }
    
    public void buscarCustomersAvanzado(String buscar) {
        switch (orderDM.getBusquedaCustomerSelect()) {
            case Nombre:
                orderDM.setListCustomers(customersService.buscar(new Customers(null, buscar, null)));
                break;
            case Contacto:
                orderDM.setListCustomers(customersService.buscar(new Customers(null, null, buscar)));
                break;
            default:
                break;
        }
    }
    
    public void onRowSelectCustomers(SelectEvent event) {
        orderDM.setCustomerSelect((Customers) event.getObject());
        orderDM.getCustomerSelect().setCustomerId(orderDM.getCustomerSelect().getCustomerId().trim()); //Quita los espacios en blanco
        if (orderDM.getCustomerSelect().geteMail().isEmpty()) {
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

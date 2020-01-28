/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.facturacion.controller;

import com.dealerman.enumerator.BusquedaCustomers;
import com.dealerman.facturacion.dataManager.OrderDM;
import com.dealerman.orders.Customers;
import com.dealerman.orders.Orders;
import com.dealerman.servicesUI.ICustomersService;
import com.dealerman.utils.BaseController;
import com.dealerman.utils.UtilVista;
import java.util.ArrayList;
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
        if ((UtilVista.isNumeric(buscar))
                && ((buscar.length() == 10) || (buscar.length() == 13))) {
            orderDM.setListCustomers(customersService.buscar(new Customers(buscar, null)));
            orderDM.setCustomerSelect(orderDM.getListCustomers().get(0));
            PrimeFaces.current().ajax().update("pnlDatosCliente");
        } else {
            orderDM.setListCustomers(customersService.buscar(new Customers(null, buscar)));
            PrimeFaces.current().executeScript("PF('dlgBuscarCustomers').show();");
        }
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

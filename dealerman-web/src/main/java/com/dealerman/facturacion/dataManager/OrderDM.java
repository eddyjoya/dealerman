package com.dealerman.facturacion.dataManager;

import com.dealerman.enumerator.BusquedaCustomers;
import com.dealerman.orders.Customers;
import com.dealerman.orders.Orders;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author eddie
 */
@ManagedBean(name = "orderDM")
@ViewScoped
public class OrderDM {

    private Orders order = new Orders();
    private List<Customers> listCustomers;
    private Customers customerSelect;
    private BusquedaCustomers[] listaBusquedaCustomers;
    private BusquedaCustomers busquedaCustomerSelect;
    private boolean editCustomers = true;
    private boolean editEmail = true;

    public boolean isEditCustomers() {
        return editCustomers;
    }

    public void setEditCustomers(boolean editCustomers) {
        this.editCustomers = editCustomers;
    }

    public boolean isEditEmail() {
        return editEmail;
    }

    public void setEditEmail(boolean editEmail) {
        this.editEmail = editEmail;
    }

    public Orders getOrder() {
        return order;
    }

    public BusquedaCustomers[] getListaBusquedaCustomers() {
        return listaBusquedaCustomers;
    }

    public void setListaBusquedaCustomers(BusquedaCustomers[] listaBusquedaCustomers) {
        this.listaBusquedaCustomers = listaBusquedaCustomers;
    }

    public BusquedaCustomers getBusquedaCustomerSelect() {
        return busquedaCustomerSelect;
    }

    public void setBusquedaCustomerSelect(BusquedaCustomers busquedaCustomerSelect) {
        this.busquedaCustomerSelect = busquedaCustomerSelect;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public List<Customers> getListCustomers() {
        return listCustomers;
    }

    public void setListCustomers(List<Customers> listCustomers) {
        this.listCustomers = listCustomers;
    }

    public Customers getCustomerSelect() {
        return customerSelect;
    }

    public void setCustomerSelect(Customers customerSelect) {
        this.customerSelect = customerSelect;
    }

}

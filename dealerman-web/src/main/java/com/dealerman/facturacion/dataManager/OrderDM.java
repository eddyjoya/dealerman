package com.dealerman.facturacion.dataManager;

import com.dealerman.enumerator.BusquedaCustomersEnum;
import com.dealerman.general.CreditTerms;
import com.dealerman.orders.Customers;
import com.dealerman.orders.Orders;
import com.dealerman.orders.Salesmen;
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
    private List<CreditTerms> listCreditTermis;
    private List<Salesmen> listSalesmen;
    private Customers customerSelect;
    private BusquedaCustomersEnum[] listaBusquedaCustomers;
    private BusquedaCustomersEnum busquedaCustomerSelect;
    private boolean editCustomers = true;
    private boolean editEmail = true;

    public List<CreditTerms> getListCreditTermis() {
        return listCreditTermis;
    }

    public List<Salesmen> getListSalesmen() {
        return listSalesmen;
    }

    public void setListSalesmen(List<Salesmen> listSalesmen) {
        this.listSalesmen = listSalesmen;
    }

    public void setListCreditTermis(List<CreditTerms> listCreditTermis) {
        this.listCreditTermis = listCreditTermis;
    }

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

    public BusquedaCustomersEnum[] getListaBusquedaCustomers() {
        return listaBusquedaCustomers;
    }

    public void setListaBusquedaCustomers(BusquedaCustomersEnum[] listaBusquedaCustomers) {
        this.listaBusquedaCustomers = listaBusquedaCustomers;
    }

    public BusquedaCustomersEnum getBusquedaCustomerSelect() {
        return busquedaCustomerSelect;
    }

    public void setBusquedaCustomerSelect(BusquedaCustomersEnum busquedaCustomerSelect) {
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

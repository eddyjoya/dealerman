package com.dealerman.facturacion.dataManager;

import com.dealerman.enumerator.BusquedaCustomersEnum;
import com.dealerman.enumerator.BusquedaProductsEnum;
import com.dealerman.general.CreditTerms;
import com.dealerman.inventary.Products;
import com.dealerman.orders.Customers;
import com.dealerman.orders.OrderLineItems;
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
    private List<OrderLineItems> listOrderLineItems;
    private String textBuscarProducto;
    private OrderLineItems orderLineItem = new OrderLineItems();
    private List<Products> listProducts;
    private Customers customerSelect;
    private BusquedaCustomersEnum[] listFiltroBusquedaCustomers;
    private BusquedaCustomersEnum busquedaCustomerSelect;
    private BusquedaProductsEnum[] listFiltroBusquedaProducts;
    private BusquedaProductsEnum busquedaProductsSelect;
    private boolean editCustomers = true;
    private boolean editEmail = true;

    public List<CreditTerms> getListCreditTermis() {
        return listCreditTermis;
    }

    public List<OrderLineItems> getListOrderLineItems() {
        return listOrderLineItems;
    }

    public String getTextBuscarProducto() {
        return textBuscarProducto;
    }

    public OrderLineItems getOrderLineItem() {
        return orderLineItem;
    }

    public void setOrderLineItem(OrderLineItems orderLineItem) {
        this.orderLineItem = orderLineItem;
    }

    public void setTextBuscarProducto(String textBuscarProducto) {
        this.textBuscarProducto = textBuscarProducto;
    }

    public void setListOrderLineItems(List<OrderLineItems> listOrderLineItems) {
        this.listOrderLineItems = listOrderLineItems;
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

    public List<Products> getListProducts() {
        return listProducts;
    }

    public void setListProducts(List<Products> listProducts) {
        this.listProducts = listProducts;
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

    public BusquedaCustomersEnum[] getListFiltroBusquedaCustomers() {
        return listFiltroBusquedaCustomers;
    }

    public void setListFiltroBusquedaCustomers(BusquedaCustomersEnum[] listFiltroBusquedaCustomers) {
        this.listFiltroBusquedaCustomers = listFiltroBusquedaCustomers;
    }

    public BusquedaProductsEnum[] getListFiltroBusquedaProducts() {
        return listFiltroBusquedaProducts;
    }

    public void setListFiltroBusquedaProducts(BusquedaProductsEnum[] listFiltroBusquedaProducts) {
        this.listFiltroBusquedaProducts = listFiltroBusquedaProducts;
    }

    public BusquedaProductsEnum getBusquedaProductsSelect() {
        return busquedaProductsSelect;
    }

    public void setBusquedaProductsSelect(BusquedaProductsEnum busquedaProductsSelect) {
        this.busquedaProductsSelect = busquedaProductsSelect;
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

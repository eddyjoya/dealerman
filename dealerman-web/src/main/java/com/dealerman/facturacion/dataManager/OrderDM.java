package com.dealerman.facturacion.dataManager;

import com.dealerman.orders.Orders;
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

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

}

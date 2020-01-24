/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.facturacion.controller;

import com.dealerman.facturacion.dataManager.OrderDM;
import com.dealerman.orders.Orders;
import com.dealerman.utils.BaseController;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author eddie
 */
@ManagedBean(name = "orderController")
@ViewScoped
public class OrderController extends BaseController {
    
    @ManagedProperty("#{orderDM}")
    OrderDM orderDM;
    
    public void init() {
        orderDM.setOrder(new Orders());
        orderDM.getOrder().setOrderDate(accessDM.getFechaActual());
    }
    
    public OrderDM getOrderDM() {
        return orderDM;
    }
    
    public void setOrderDM(OrderDM orderDM) {
        this.orderDM = orderDM;
    }
    
}

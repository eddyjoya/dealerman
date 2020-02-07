package com.dealerman.facturacionServicesUI;

import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.inventary.Products;
import com.dealerman.orders.OrderLineItems;
import com.dealerman.orders.Orders;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface IOrderLineItemsService {

    public void addProductToLineItems(List<OrderLineItems> listOrderLineItems, Orders order, Products product)
            throws EntidadNoGrabadaException;

    public void instanciaOrderItems(List<OrderLineItems> listOrderLineItems);

    public void removeOrderItems(List<OrderLineItems> listOrderLineItems, OrderLineItems orderLine);

    public void calcularTotalesOrderLineItem(OrderLineItems orderLine);
}

package com.dealerman.facturacionServicesUI;

import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.inventary.Products;
import com.dealerman.orders.OrderLineItems;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface IOrderLineItemsService {

    public void addProductToLineItems(List<OrderLineItems> listOrderLineItems, Products product) throws EntidadNoGrabadaException;

    public void instanciaOrderItems(List<OrderLineItems> listOrderLineItems);

    public void removeOrderItems(List<OrderLineItems> listOrderLineItems, OrderLineItems orderLine);

    public void calcularTotalesOrderLineItem(OrderLineItems orderLine);
}

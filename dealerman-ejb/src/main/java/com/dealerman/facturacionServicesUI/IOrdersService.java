package com.dealerman.facturacionServicesUI;

import com.dealerman.orders.OrderLineItems;
import com.dealerman.orders.Orders;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface IOrdersService {

    public void calcularTotalesOrder(List<OrderLineItems> listOrderLineItems, Orders order);
}

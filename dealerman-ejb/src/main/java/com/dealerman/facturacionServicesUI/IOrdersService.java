package com.dealerman.facturacionServicesUI;

import com.dealerman.configuration.Employee;
import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.orders.Customers;
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

    public void instanciarOrder(Orders order);

    public void guardarOrder(Orders order, List<OrderLineItems> listOrderLineItems,
            Customers customer, Employee employeeSelect) throws EntidadNoGrabadaException;

    public void calcularTotalesOrder(List<OrderLineItems> listOrderLineItems, Orders order);
}

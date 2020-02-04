package com.dealerman.facturacionServices;

import com.dealerman.facturacionServicesUI.IOrdersService;
import com.dealerman.orders.OrderLineItems;
import com.dealerman.orders.Orders;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author eddie
 */
@Stateless
public class OrdersService implements IOrdersService {

    @Override
    public void calcularTotalesOrder(List<OrderLineItems> listOrderLineItems, Orders order) {
        BigDecimal totalBruto = BigDecimal.ZERO;
        BigDecimal totalDescuento = BigDecimal.ZERO;
        BigDecimal totalSubtotal = BigDecimal.ZERO;
        for (OrderLineItems item : listOrderLineItems) {
            totalBruto = totalBruto.add(item.getTotalPrice());
            totalDescuento = totalDescuento.add(item.getDiscountValue());
        }
    }

}

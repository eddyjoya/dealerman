package com.dealerman.facturacionServices;

import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.facturacionServicesUI.IOrderLineItemsService;
import com.dealerman.inventary.Products;
import com.dealerman.orders.OrderLineItems;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author eddie
 */
@Stateless
public class OrderLineItemsService implements IOrderLineItemsService {
    
    @Override
    public void addProductToLineItems(List<OrderLineItems> listOrderLineItems, Products product) throws EntidadNoGrabadaException {
        validateIngresoLineItems(listOrderLineItems, product);
        OrderLineItems orderLineNew = new OrderLineItems();
        orderLineNew.setProduct(product);
        orderLineNew.setQuantity(BigDecimal.ONE);
        orderLineNew.setUnitPrice(product.getUnitPrice());
        calcularTotalesOrderLineItem(orderLineNew);
        listOrderLineItems.remove(listOrderLineItems.size() - 1);
        listOrderLineItems.add(orderLineNew);
        instanciaOrderItems(listOrderLineItems);
    }
    
    @Override
    public void calcularTotalesOrderLineItem(OrderLineItems orderLine) {
        BigDecimal valorDescount = BigDecimal.ZERO;
        BigDecimal total = orderLine.getQuantity().multiply(orderLine.getProduct().getUnitPrice());//Multiplica cantidad*precio unitario
        if (orderLine.getDiscount1() != null) { //Aplica descuento
            if (orderLine.getDiscount1().compareTo(new BigDecimal(100)) == 1) {//Máximo a aplicar es el 100%
                orderLine.setDiscount1(new BigDecimal("100"));
            }
            valorDescount = total.multiply(orderLine.getDiscount1().divide(new BigDecimal("100")));
        }
        orderLine.setDiscountValue(valorDescount);
        orderLine.setTotalPrice((total).subtract(valorDescount));//Si existio un descuento se aplica
    }
    
    private void validateIngresoLineItems(List<OrderLineItems> listOrderLineItems, Products product) throws EntidadNoGrabadaException {
        for (OrderLineItems lineItem : listOrderLineItems) {
            if (lineItem.getProduct().getProductId().equals(product.getProductId())) {
                product = new Products();
                throw new EntidadNoGrabadaException("El item ya fue ingresado...");
            }
        }
    }
    
    @Override
    public void instanciaOrderItems(List<OrderLineItems> listOrderLineItems) {
        OrderLineItems orderLine = new OrderLineItems();
        orderLine.setProduct(new Products());
        listOrderLineItems.add(orderLine);
    }
    
    @Override
    public void removeOrderItems(List<OrderLineItems> listOrderLineItems, OrderLineItems orderLine) {
        listOrderLineItems.remove(orderLine);
    }
}

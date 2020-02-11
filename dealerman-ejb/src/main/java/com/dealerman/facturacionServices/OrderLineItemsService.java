package com.dealerman.facturacionServices;

import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.facturacionDaoUI.IOrderLineItemsDao;
import com.dealerman.facturacionServicesUI.IOrderLineItemsService;
import com.dealerman.facturacionServicesUI.IOrdersService;
import com.dealerman.inventary.Products;
import com.dealerman.orders.OrderLineItems;
import com.dealerman.orders.Orders;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author eddie
 */
@Stateless
public class OrderLineItemsService implements IOrderLineItemsService {

    @EJB
    IOrdersService ordersService;
    @EJB
    IOrderLineItemsDao orderLineItemsDao;

    @Override
    public void addProductToLineItems(List<OrderLineItems> listOrderLineItems, Orders order, Products product) throws EntidadNoGrabadaException {
        validateIngresoLineItems(listOrderLineItems, product);
        OrderLineItems orderLineNew = new OrderLineItems();
        orderLineNew.setProduct(product);
        orderLineNew.setBranch(order.getCompanyBodega());
        orderLineNew.setQuantity(BigDecimal.ONE);
        orderLineNew.setDiscount1(BigDecimal.ZERO);
        orderLineNew.setDiscount2(BigDecimal.ZERO);
        orderLineNew.setService(Boolean.FALSE);
        orderLineNew.setPackages(product.getPackageEn());
        orderLineNew.setBonus(0);
        orderLineNew.setIce(BigDecimal.ZERO);
        orderLineNew.setIceValue(BigDecimal.ZERO);
        orderLineNew.setFobPrice(BigDecimal.ZERO);
        orderLineNew.setLastCost(BigDecimal.ZERO);
        orderLineNew.setTotalCost(BigDecimal.ZERO);
        orderLineNew.setPriceType(0);
        orderLineNew.setTax(12);
        orderLineNew.setAlicuota(BigDecimal.ZERO);
        orderLineNew.setUnitPrice(product.getUnitPrice());
        listOrderLineItems.remove(listOrderLineItems.size() - 1); //Elimina el primer item default
        listOrderLineItems.add(orderLineNew);//Agrega un nuevo registro
        instanciaOrderItems(listOrderLineItems);//instacia un nuevo item default para añadir un nuevo registro
        calcularTotalesOrderLineItem(orderLineNew); //calcula totales de la item line
        ordersService.calcularTotalesOrder(listOrderLineItems, order);//Calcula totales de la orden
    }

    private void guardar(OrderLineItems orderLineItems) throws EntidadNoGrabadaException {
        orderLineItemsDao.create(orderLineItems);
    }

    @Override
    public void guardarLineItems(List<OrderLineItems> listOrderLineItems, Orders order)
            throws EntidadNoGrabadaException {
        listOrderLineItems.remove(listOrderLineItems.size() - 1);//Elimina el ultimo registro de default
        for (OrderLineItems itemLine : listOrderLineItems) {
            itemLine.setOrder(order);
            guardar(itemLine);
        }
    }

    @Override
    public void calcularTotalesOrderLineItem(OrderLineItems orderLine) {
        BigDecimal valorDescount = BigDecimal.ZERO;
        BigDecimal valorTaxValue;
        BigDecimal total = orderLine.getQuantity().multiply(orderLine.getUnitPrice());//Multiplica cantidad*precio unitario
        if (orderLine.getDiscount1() != null) { //Aplica descuento
            if (orderLine.getDiscount1().compareTo(new BigDecimal(100)) == 1) {//Máximo a aplicar es el 100%
                orderLine.setDiscount1(new BigDecimal("100"));
            }
            valorDescount = total.multiply(orderLine.getDiscount1().divide(new BigDecimal("100")));
        }
        if (orderLine.getTax() == null) {
            orderLine.setTax(12);
        }
        orderLine.setDiscountValue(valorDescount);//Descuento aplicado
        orderLine.setTax(orderLine.getTax()); //Porcentaje de IVA
        orderLine.setTotalPrice((total).subtract(valorDescount));//Si existio un descuento se aplica
        orderLine.setTotalPriceBruto(total);//Guarda el total bruto sin descuentos
        valorTaxValue = orderLine.getTotalPrice().multiply(new BigDecimal(orderLine.getTax()).divide(new BigDecimal("100")));
        orderLine.setTaxValue(valorTaxValue); //Valor de IVA aplicado

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

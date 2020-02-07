package com.dealerman.facturacionServices;

import com.dealerman.configuration.Employee;
import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.facturacionDaoUI.IOrdersDao;
import com.dealerman.facturacionServicesUI.IOrdersService;
import com.dealerman.orders.Customers;
import com.dealerman.orders.OrderLineItems;
import com.dealerman.orders.Orders;
import com.dealerman.utils.UtilsGlobal;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author eddie
 */
@Stateless
public class OrdersService implements IOrdersService {

    @EJB
    IOrdersDao ordersDao;

    @Override
    public void instanciarOrder(Orders order) {
        order.setSource(0);//?
        order.setOrderDate(new Date());
        order.setDeliverBy(UtilsGlobal.sumarRestarDiasFecha(new Date(), 2));//?
        order.setValidTo(new Date());
        order.setTrxNumber(BigDecimal.ZERO);//?
        order.setAmbiente(1);//?
        order.setOrderNumber(BigDecimal.ONE); //? revisar
        order.setTipoEmision(1);
        order.setInvoiceNumber("");//?
        order.setQuotationNumber(BigDecimal.ZERO);//?
        order.setPedidoNumber(BigDecimal.ZERO); //?
        order.setPriceType(1);//?
        order.setCarNumber(0);//?
        order.setWithTax(Boolean.TRUE);
        order.setDetailDiscount(BigDecimal.ZERO);
        order.setDiscount(BigDecimal.ZERO);//?
        order.setExtraDiscount(BigDecimal.ZERO);//?
        order.setFicDiscount(BigDecimal.ZERO);//?
        order.setTaxable(BigDecimal.ZERO);//?
        order.setTotalExento(BigDecimal.ZERO);//?
        order.setNoTaxValue(BigDecimal.ZERO);//?
        order.setIceValue(BigDecimal.ZERO);//?
        order.setTaxTotal(BigDecimal.ZERO);//?
        order.setFinance(BigDecimal.ZERO);//?
        order.setFreight(BigDecimal.ZERO);//?
        order.setFreight1(BigDecimal.ZERO);//?
        order.setCost(BigDecimal.ZERO);
        order.setCostLast(BigDecimal.ZERO);//?
        order.setTotal(BigDecimal.ZERO);
        order.setOldone(Boolean.FALSE);//?
        order.setIvaIncluded(Boolean.FALSE);//?
        order.setUnposted(Boolean.FALSE);//?
        order.setRetenido(Boolean.FALSE);//?
        order.setTaxPerc(12);//?
        order.setPending(Boolean.FALSE);//?
        order.setCash(BigDecimal.ZERO);//?
        order.setChange1(BigDecimal.ZERO);//?
        order.setOutDiscount(BigDecimal.ZERO);//?
        order.setCreditoTributario(Boolean.TRUE);//?
        order.setCompId("18"); //?
        order.setIceTaxable(BigDecimal.ZERO);//?
        order.setIceTotal(BigDecimal.ZERO);//?
        order.setServices(BigDecimal.ZERO);//?
        order.setServiceTax(BigDecimal.ZERO);//?
        order.setIvaReturn("N"); //?
        order.setNoComps(1);//?
        order.setStatus(null);//?
        order.setNewone(Boolean.TRUE);//?
        order.setActivityId(00);//?
        order.setTipo("FC");//?
        //nuevo
        order.setTotalBruto(BigDecimal.ZERO);

    }

    private void create(Orders order) throws EntidadNoGrabadaException {
        order.setAdded(true);
        order.setModified(false);
        ordersDao.create(order);
    }

    private void update(Orders order) throws EntidadNoGrabadaException {
        order.setAdded(false);
        order.setModified(true);
        ordersDao.create(order);
    }

    @Override
    public void guardarOrder(Orders order, List<OrderLineItems> listOrderLineItems,
            Customers customer, Employee employeeSelect) throws EntidadNoGrabadaException {
        Orders orderResp = order;
        order = new Orders();
        order.setAplicacion(customer.getAplicacion());
        order.setCustomerId(customer.getCustomerId());
        order.setClase(" ");
        order.setCost(BigDecimal.ZERO);
        order.setCostLast(BigDecimal.ZERO);
        order.setDateTime(new Date());//?
        order.setSourceDate(new Date());//?
        order.setDetailDiscount(BigDecimal.ZERO);
        order.setDiscount(BigDecimal.ZERO);
        order.setEmployeeId(employeeSelect.getEmployeeId());
        order.setExtraDiscount(BigDecimal.ZERO);
        order.setFicDiscount(BigDecimal.ZERO);
        order.setFinance(BigDecimal.ZERO);
        order.setFreight(BigDecimal.ZERO);
        order.setFreight1(BigDecimal.ZERO);
        order.setIceTaxable(BigDecimal.ZERO);
        order.setIceTotal(BigDecimal.ZERO);
        order.setIceValue(BigDecimal.ZERO);
        order.setIvaReturn("N");
        order.setNoComps(0);
        order.setNoTaxValue(BigDecimal.ZERO);
        order.setOrderDate(new Date());
        order.setOrderNumber(BigDecimal.ONE);
        order.setOutDiscount(BigDecimal.ZERO);
        order.setPedidoNumber(BigDecimal.ZERO);
        order.setServiceTax(BigDecimal.ZERO);
        order.setSource(1);
        order.setSourceDate(new Date());
        order.setTaxPerc(1);
        order.setTaxTotal(BigDecimal.ZERO);
        order.setTaxable(BigDecimal.ZERO);
        order.setTipo("FC");
        order.setTotal(BigDecimal.ZERO);
        order.setTotalExento(BigDecimal.ZERO);
        order.setQuotationNumber(BigDecimal.ONE);
        order.setCompanyBodega(orderResp.getCompanyBodega());

        Orders orderLast = ordersDao.ultimoRegistro();
        if (orderLast != null) {
            order.setOrderId(orderLast.getOrderId() + 1);
        } else {
            order.setOrderId(0);
        }

        validarIngresoOrder(order, listOrderLineItems);

        create(order);

    }

    private void validarIngresoOrder(Orders order, List<OrderLineItems> listOrderLineItems) throws EntidadNoGrabadaException {

        if (listOrderLineItems.size() <= 1) {
            throw new EntidadNoGrabadaException("Ingrese productos a la venta");
        }
    }

    @Override
    public void calcularTotalesOrder(List<OrderLineItems> listOrderLineItems, Orders order) {
        BigDecimal totalBruto = BigDecimal.ZERO;
        BigDecimal totalDescuento = BigDecimal.ZERO;
        BigDecimal totalSubtotal = BigDecimal.ZERO;
        BigDecimal totalTax = BigDecimal.ZERO;
        /**
         * Consulta totales de la lista de items sin el ultimo registro ya que
         * es de default
         */
        for (OrderLineItems orderLine : listOrderLineItems.subList(0, listOrderLineItems.size() - 1)) {
            totalDescuento = totalDescuento.add(orderLine.getDiscountValue());
            totalBruto = totalBruto.add(orderLine.getTotalPriceBruto());
            totalSubtotal = totalSubtotal.add(orderLine.getTotalPrice());
            totalTax = totalTax.add(orderLine.getTaxValue());
        }
        order.setDetailDiscount(totalDescuento);
        order.setTaxTotal(totalTax);
        order.setTaxable(totalSubtotal);
        order.setTotalBruto(totalBruto);
        order.setTotal(totalTax.add(totalSubtotal));
    }

}

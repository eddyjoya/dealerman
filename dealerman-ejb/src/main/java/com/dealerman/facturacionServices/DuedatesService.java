package com.dealerman.facturacionServices;

import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.facturacionDao.IDuedatesDao;
import com.dealerman.facturacionServicesUI.IDuedatesService;
import com.dealerman.orders.Duedates;
import com.dealerman.orders.Orders;
import java.math.BigDecimal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author eddie
 */
@Stateless
public class DuedatesService implements IDuedatesService {
    
    @EJB
    IDuedatesDao duedatesDao;
    
    private void guardar(Duedates duedates) throws EntidadNoGrabadaException {
        duedatesDao.create(duedates);
    }
    
    @Override
    public void guardarDuedates(Orders orders) throws EntidadNoGrabadaException {
        Duedates duedates = new Duedates();
        duedates.setOrder(orders);
        duedates.setSubOrder(0);//?
        duedates.setDays(0); //?
        duedates.setVisitBy(orders.getOrderDate());//?
        duedates.setDeliverBy(orders.getOrderDate());//?
        duedates.setTotal(orders.getTotal());
        duedates.setAbono(BigDecimal.ZERO);
        guardar(duedates);
    }
    
}

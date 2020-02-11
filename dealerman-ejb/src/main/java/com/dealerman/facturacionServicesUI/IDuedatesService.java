package com.dealerman.facturacionServicesUI;

import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.orders.Orders;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface IDuedatesService {

    public void guardarDuedates(Orders orders)throws EntidadNoGrabadaException;
}

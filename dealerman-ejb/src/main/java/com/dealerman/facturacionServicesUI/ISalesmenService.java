package com.dealerman.facturacionServicesUI;

import com.dealerman.orders.Salesmen;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface ISalesmenService {

    public List<Salesmen> buscar(Salesmen salesmen);
}

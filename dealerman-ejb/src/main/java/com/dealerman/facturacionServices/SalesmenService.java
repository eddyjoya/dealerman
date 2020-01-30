package com.dealerman.facturacionServices;

import com.dealerman.facturacionDaoUI.ISalesmenDao;
import com.dealerman.facturacionServicesUI.ISalesmenService;
import com.dealerman.orders.Salesmen;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author eddie
 */
@Stateless
public class SalesmenService implements ISalesmenService {

    @EJB
    ISalesmenDao salesmenDao;

    @Override
    public List<Salesmen> buscar(Salesmen salesmen) {
        return salesmenDao.buscar(salesmen);
    }

}

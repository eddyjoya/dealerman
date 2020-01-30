package com.dealerman.facturacionDaoUI;

import com.dealerman.generalDaoUI.IGenericDao;
import com.dealerman.orders.Salesmen;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface ISalesmenDao
        extends IGenericDao<Salesmen, Long> {

    public List<Salesmen> buscar(Salesmen salesmen);
}

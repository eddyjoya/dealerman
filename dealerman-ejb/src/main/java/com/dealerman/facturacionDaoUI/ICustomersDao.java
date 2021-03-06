package com.dealerman.facturacionDaoUI;

import com.dealerman.generalDaoUI.IGenericDao;
import com.dealerman.orders.Customers;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface ICustomersDao
        extends IGenericDao<Customers, Long> {

    public List<Customers> buscar(Customers customers);

}

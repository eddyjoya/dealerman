package com.dealerman.facturacionDaoUI;

import com.dealerman.facturacionDao.IDuedatesDao;
import com.dealerman.generalDao.GenericDao;
import com.dealerman.orders.Duedates;
import javax.ejb.Singleton;

/**
 *
 * @author eddie
 */
@Singleton
public class DuedatesDao extends GenericDao<Duedates, Long>
        implements IDuedatesDao {

    public DuedatesDao() {
        super(Duedates.class);
    }

}

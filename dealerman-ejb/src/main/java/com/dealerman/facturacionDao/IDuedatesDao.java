package com.dealerman.facturacionDao;

import com.dealerman.generalDaoUI.IGenericDao;
import com.dealerman.orders.Duedates;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface IDuedatesDao extends IGenericDao<Duedates, Long> {

}

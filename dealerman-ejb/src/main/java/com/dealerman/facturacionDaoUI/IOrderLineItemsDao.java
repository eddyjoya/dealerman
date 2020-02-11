package com.dealerman.facturacionDaoUI;

import com.dealerman.generalDaoUI.IGenericDao;
import com.dealerman.orders.OrderLineItems;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface IOrderLineItemsDao extends IGenericDao<OrderLineItems, Long> {

}

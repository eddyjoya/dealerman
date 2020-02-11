package com.dealerman.facturacionDao;

import com.dealerman.facturacionDaoUI.IOrderLineItemsDao;
import com.dealerman.generalDao.GenericDao;
import com.dealerman.orders.OrderLineItems;
import javax.ejb.Singleton;

/**
 *
 * @author eddie
 */
@Singleton
public class OrderLineItemsDao extends GenericDao<OrderLineItems, Long>
        implements IOrderLineItemsDao {

    public OrderLineItemsDao() {
        super(OrderLineItems.class);
    }

}

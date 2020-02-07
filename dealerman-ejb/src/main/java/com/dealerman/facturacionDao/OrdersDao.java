package com.dealerman.facturacionDao;

import com.dealerman.facturacionDaoUI.IOrdersDao;
import com.dealerman.generalDao.GenericDao;
import com.dealerman.orders.Orders;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.ejb.Singleton;
import javax.persistence.Query;

/**
 *
 * @author eddie
 */
@Singleton
public class OrdersDao extends GenericDao<Orders, Long>
        implements IOrdersDao {

    public OrdersDao() {
        super(Orders.class);
    }

    @Override
    public List<Orders> buscar(Orders order) {
        StringBuilder sql = new StringBuilder();
        HashMap<Object, Object> parametros = new HashMap();
        sql.append("Select t from Orders t where 1=1");
        if (order.getOrderId() != null) {
            sql.append(" and t.orderId = :orderId");
            parametros.put("orderId", order.getOrderId());
        }

        sql.append(" order by t.orderDate asc");

        Query q = this.em.createQuery(sql.toString());
        for (Object key : parametros.keySet()) {
            q.setParameter((String) key, parametros.get(key));
        }
        try {
            return q.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public Orders ultimoRegistro() {
        StringBuilder sql = new StringBuilder();
        HashMap<Object, Object> parametros = new HashMap();
        sql.append("Select MAX(t) from Orders t");
        Query q = this.em.createQuery(sql.toString());
        for (Object key : parametros.keySet()) {
            q.setParameter((String) key, parametros.get(key));
        }
        try {
            return (Orders) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

}

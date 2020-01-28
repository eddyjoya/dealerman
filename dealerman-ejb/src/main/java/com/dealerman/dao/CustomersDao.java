package com.dealerman.dao;

import com.dealerman.daoUI.ICustomersDao;
import com.dealerman.orders.Customers;
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
public class CustomersDao extends GenericDao<Customers, Long>
        implements ICustomersDao {

    public CustomersDao() {
        super(Customers.class);
    }

    @Override
    public List<Customers> buscar(Customers customers) {
        StringBuilder sql = new StringBuilder();
        HashMap<Object, Object> parametros = new HashMap();
        sql.append("Select t from Customers t where 1=1");
        if (customers.getCustomerId() != null) {
            sql.append(" and t.customerId = :customerId");
            parametros.put("customerId", customers.getCustomerId());
        }
        if (customers.getCompanyName() != null) {
            sql.append(" and LOWER(t.companyName) like :companyName");
            parametros.put("companyName", "%" + customers.getCompanyName() + "%".toLowerCase());
        }
        if (customers.getContactName() != null) {
            sql.append(" and LOWER(t.contactName) like :contactName");
            parametros.put("contactName", "%" + customers.getContactName() + "%".toLowerCase());
        }

        sql.append(" order by t.companyName asc");

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

}

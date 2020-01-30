package com.dealerman.facturacionDao;

import com.dealerman.facturacionDaoUI.ISalesmenDao;
import com.dealerman.generalDao.GenericDao;
import com.dealerman.orders.Salesmen;
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
public class SalesmenDao extends GenericDao<Salesmen, Long>
        implements ISalesmenDao {

    public SalesmenDao() {
        super(Salesmen.class);
    }

    @Override
    public List<Salesmen> buscar(Salesmen salesmen) {
        StringBuilder sql = new StringBuilder();
        HashMap<Object, Object> parametros = new HashMap();
        sql.append("Select t from Salesmen t where 1=1");
        if (salesmen.getSalesmanId() != null) {
            sql.append(" and t.salesmanId = :salesmanId");
            parametros.put("salesmanId", salesmen.getSalesmanId());
        }
        if (salesmen.getFirstName() != null) {
            sql.append(" and LOWER(t.firstName) = :firstName");
            parametros.put("firstName", salesmen.getFirstName().toLowerCase());
        }
        if (salesmen.getLastName() != null) {
            sql.append(" and LOWER(t.lastName) = :lastName");
            parametros.put("lastName", salesmen.getLastName().toLowerCase());
        }
        sql.append(" order by t.firstName asc");

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

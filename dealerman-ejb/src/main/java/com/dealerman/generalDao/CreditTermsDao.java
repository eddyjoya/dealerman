package com.dealerman.generalDao;

import com.dealerman.general.CreditTerms;
import com.dealerman.generalDaoUI.ICreditTermsDao;
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
public class CreditTermsDao extends GenericDao<CreditTerms, Long>
        implements ICreditTermsDao {

    public CreditTermsDao() {
        super(CreditTerms.class);
    }

    @Override
    public List<CreditTerms> buscar(CreditTerms creditTerms) {
        StringBuilder sql = new StringBuilder();
        HashMap<Object, Object> parametros = new HashMap();
        sql.append("Select t from CreditTerms t where 1=1");
        if (creditTerms.getCompanyId() != null) {
            sql.append(" and t.companyId = :companyId");
            parametros.put("companyId", creditTerms.getCompanyId());
        }
        if (creditTerms.getDescription() != null) {
            sql.append(" and t.description = :description");
            parametros.put("description", creditTerms.getDescription());
        }

        sql.append(" order by t.description asc");
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

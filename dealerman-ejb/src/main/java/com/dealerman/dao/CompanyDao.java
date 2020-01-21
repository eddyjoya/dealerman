package com.dealerman.dao;

import com.dealerman.daoUI.ICompanyDao;
import com.dealerman.general.Company;
import java.io.Serializable;
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
public class CompanyDao extends GenericDao<Company, Long>
        implements ICompanyDao, Serializable {

    public CompanyDao() {
        super(Company.class);
    }

    @Override
    public List<Company> buscar(Company company) {
        StringBuilder sql = new StringBuilder();
        HashMap<Object, Object> parametros = new HashMap();
        sql.append("Select t from Company t where 1=1");
        if (company.getCompanyId() != null) {
            sql.append(" and t.companyId = :companyId");
            parametros.put("companyId", company.getCompanyId());
        }
        sql.append(" order by t.companyId asc");
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

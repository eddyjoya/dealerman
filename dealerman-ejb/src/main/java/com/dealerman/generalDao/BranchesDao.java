package com.dealerman.generalDao;

import com.dealerman.generalDaoUI.IBranchesDao;
import com.dealerman.general.Branches;
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
public class BranchesDao
        extends GenericDao<Branches, Long>
        implements IBranchesDao {

    public BranchesDao() {
        super(Branches.class);
    }

    @Override
    public List<Branches> buscar(Branches branches) {
        StringBuilder sql = new StringBuilder();
        HashMap<Object, Object> parametros = new HashMap();
        sql.append("Select t from Branches t where 1=1");

        if (branches.getCompany() != null) {
            sql.append(" and t.company = :company");
            parametros.put("company", branches.getCompany());
        }
        if (branches.getBodegaId() != null) {
            sql.append(" and t.bodegaId = :bodegaId");
            parametros.put("bodegaId", branches.getBodegaId());
        }
        sql.append(" order by t.bodegaName asc");
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

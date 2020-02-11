package com.dealerman.productionDao;

import com.dealerman.general.Branches;
import com.dealerman.generalDao.GenericDao;
import com.dealerman.production.CostCenters;
import com.dealerman.productionDaoUI.ICostCentersDao;
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
public class CostCentersDao extends GenericDao<CostCenters, Long>
        implements ICostCentersDao {

    public CostCentersDao() {
        super(CostCenters.class);
    }

    @Override
    public List<CostCenters> buscar(CostCenters costCenter) {
        StringBuilder sql = new StringBuilder();
        HashMap<Object, Object> parametros = new HashMap();
        sql.append("Select t from CostCenters t where 1=1");
        if (costCenter.getJobId() != null) {
            sql.append(" and t.jobId = :jobId");
            parametros.put("jobId", costCenter.getJobId());
        }
        if (costCenter.getCompanyId() != null) {
            sql.append(" and t.companyId = :companyId");
            parametros.put("companyId", costCenter.getCompanyId());
        }

        sql.append(" order by t.jobName asc");

        Query q = this.em.createQuery(sql.toString());
        for (Object key : parametros.keySet()) {
            q.setParameter((String) key, parametros.get(key));
        }
        try {
            return q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    @Override
    public CostCenters buscarCostCenterFromBranch(Branches branch) {
        StringBuilder sql = new StringBuilder();
        HashMap<String, Object> parametros = new HashMap();
        sql.append("Select t from CostCenters t where t.jobId = :jobId"
                + " and t.companyId = :companyId");
        parametros.put("companyId", branch.getCompany().getCompanyId());
        parametros.put("jobId", branch.getJobId());

        Query q = this.em.createQuery(sql.toString());
        for (String key : parametros.keySet()) {
            q.setParameter(key, parametros.get(key));
        }
        q.setMaxResults(1);
        try {
            return (CostCenters) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}

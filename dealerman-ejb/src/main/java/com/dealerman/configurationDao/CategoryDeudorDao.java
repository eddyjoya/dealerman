package com.dealerman.configurationDao;

import com.dealerman.configuration.CategoryDeudor;
import com.dealerman.configurationDaoUI.ICategoryDeudorDao;
import com.dealerman.generalDao.GenericDao;
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
public class CategoryDeudorDao extends GenericDao<CategoryDeudor, Long>
        implements ICategoryDeudorDao {

    public CategoryDeudorDao() {
        super(CategoryDeudor.class);
    }

    @Override
    public List<CategoryDeudor> buscar(CategoryDeudor categoryDeudor) {
        StringBuilder sql = new StringBuilder();
        HashMap<Object, Object> parametros = new HashMap();
        sql.append("Select t from CategoryDeudor t where 1=1");
        if (categoryDeudor.getCategoryId() != null) {
            sql.append(" and t.categoryId = :categoryId");
            parametros.put("categoryId", categoryDeudor.getCategoryId());
        }
        if (categoryDeudor.getAplicacion() != null) {
            sql.append(" and t.aplicacion = :aplicacion");
            parametros.put("aplicacion", categoryDeudor.getAplicacion());
        }
        if (categoryDeudor.getCategoryName() != null) {
            sql.append(" and t.categoryName = :categoryName");
            parametros.put("categoryName", categoryDeudor.getCategoryName());
        }
        sql.append(" order by t.categoryName asc");
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

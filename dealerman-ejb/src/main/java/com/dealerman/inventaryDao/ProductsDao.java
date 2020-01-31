package com.dealerman.inventaryDao;

import com.dealerman.generalDao.GenericDao;
import com.dealerman.inventary.Products;
import com.dealerman.inventaryDaoUI.IProductsDao;
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
public class ProductsDao extends GenericDao<Products, Long>
        implements IProductsDao {

    public ProductsDao() {
        super(Products.class);
    }

    @Override
    public List<Products> buscar(Products product) {
        StringBuilder sql = new StringBuilder();
        HashMap<Object, Object> parametros = new HashMap();
        sql.append("Select t from Products t where 1=1");
        if (product.getProductId() != null) {
            sql.append(" and t.productId = :productId");
            parametros.put("productId", product.getProductId());
        }
        if (product.getAlterno() != null) {
            sql.append(" and t.alterno = :alterno");
            parametros.put("alterno", product.getAlterno());
        }

        if (product.getProductName() != null) {
            sql.append(" and LOWER(t.productName) like :productName");
            parametros.put("productName", "%" + product.getProductName() + "%".toLowerCase());
        }
        sql.append(" order by t.productName asc");

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

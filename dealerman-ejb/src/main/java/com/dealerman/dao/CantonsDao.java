/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.dao;

import com.dealerman.general.Cantons;
import javax.ejb.Singleton;
import com.dealerman.daoUI.ICantonsDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author eddie
 */
@Singleton
public class CantonsDao extends GenericDao<Cantons, Long>
        implements ICantonsDao {

    public CantonsDao() {
        super(Cantons.class);
    }

    @Override
    public List<Cantons> buscar(Cantons canton) {
        StringBuilder sql = new StringBuilder();
        HashMap<Object, Object> parametros = new HashMap();
        sql.append("Select t from Cantons t where 1=1");
        if (canton.getProvinceId() != null) {
            sql.append(" and t.provinceId = :provinceId");
            parametros.put("provinceId", canton.getProvinceId());
        }
        if (canton.getCantonId() != null) {
            sql.append(" and t.cantonId = :cantonId");
            parametros.put("cantonId", canton.getCantonId());
        }
        if (canton.getCantonName() != null) {
            sql.append(" and t.cantonName = :cantonName");
            parametros.put("cantonName", canton.getCantonName());
        }
        sql.append(" order by t.cantonName asc");
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

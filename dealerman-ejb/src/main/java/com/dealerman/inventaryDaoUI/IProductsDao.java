package com.dealerman.inventaryDaoUI;

import com.dealerman.generalDaoUI.IGenericDao;
import com.dealerman.inventary.Products;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface IProductsDao
        extends IGenericDao<Products, Long> {

    public List<Products> buscar(Products product);
}

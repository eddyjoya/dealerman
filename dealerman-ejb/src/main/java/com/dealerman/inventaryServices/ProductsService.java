package com.dealerman.inventaryServices;

import com.dealerman.inventary.Products;
import com.dealerman.inventaryDaoUI.IProductsDao;
import com.dealerman.inventaryServicesUI.IProductsService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author eddie
 */
@Stateless
public class ProductsService implements IProductsService {

    @EJB
    IProductsDao productsDao;

    @Override
    public List<Products> buscar(Products product) {
        return productsDao.buscar(product);
    }

}

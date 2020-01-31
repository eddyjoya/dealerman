package com.dealerman.inventaryServicesUI;

import com.dealerman.inventary.Products;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface IProductsService {

    public List<Products> buscar(Products product);
}

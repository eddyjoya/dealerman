package com.dealerman.inventaryServices;

import com.dealerman.enumerator.BusquedaProductsEnum;
import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.inventary.Products;
import com.dealerman.inventaryDaoUI.IProductsDao;
import com.dealerman.inventaryServicesUI.IProductsService;
import com.dealerman.utils.UtilsGlobal;
import java.util.ArrayList;
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

    @Override
    public List<Products> busquedaCoinciendia(String buscar) throws EntidadNoGrabadaException {
        List<Products> lista = null;
        if (UtilsGlobal.busquedaXPunto(buscar)) {
            buscar = buscar.substring(1, buscar.length());
            return productsDao.buscar(new Products(null, buscar));
        } else if (buscar.length() > 0) { // Busca por código del producto
            lista = productsDao.buscar(new Products(buscar, null));
            if (lista.isEmpty()) {
                throw new EntidadNoGrabadaException("¡Código no existente!");
            }
        }
        return lista;
    }

    @Override
    public List<Products> buscarFiltroCoinciendia(String buscar, BusquedaProductsEnum filtro) {
        switch (filtro) {
            case Código:
                return productsDao.buscar(new Products(buscar, null));
            case Nombre:
                return productsDao.buscar(new Products(null, buscar));
            default:
                return new ArrayList<>();
        }
    }

}

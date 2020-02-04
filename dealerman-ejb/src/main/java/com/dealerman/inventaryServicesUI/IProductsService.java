package com.dealerman.inventaryServicesUI;

import com.dealerman.enumerator.BusquedaProductsEnum;
import com.dealerman.exceptions.EntidadNoGrabadaException;
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

    public List<Products> busquedaCoinciendia(String buscar) throws EntidadNoGrabadaException;

    public List<Products> buscarFiltroCoinciendia(String buscar, BusquedaProductsEnum filtro);
}

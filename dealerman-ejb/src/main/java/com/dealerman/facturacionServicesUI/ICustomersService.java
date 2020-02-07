package com.dealerman.facturacionServicesUI;

import com.dealerman.enumerator.BusquedaCustomersEnum;
import com.dealerman.enumerator.CategoryDeudorEnum;
import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.orders.Customers;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface ICustomersService {

    public List<Customers> buscar(Customers customers);

    public void guardarCustomers(Customers customer, CategoryDeudorEnum tipoCategory) throws EntidadNoGrabadaException;

    public void actualizarCustomers(Customers customer) throws EntidadNoGrabadaException;

    public List<Customers> busquedaCoinciendia(String buscar, CategoryDeudorEnum tipoCategory) throws EntidadNoGrabadaException;

    public List<Customers> buscarFiltroCoinciendia(String buscar, BusquedaCustomersEnum filtro, CategoryDeudorEnum tipoCategory);
}

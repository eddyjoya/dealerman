package com.dealerman.facturacionServices;

import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.facturacionDaoUI.ICustomersDao;
import com.dealerman.orders.Customers;
import com.dealerman.facturacionServicesUI.ICustomersService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author eddie
 */
@Stateless
public class CustomersService implements ICustomersService {

    @EJB
    ICustomersDao customersDao;

    @Override
    public List<Customers> buscar(Customers customers) {
        return customersDao.buscar(customers);
    }

    private void create(Customers customers) throws EntidadNoGrabadaException {
        customers.setDiscontinued(false);
        customers.setAdded(true);
        customers.setModified(false);
        customersDao.create(customers);
    }

    private void update(Customers customers) throws EntidadNoGrabadaException {
        customers.setDiscontinued(false);
        customers.setAdded(false);
        customers.setModified(true);
        customersDao.create(customers);
    }

    @Override
    public void guardarCustomers(Customers customer) throws EntidadNoGrabadaException {
        validateInfoCustomers(customer);
        create(customer);
    }

    private void validateInfoCustomers(Customers customer) throws EntidadNoGrabadaException {
        List<Customers> listRespuesta = customersDao.buscar(new Customers(customer.getCustomerId(), customer.getCedula()));
        if (!listRespuesta.isEmpty()) {
            throw new EntidadNoGrabadaException("Ya exite un registro con los datos ingresados");
        }
        if ((customer.geteMail() == null) || (customer.geteMail().trim().isEmpty())) {
            throw new EntidadNoGrabadaException("Ingrese un correo válido");
        }
    }

    @Override
    public void actualizarCustomers(Customers customer) throws EntidadNoGrabadaException {

    }

}

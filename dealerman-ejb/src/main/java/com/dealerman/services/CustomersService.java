package com.dealerman.services;

import com.dealerman.daoUI.ICustomersDao;
import com.dealerman.orders.Customers;
import com.dealerman.servicesUI.ICustomersService;
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


}

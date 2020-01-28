package com.dealerman.servicesUI;

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

}

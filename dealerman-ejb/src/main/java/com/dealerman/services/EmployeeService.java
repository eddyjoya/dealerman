package com.dealerman.services;

import com.dealerman.configuration.Employee;
import com.dealerman.daoUI.IEmployeeDao;
import com.dealerman.servicesUI.IEmployeeService;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author eddie
 */
@Stateless
public class EmployeeService implements IEmployeeService {

    private static final Logger LOG = Logger.getLogger(EmployeeService.class.getName());
    @EJB
    IEmployeeDao employeeDao;

    @Override
    public List<Employee> buscar(Employee employee) {
        return employeeDao.buscar(employee);
    }
}

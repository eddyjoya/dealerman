package com.dealerman.servicesUI;

import com.dealerman.configuration.Employee;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface IEmployeeService {

    public List<Employee> buscar(Employee employee);
}

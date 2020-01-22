package com.dealerman.daoUI;

import com.dealerman.configuration.Employee;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface IEmployeeDao
        extends IGenericDao<Employee, Long> {

    public List<Employee> buscar(Employee employee);
}

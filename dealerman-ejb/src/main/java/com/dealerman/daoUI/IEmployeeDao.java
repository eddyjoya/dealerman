package com.dealerman.daoUI;

import com.dealerman.configuration.Employee;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface IEmployeeDao
        extends IGenericDao<Employee, Long> {

}

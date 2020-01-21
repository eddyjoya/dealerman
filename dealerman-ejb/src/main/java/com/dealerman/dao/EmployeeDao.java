package com.dealerman.dao;

import com.dealerman.configuration.Employee;
import com.dealerman.daoUI.IEmployeeDao;
import javax.ejb.Singleton;

/**
 *
 * @author eddie
 */
@Singleton
public class EmployeeDao extends GenericDao<Employee, Long>
        implements IEmployeeDao {

    public EmployeeDao() {
        super(Employee.class);
    }

}

package com.dealerman.dao;

import com.dealerman.configuration.Employee;
import com.dealerman.daoUI.IEmployeeDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.ejb.Singleton;
import javax.persistence.Query;

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

    @Override
    public List<Employee> buscar(Employee employee) {
        StringBuilder sql = new StringBuilder();
        HashMap<Object, Object> parametros = new HashMap();
        sql.append("Select t from Employee t where 1=1");
        if (employee.getEmployeeId() != null) {
            sql.append(" and t.employeeId = :employeeId");
            parametros.put("employeeId", employee.getEmployeeId());
        }
        if (employee.getLastName() != null) {
            sql.append(" and t.lastName = :lastName");
            parametros.put("lastName", employee.getLastName());
        }
        if (employee.getFirstName() != null) {
            sql.append(" and t.firstName = :firstName");
            parametros.put("firstName", employee.getFirstName());
        }
        if (employee.getAllowed() != null) {
            sql.append(" and t.allowed = :allowed");
            parametros.put("allowed", employee.getAllowed());
        }
        sql.append(" order by t.lastName asc");
        Query q = this.em.createQuery(sql.toString());
        for (Object key : parametros.keySet()) {
            q.setParameter((String) key, parametros.get(key));
        }
        try {
            return q.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

}

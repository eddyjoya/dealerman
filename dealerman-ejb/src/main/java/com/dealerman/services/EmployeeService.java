package com.dealerman.services;

import com.dealerman.servicesUI.IEmployeeService;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author eddie
 */
@Stateless
public class EmployeeService implements IEmployeeService {

    private static final Logger LOG = Logger.getLogger(EmployeeService.class.getName());
}

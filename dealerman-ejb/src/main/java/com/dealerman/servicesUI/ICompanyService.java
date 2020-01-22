package com.dealerman.servicesUI;

import com.dealerman.general.Company;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface ICompanyService {

    public List<Company> buscar(Company company);
}

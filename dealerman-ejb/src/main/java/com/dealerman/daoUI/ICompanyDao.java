package com.dealerman.daoUI;

import com.dealerman.general.Company;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface ICompanyDao
        extends IGenericDao<Company, Long> {

    public List<Company> buscar(Company company);
}

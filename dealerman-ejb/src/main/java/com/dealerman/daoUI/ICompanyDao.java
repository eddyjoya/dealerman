package com.dealerman.daoUI;

import com.dealerman.general.Company;
import java.util.List;

/**
 *
 * @author eddie
 */
public interface ICompanyDao
        extends IGenericDao<Company, Long> {

    public List<Company> buscar(Company company);
}

package com.dealerman.services;

import com.dealerman.daoUI.ICompanyDao;
import com.dealerman.general.Company;
import com.dealerman.servicesUI.ICompanyService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author eddie
 */
@Stateless
public class CompanyService implements ICompanyService {

    @EJB
    ICompanyDao companyDao;

    @Override
    public List<Company> buscar(Company company) {
        return companyDao.buscar(company);
    }
}

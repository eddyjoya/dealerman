package com.dealerman.generalServices;

import com.dealerman.generalDaoUI.ICompanyDao;
import com.dealerman.general.Company;
import com.dealerman.generalServicesUI.ICompanyService;
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

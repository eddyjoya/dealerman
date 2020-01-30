package com.dealerman.generalServices;

import com.dealerman.general.CreditTerms;
import com.dealerman.generalDaoUI.ICreditTermsDao;
import com.dealerman.generalServicesUI.ICreditTermsService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author eddie
 */
@Stateless
public class CreditTermsService implements ICreditTermsService {

    @EJB
    ICreditTermsDao creditTermsDao;

    @Override
    public List<CreditTerms> buscar(CreditTerms creditTerms) {
        return creditTermsDao.buscar(creditTerms);
    }

}

package com.dealerman.generalDaoUI;

import com.dealerman.general.CreditTerms;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface ICreditTermsDao
        extends IGenericDao<CreditTerms, Long> {

    public List<CreditTerms> buscar(CreditTerms creditTerms);
}

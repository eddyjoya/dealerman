package com.dealerman.generalServicesUI;

import com.dealerman.general.CreditTerms;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface ICreditTermsService {

    public List<CreditTerms> buscar(CreditTerms creditTerms);
}

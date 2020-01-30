package com.dealerman.configurationDaoUI;

import com.dealerman.configuration.CategoryDeudor;
import com.dealerman.generalDaoUI.IGenericDao;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface ICategoryDeudorDao
        extends IGenericDao<CategoryDeudor, Long> {

    public List<CategoryDeudor> buscar(CategoryDeudor categoryDeudor);
}

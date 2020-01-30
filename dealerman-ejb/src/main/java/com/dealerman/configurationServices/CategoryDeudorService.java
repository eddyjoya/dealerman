package com.dealerman.configurationServices;

import com.dealerman.configuration.CategoryDeudor;
import com.dealerman.configurationDaoUI.ICategoryDeudorDao;
import com.dealerman.configurationServicesUI.ICategoryDeudorService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author eddie
 */
@Stateless
public class CategoryDeudorService implements ICategoryDeudorService {

    @EJB
    ICategoryDeudorDao categoryDeudorDao;

    @Override
    public List<CategoryDeudor> buscar(CategoryDeudor categoryDeudor) {
        return categoryDeudorDao.buscar(categoryDeudor);
    }

}

package com.dealerman.configurationServicesUI;

import com.dealerman.configuration.CategoryDeudor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface ICategoryDeudorService {

    public List<CategoryDeudor> buscar(CategoryDeudor categoryDeudor);
}

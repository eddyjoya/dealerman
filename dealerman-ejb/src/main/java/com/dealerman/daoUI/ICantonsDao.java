package com.dealerman.daoUI;

import com.dealerman.general.Cantons;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface ICantonsDao
        extends IGenericDao<Cantons, Long> {

    public List<Cantons> buscar(Cantons cantons);
}

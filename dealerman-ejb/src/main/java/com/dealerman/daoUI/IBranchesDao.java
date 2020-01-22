package com.dealerman.daoUI;

import com.dealerman.general.Branches;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface IBranchesDao
        extends IGenericDao<Branches, Long> {

    public List<Branches> buscar(Branches branches);
}

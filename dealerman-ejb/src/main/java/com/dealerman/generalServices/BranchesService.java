package com.dealerman.generalServices;

import com.dealerman.generalDaoUI.IBranchesDao;
import com.dealerman.general.Branches;
import com.dealerman.generalServicesUI.IBranchesService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author eddie
 */
@Stateless
public class BranchesService implements IBranchesService {

    @EJB
    IBranchesDao branchesDao;

    @Override
    public List<Branches> buscar(Branches branches) {
        return branchesDao.buscar(branches);
    }

}

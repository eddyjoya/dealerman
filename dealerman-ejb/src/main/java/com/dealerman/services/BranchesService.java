package com.dealerman.services;

import com.dealerman.daoUI.IBranchesDao;
import com.dealerman.general.Branches;
import com.dealerman.servicesUI.IBranchesService;
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

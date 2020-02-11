package com.dealerman.productionDaoUI;

import com.dealerman.general.Branches;
import com.dealerman.generalDaoUI.IGenericDao;
import com.dealerman.production.CostCenters;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface ICostCentersDao
        extends IGenericDao<CostCenters, Long> {

    public List<CostCenters> buscar(CostCenters costCenter);

    public CostCenters buscarCostCenterFromBranch(Branches branch);
}

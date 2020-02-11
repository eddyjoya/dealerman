package com.dealerman.productionServices;

import com.dealerman.production.CostCenters;
import com.dealerman.productionDaoUI.ICostCentersDao;
import com.dealerman.productionServicesUI.ICostCentersService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author eddie
 */
@Stateless
public class CostCentersService implements ICostCentersService {

    @EJB
    ICostCentersDao costCentersDao;

    @Override
    public List<CostCenters> buscar(CostCenters costCenter) {
        return costCentersDao.buscar(costCenter);
    }

}

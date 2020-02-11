package com.dealerman.productionServicesUI;

import com.dealerman.production.CostCenters;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface ICostCentersService {

    public List<CostCenters> buscar(CostCenters costCenter);
}

package com.dealerman.generalServicesUI;

import com.dealerman.general.Branches;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface IBranchesService {

    public List<Branches> buscar(Branches branches);
}

package com.dealerman.facturacionDaoUI;

import com.dealerman.generalDaoUI.IGenericDao;
import com.dealerman.orders.Orders;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface IOrdersDao extends IGenericDao<Orders, Long> {

    public List<Orders> buscar(Orders order);

    public Orders ultimoRegistro();
}

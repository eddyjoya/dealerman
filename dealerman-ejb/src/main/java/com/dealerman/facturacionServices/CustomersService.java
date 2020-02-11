package com.dealerman.facturacionServices;

import com.dealerman.configuration.CategoryDeudor;
import com.dealerman.configurationDaoUI.ICategoryDeudorDao;
import com.dealerman.enumerator.BusquedaCustomersEnum;
import com.dealerman.enumerator.CategoryDeudorEnum;
import com.dealerman.enumerator.CreditTermsEnum;
import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.facturacionDaoUI.ICustomersDao;
import com.dealerman.facturacionDaoUI.ISalesmenDao;
import com.dealerman.orders.Customers;
import com.dealerman.facturacionServicesUI.ICustomersService;
import com.dealerman.general.CreditTerms;
import com.dealerman.generalDaoUI.ICreditTermsDao;
import com.dealerman.orders.Salesmen;
import com.dealerman.utils.UtilsGlobal;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author eddie
 */
@Stateless
public class CustomersService implements ICustomersService {

    @EJB
    ICustomersDao customersDao;
    @EJB
    ICategoryDeudorDao categoryDeudorDao;
    @EJB
    ISalesmenDao salesmenDao;
    @EJB
    ICreditTermsDao creditTermsDao;

    @Override
    public List<Customers> buscar(Customers customers) {
        return customersDao.buscar(customers);
    }

    private void create(Customers customers) throws EntidadNoGrabadaException {
        customers.setDiscontinued(false);
        customers.setAdded(true);
        customers.setModified(false);
        customersDao.create(customers);
    }

    private void update(Customers customers) throws EntidadNoGrabadaException {
        customers.setDiscontinued(false);
        customers.setAdded(false);
        customers.setModified(true);
        customersDao.update(customers);
    }

    private CategoryDeudor buscarCategoryDeudor(CategoryDeudorEnum tipoCategory) {
        return categoryDeudorDao.buscar(new CategoryDeudor(tipoCategory.getAplicacion(), tipoCategory.getNombre())).get(0);
    }

    @Override
    public void guardarCustomers(Customers customer, CategoryDeudorEnum tipoCategory) throws EntidadNoGrabadaException {
        if (customer.getAdded() == null) {
            CategoryDeudor categoryDeudorEncontrado = buscarCategoryDeudor(tipoCategory);
            validateInfoCustomers(customer, categoryDeudorEncontrado);
            Salesmen salesmenEncontrado = salesmenDao.buscar(new Salesmen()).get(0);//??
            CreditTerms crediTermsEncontrado = creditTermsDao.buscar(new CreditTerms(CreditTermsEnum.CONTADO.getNombre())).get(0);

            customer.setCategoryDeudor(categoryDeudorEncontrado);
            customer.setAplicacion(categoryDeudorEncontrado.getAplicacion());
            customer.setCarNumber(BigDecimal.ZERO);
            customer.setLocalId(customer.getBranchSelect().getLocalId());//?
            customer.setIssueId(customer.getBranchSelect().getIssueId());//?
            customer.setCompanyId(customer.getBranchSelect().getCompany().getCompanyId());
            customer.setCreated(new Date());
            customer.setDemanda(BigDecimal.ZERO);
            customer.setMaximun(BigDecimal.ZERO);
            customer.setMinimun(BigDecimal.ZERO);
            customer.setUnlocked(true);
            customer.setCompany(false);
            customer.setPassport(false);
            customer.setShipToNo(BigDecimal.ONE);
            customer.setCreditCard(false);
            customer.setSupplierTerms(BigDecimal.ZERO);
            customer.setMaxOrderAmt(BigDecimal.ZERO);
            customer.setMinOrderAmt(BigDecimal.ZERO);
            customer.setPriceType(BigDecimal.ONE);
            customer.setPayTax(true);
            customer.setDiscount(BigDecimal.ZERO);
            customer.setDollarsDebt(BigDecimal.ZERO);
            customer.setEmployeeId(customer.getEmployeeSelect().getEmployeeId());
            customer.setSalesmen(salesmenEncontrado);//?
            customer.setCreditTerms(crediTermsEncontrado);
            customer.setCtype(BigDecimal.ONE); //?
            create(customer);
        } else {
            update(customer);
        }
    }

    @Override
    public void actualizarCustomers(Customers customer) throws EntidadNoGrabadaException {
        update(customer);
    }

    private void validateInfoCustomers(Customers customer, CategoryDeudor categoryDeudorEncontrado) throws EntidadNoGrabadaException {

        List<Customers> listRespuesta = customersDao.buscar(new Customers(customer.getCustomerId(), customer.getCedula(), categoryDeudorEncontrado));
        if (!listRespuesta.isEmpty()) {
            throw new EntidadNoGrabadaException("Ya exite un registro con los datos ingresados");
        }
        if ((customer.geteMail() == null) || (customer.geteMail().trim().isEmpty())) {
            throw new EntidadNoGrabadaException("Ingrese un correo válido");
        }
    }

    @Override
    public List<Customers> busquedaCoinciendia(String buscar, CategoryDeudorEnum tipoCategory) throws EntidadNoGrabadaException {
        List<Customers> lista = null;
        CategoryDeudor categoryDeudorEncontrado = buscarCategoryDeudor(tipoCategory);
        if (UtilsGlobal.isNumeric(buscar)) {
            if (buscar.length() < 10) { // Busca por codigo del cliente
                lista = customersDao.buscar(new Customers(buscar, null, categoryDeudorEncontrado));
                if (lista.isEmpty()) {
                    throw new EntidadNoGrabadaException("¡Código no existente!");
                }
            }
            if ((buscar.length() >= 10) && (buscar.length() <= 13)) { // Valida y busca por cédula o ruc
                lista = customersDao.buscar(new Customers(null, buscar, categoryDeudorEncontrado));
                if (lista.isEmpty()) {
                    try {
                        if (UtilsGlobal.validadorDeCedula(buscar)) { //En el que caso que no exista procede a crear un nuevo cliente
                            return null;
                        }
                    } catch (EntidadNoGrabadaException ex) {
                        throw new EntidadNoGrabadaException(ex.getMessage());
                    }
                }
            }
        } else if (buscar.length() > 0) { // Busca coincidencias por nombres
            lista = customersDao.buscar(new Customers(null, buscar, null, categoryDeudorEncontrado));
        }
        return lista;
    }

    @Override
    public List<Customers> buscarFiltroCoinciendia(String buscar, BusquedaCustomersEnum filtro, CategoryDeudorEnum tipoCategory) {
        CategoryDeudor categoryDeudorEncontrado = buscarCategoryDeudor(tipoCategory);
        switch (filtro) {
            case Nombre:
                return customersDao.buscar(new Customers(null, buscar, null, categoryDeudorEncontrado));
            case Contacto:
                return customersDao.buscar(new Customers(null, null, buscar, categoryDeudorEncontrado));
            default:
                return new ArrayList<>();
        }
    }

}

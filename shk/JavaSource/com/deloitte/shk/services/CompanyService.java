package com.deloitte.shk.services;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.deloitte.shk.dao.CompanyDAO;
import com.deloitte.shk.entity.Company;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class CompanyService implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject CompanyDAO companyDAO;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void save(Company instance) {
		companyDAO.save(instance);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void remove(Company instance) {
		companyDAO.remove(instance);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void update(Company instance) {
		companyDAO.update(instance);
	}

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<Company> list() {
		return companyDAO.list();
	}
}

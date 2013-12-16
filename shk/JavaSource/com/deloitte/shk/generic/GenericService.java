package com.deloitte.shk.generic;

import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
/**
 * @author yusufertekin
 *
 */
public abstract class GenericService<E extends GenericEntity, A> {

	public abstract GenericDAO<E, A> getEntityDAO();

	public E findByDonemAndCompany(Donem donem, Company company)
	{
		return getEntityDAO().findByDonemAndCompany(donem, company);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void save(E instance) {
		getEntityDAO().save(instance);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void remove(E instance) {
		getEntityDAO().remove(instance);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void update(E instance) {
		getEntityDAO().update(instance);
	}

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<E> list() {
		return getEntityDAO().list();
	}
	
	@SuppressWarnings("unchecked")
	public E clone(E instance) throws CloneNotSupportedException
	{
		E clone = (E) instance.clone();
		clone.setEntityId(null);
		return clone;
	}
	
	public E findById(A id)
	{
		return getEntityDAO().findById(id);
	}
}

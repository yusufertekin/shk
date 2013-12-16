package com.deloitte.shk.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import com.deloitte.shk.entity.Company;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class CompanyDAO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext (type = PersistenceContextType.EXTENDED)
	protected EntityManager em;

	@TransactionAttribute(TransactionAttributeType.MANDATORY)
	public void save(Company instance) {
		em.persist(instance);
	}

	@TransactionAttribute(TransactionAttributeType.MANDATORY)
	public void remove(Company instance) {
//		instance = em.merge(instance);
		em.remove(instance);
	}

	@TransactionAttribute(TransactionAttributeType.MANDATORY)
	public void update(Company instance) {
		em.merge(instance);
	}

	@SuppressWarnings("unchecked")
	public List<Company> list() {
		Query query = em.createQuery(getQuery());
		return query.getResultList();
	}
	public String getQuery(){
		return "from Company ";
	}
	
	
}

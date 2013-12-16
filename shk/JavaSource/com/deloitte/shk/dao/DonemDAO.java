package com.deloitte.shk.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.generic.GenericDAO;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class DonemDAO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private final String HQL_FIND_BY_DONEM = "from Donem t where t.donemDate = :donem ";
	
	public Donem findByDonem(Date donem)
	{
		List list = em.createQuery(HQL_FIND_BY_DONEM)
				.setParameter("donem", donem)
				.getResultList();
		if(list != null && list.size() > 0)
		{
			return (Donem)list.get(0);
		}
		else
		{
			return null;
		}
	}
	@PersistenceContext (type = PersistenceContextType.EXTENDED)
	protected EntityManager em;

	@TransactionAttribute(TransactionAttributeType.MANDATORY)
	public void save(Donem instance) {
		em.persist(instance);
	}

	@TransactionAttribute(TransactionAttributeType.MANDATORY)
	public void remove(Donem instance) {
//		instance = em.merge(instance);
		em.remove(instance);
	}

	@TransactionAttribute(TransactionAttributeType.MANDATORY)
	public void update(Donem instance) {
		em.merge(instance);
	}

	@SuppressWarnings("unchecked")
	public List<Donem> list() {
		Query query = em.createQuery(getQuery());
		return query.getResultList();
	}
	public String getQuery(){
		return "from Donem ";
	}
	
}

package com.deloitte.shk.generic;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Dipnot;
import com.deloitte.shk.entity.Donem;

/**
 * @author yusufertekin
 *
 */
public abstract class GenericDAO<E extends GenericEntity, A> implements Serializable{
	
	Class<E> cls;
	
	@SuppressWarnings("unchecked")
	public GenericDAO(){
		Type genericSuperclass = getClass().getGenericSuperclass();
		if(genericSuperclass instanceof ParameterizedType){
			this.cls = (Class<E>) ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
		}
       
	}
	
	@SuppressWarnings("unchecked")
	public E findByDonemAndCompany(Donem donem, Company company)
	{
		List list = em.createQuery(getHql())
				.setParameter("donem", donem)
				.setParameter("company", company)
				.getResultList();
		if(list != null && list.size() > 0)
		{
			return (E)list.get(0);
		}
		else
		{
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public Dipnot findDipnotByDonemAndCompany(Donem donem, Company company, Long sayfaNo)
	{
		List list = em.createQuery(getDipnotHql())
				.setParameter("donem", donem)
				.setParameter("company", company)
				.setParameter("sayfaNo", sayfaNo)
				.getResultList();
		if(list != null && list.size() > 0)
		{
			return (Dipnot)list.get(0);
		}
		else
		{
			return null;
		}
	}

	@PersistenceContext (type = PersistenceContextType.EXTENDED)
	protected EntityManager em;

	@TransactionAttribute(TransactionAttributeType.MANDATORY)
	public void save(E instance) {
		em.persist(instance);
	}

	@TransactionAttribute(TransactionAttributeType.MANDATORY)
	public void remove(E instance) {
//		instance = em.merge(instance);
		em.remove(instance);
	}

	@TransactionAttribute(TransactionAttributeType.MANDATORY)
	public void update(E instance) {
		em.merge(instance);
	}

	@SuppressWarnings("unchecked")
	public List<E> list() {
		Query query = em.createQuery(getQuery());
		return query.getResultList();
	}
	
	public E findById(A id){
		return em.find(cls, id);
	}
	
	public String getQuery(){
		return "from " + cls.getSimpleName();
	}
	
	public String getHql()
	{
		return "from " + cls.getSimpleName() + " t where t.donem = :donem "
				+ " and t.company = :company";
	}
	public String getDipnotHql()
	{
		return "from Dipnot t where t.donem = :donem "
				+ " and t.company = :company"
				+ " and t.sayfaNo = :sayfaNo";
	}
}

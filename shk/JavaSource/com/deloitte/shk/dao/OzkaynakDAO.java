package com.deloitte.shk.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.Ozkaynak;
import com.deloitte.shk.generic.GenericDAO;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class OzkaynakDAO extends GenericDAO<Ozkaynak,Long> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private final String HQL_FIND_BY_DONEM_AND_COMPANY = "from Ozkaynak t where t.donem = :donem "
			+ " and t.company = :company "
			+ " and t.columnNumber = :columnNumber";
			
	
	public void save(Ozkaynak instance,Ozkaynak instance1,Ozkaynak instance2,Ozkaynak instance3,Ozkaynak instance4,Ozkaynak instance5,Ozkaynak instance6,Ozkaynak instance7,Ozkaynak instance8,Ozkaynak instance9,Ozkaynak instance10) {
		em.persist(instance);
		em.persist(instance1);
		em.persist(instance2);
		em.persist(instance3);
		em.persist(instance4);
		em.persist(instance5);
		em.persist(instance6);
		em.persist(instance7);
		em.persist(instance8);
		em.persist(instance9);
		em.persist(instance10);
	}
	public Ozkaynak findByDonemAndCompany(Donem donem, Company company, Long columnNumber)
	{
		List list = em.createQuery(HQL_FIND_BY_DONEM_AND_COMPANY)
				.setParameter("donem", donem)
				.setParameter("company", company)
				.setParameter("columnNumber", columnNumber)
				.getResultList();
		if(list != null && list.size() > 0)
		{
			return (Ozkaynak)list.get(0);
		}
		else
		{
			return null;
		}
	}
}

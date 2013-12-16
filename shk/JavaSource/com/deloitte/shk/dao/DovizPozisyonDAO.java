package com.deloitte.shk.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.DovizPozisyon;
import com.deloitte.shk.generic.GenericDAO;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class DovizPozisyonDAO extends GenericDAO<DovizPozisyon,Long> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private final String HQL_FIND_BY_DONEM_AND_COMPANY = "from DovizPozisyon t where t.donem = :donem "
			+ " and t.company = :company "
			+ " and t.columnNumber = :columnNumber";
			
	
	public void save(DovizPozisyon instance,DovizPozisyon instance1,DovizPozisyon instance2,DovizPozisyon instance3,DovizPozisyon instance4) {
		em.persist(instance);
		em.persist(instance1);
		em.persist(instance2);
		em.persist(instance3);
		em.persist(instance4);
	}
	public DovizPozisyon findByDonemAndCompany(Donem donem, Company company, Long columnNumber)
	{
		List list = em.createQuery(HQL_FIND_BY_DONEM_AND_COMPANY)
				.setParameter("donem", donem)
				.setParameter("company", company)
				.setParameter("columnNumber", columnNumber)
				.getResultList();
		if(list != null && list.size() > 0)
		{
			return (DovizPozisyon)list.get(0);
		}
		else
		{
			return null;
		}
	}
}

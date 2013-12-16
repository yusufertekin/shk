package com.deloitte.shk.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.UcakGider;
import com.deloitte.shk.generic.GenericDAO;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class UcakGiderDAO extends GenericDAO<UcakGider,Long> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private final String HQL_FIND_BY_DONEM_AND_COMPANY = "from UcakGider t where t.donem = :donem "
			+ " and t.company = :company";
	
	public List<UcakGider> findByDonemAndCompanyList(Donem donem, Company company)
	{
		@SuppressWarnings("unchecked")
		List<UcakGider> list = em.createQuery(HQL_FIND_BY_DONEM_AND_COMPANY)
				.setParameter("donem", donem)
				.setParameter("company", company)
				.getResultList();
		return list;
		
	}
}

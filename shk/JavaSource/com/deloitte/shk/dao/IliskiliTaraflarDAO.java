package com.deloitte.shk.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.IliskiliTaraflar;
import com.deloitte.shk.generic.GenericDAO;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class IliskiliTaraflarDAO extends GenericDAO<IliskiliTaraflar,Long> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private final String HQL_FIND_BY_DONEM_AND_COMPANY_AND_TIP = "from IliskiliTaraflar t where t.donem = :donem "
			+ " and t.company = :company"
			+ " and t.tip = :tip";
	
	public List<IliskiliTaraflar> findByDonemAndCompanyAndTip(Donem donem, Company company, Long tip)
	{
		@SuppressWarnings("unchecked")
		List<IliskiliTaraflar> list = em.createQuery(HQL_FIND_BY_DONEM_AND_COMPANY_AND_TIP)
				.setParameter("donem", donem)
				.setParameter("company", company)
				.setParameter("tip", tip)
				.getResultList();
		return list;
	}
	
}

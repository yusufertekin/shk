package com.deloitte.shk.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.UcakFilo;
import com.deloitte.shk.generic.GenericDAO;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class UcakFiloDAO extends GenericDAO<UcakFilo,Long> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private final String HQL_FIND_ADET_BY_DONEM_AND_COMPANY = "from UcakFilo t where t.donem = :donem "
			+ " and t.company = :company"
			+ " and t.tip = 2";
	
	private final String HQL_FIND_BY_DONEM_AND_COMPANY_AND_TIP = "from UcakFilo t where t.donem = :donem "
			+ " and t.company = :company"
			+ " and t.tip = :tip";
	
	public List<UcakFilo> findByDonemAndCompanyAndTip(Donem donem, Company company, Long tip)
	{
		@SuppressWarnings("unchecked")
		List<UcakFilo> list = em.createQuery(HQL_FIND_BY_DONEM_AND_COMPANY_AND_TIP)
				.setParameter("donem", donem)
				.setParameter("company", company)
				.setParameter("tip", tip)
				.getResultList();
		return list;
	}
	
	public UcakFilo findAdetByDonemAndCompany(Donem donem, Company company)
	{
		@SuppressWarnings("unchecked")
		List<UcakFilo> list = em.createQuery(HQL_FIND_ADET_BY_DONEM_AND_COMPANY)
				.setParameter("donem", donem)
				.setParameter("company", company)
				.getResultList();
		if(list != null && list.size() > 0)
		{
			return (UcakFilo)list.get(0);
		}
		else
		{
			return null;
		}
	}
}

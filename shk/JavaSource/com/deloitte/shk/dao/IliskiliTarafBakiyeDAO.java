package com.deloitte.shk.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.IliskiliTarafBakiye;
import com.deloitte.shk.generic.GenericDAO;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class IliskiliTarafBakiyeDAO extends GenericDAO<IliskiliTarafBakiye,Long> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private final String HQL_FIND_BY_DONEM_AND_COMPANY_AND_TIP = "from IliskiliTarafBakiye t where t.donem = :donem "
			+ " and t.company = :company"
			+ " and t.tip = :tip";
	
	public List<IliskiliTarafBakiye> findByDonemAndCompanyAndTip(Donem donem, Company company, Long tip)
	{
		@SuppressWarnings("unchecked")
		List<IliskiliTarafBakiye> list = em.createQuery(HQL_FIND_BY_DONEM_AND_COMPANY_AND_TIP)
				.setParameter("donem", donem)
				.setParameter("company", company)
				.setParameter("tip", tip)
				.getResultList();
		return list;
	}

}

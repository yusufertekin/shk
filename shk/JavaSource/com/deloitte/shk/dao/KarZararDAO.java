package com.deloitte.shk.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.KarZarar;
import com.deloitte.shk.generic.GenericDAO;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class KarZararDAO extends GenericDAO<KarZarar,Long> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private final String HQL_FIND_DONEM_NET_KAR_ZARAR = "select t.anaOrtaklikNetKar from KarZarar t where t.donem = :donem "
			+ " and t.company = :company";
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public Double findDonemNetKarZarar(Donem donem, Company company)
	{
		List list = em.createQuery(HQL_FIND_DONEM_NET_KAR_ZARAR)
				.setParameter("donem", donem)
				.setParameter("company", company)
				.getResultList();
		if(list != null && list.size() > 0)
		{
			return (Double)list.get(0);
		}
		else
		{
			return null;
		}
	}
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public KarZarar findByDonemAndCompany(Donem donem, Company company) {
		// TODO Auto-generated method stub
		return super.findByDonemAndCompany(donem, company);
	}
}

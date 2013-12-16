package com.deloitte.shk.services;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.deloitte.shk.dao.IliskiliTaraflarDAO;
import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.IliskiliTaraflar;
import com.deloitte.shk.generic.GenericDAO;
import com.deloitte.shk.generic.GenericService;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class IliskiliTaraflarService extends GenericService<IliskiliTaraflar,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject IliskiliTaraflarDAO iliskiliTaraflarDAO;
	
	
	public List<IliskiliTaraflar> findByDonemAndCompanyAndTip(Donem donem, Company company, Long tip)
	{
		return iliskiliTaraflarDAO.findByDonemAndCompanyAndTip(donem, company, tip);
	}
	
	@Override
	public GenericDAO<IliskiliTaraflar, Long> getEntityDAO() {
		// TODO Auto-generated method stub
		return iliskiliTaraflarDAO;
	}

}

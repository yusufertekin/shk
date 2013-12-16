package com.deloitte.shk.services;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.deloitte.shk.dao.IliskiliTarafBakiyeDAO;
import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.IliskiliTarafBakiye;
import com.deloitte.shk.generic.GenericDAO;
import com.deloitte.shk.generic.GenericService;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class IliskiliTarafBakiyeService extends GenericService<IliskiliTarafBakiye,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject IliskiliTarafBakiyeDAO iliskiliTarafBakiyeDAO;
	
	
	public List<IliskiliTarafBakiye> findByDonemAndCompanyAndTip(Donem donem, Company company, Long tip)
	{
		return iliskiliTarafBakiyeDAO.findByDonemAndCompanyAndTip(donem, company, tip);
	}
	

	@Override
	public GenericDAO<IliskiliTarafBakiye, Long> getEntityDAO() {
		// TODO Auto-generated method stub
		return iliskiliTarafBakiyeDAO;
	}

}

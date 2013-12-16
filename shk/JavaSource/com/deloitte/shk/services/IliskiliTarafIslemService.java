package com.deloitte.shk.services;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.deloitte.shk.dao.IliskiliTarafIslemDAO;
import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.IliskiliTarafIslem;
import com.deloitte.shk.generic.GenericDAO;
import com.deloitte.shk.generic.GenericService;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class IliskiliTarafIslemService extends GenericService<IliskiliTarafIslem,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject IliskiliTarafIslemDAO iliskiliTarafIslemDAO;
	
	
	public List<IliskiliTarafIslem> findByDonemAndCompanyAndTip(Donem donem, Company company, Long tip)
	{
		return iliskiliTarafIslemDAO.findByDonemAndCompanyAndTip(donem, company, tip);
	}
	
	@Override
	public GenericDAO<IliskiliTarafIslem, Long> getEntityDAO() {
		// TODO Auto-generated method stub
		return iliskiliTarafIslemDAO;
	}

}

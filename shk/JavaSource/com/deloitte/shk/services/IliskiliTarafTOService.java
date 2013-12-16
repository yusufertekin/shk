package com.deloitte.shk.services;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.deloitte.shk.dao.IliskiliTarafTODAO;
import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.IliskiliTarafTO;
import com.deloitte.shk.generic.GenericDAO;
import com.deloitte.shk.generic.GenericService;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class IliskiliTarafTOService extends GenericService<IliskiliTarafTO,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject IliskiliTarafTODAO iliskiliTarafTODAO;
	
	
	public List<IliskiliTarafTO> findByDonemAndCompanyAndTip(Donem donem, Company company, Long tip)
	{
		return iliskiliTarafTODAO.findByDonemAndCompanyAndTip(donem, company, tip);
	}
	

	@Override
	public GenericDAO<IliskiliTarafTO, Long> getEntityDAO() {
		// TODO Auto-generated method stub
		return iliskiliTarafTODAO;
	}

}

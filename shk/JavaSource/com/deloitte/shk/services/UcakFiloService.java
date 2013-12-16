package com.deloitte.shk.services;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.deloitte.shk.dao.UcakFiloDAO;
import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.UcakFilo;
import com.deloitte.shk.generic.GenericDAO;
import com.deloitte.shk.generic.GenericService;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class UcakFiloService extends GenericService<UcakFilo,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject UcakFiloDAO ucakFiloDAO;
	
	
	public List<UcakFilo> findByDonemAndCompanyAndTip(Donem donem, Company company, Long tip)
	{
		return ucakFiloDAO.findByDonemAndCompanyAndTip(donem, company, tip);
	}
	
	public UcakFilo findAdetByDonemAndCompany(Donem donem, Company company)
	{
		return ucakFiloDAO.findAdetByDonemAndCompany(donem, company);
	}

	@Override
	public GenericDAO<UcakFilo, Long> getEntityDAO() {
		// TODO Auto-generated method stub
		return ucakFiloDAO;
	}

}

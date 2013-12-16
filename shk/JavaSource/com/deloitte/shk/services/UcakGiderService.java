package com.deloitte.shk.services;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.deloitte.shk.dao.UcakGiderDAO;
import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.UcakGider;
import com.deloitte.shk.generic.GenericDAO;
import com.deloitte.shk.generic.GenericService;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class UcakGiderService extends GenericService<UcakGider,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject UcakGiderDAO ucakGiderDAO;
	
	
	public List<UcakGider> findByDonemAndCompanyList(Donem donem, Company company)
	{
		return ucakGiderDAO.findByDonemAndCompanyList(donem, company);
	}

	@Override
	public GenericDAO<UcakGider, Long> getEntityDAO() {
		// TODO Auto-generated method stub
		return ucakGiderDAO;
	}

}

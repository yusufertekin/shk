package com.deloitte.shk.services;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.deloitte.shk.dao.KarZararDAO;
import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.KarZarar;
import com.deloitte.shk.generic.GenericDAO;
import com.deloitte.shk.generic.GenericService;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class KarZararService extends GenericService<KarZarar,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject KarZararDAO karZararDAO;
	
	public Double findDonemNetKarZarar(Donem donem, Company company)
	{
		return karZararDAO.findDonemNetKarZarar(donem, company);
	}
	

	@Override
	public GenericDAO<KarZarar, Long> getEntityDAO() {
		// TODO Auto-generated method stub
		return karZararDAO;
	}

}

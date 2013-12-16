package com.deloitte.shk.services;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.deloitte.shk.dao.DovizPozisyonDAO;
import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.DovizPozisyon;
import com.deloitte.shk.generic.GenericDAO;
import com.deloitte.shk.generic.GenericService;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class DovizPozisyonService extends GenericService<DovizPozisyon,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject DovizPozisyonDAO dovizPozisyonDAO;
	
	
	public void save(DovizPozisyon instance,DovizPozisyon instance1,DovizPozisyon instance2,DovizPozisyon instance3,DovizPozisyon instance4) 
	{
		dovizPozisyonDAO.save(instance, instance1, instance2, instance3, instance4);
	}
	public DovizPozisyon findByDonemAndCompany(Donem donem, Company company, Long columnNumber)
	{
		return dovizPozisyonDAO.findByDonemAndCompany(donem, company, columnNumber);
	}

	@Override
	public GenericDAO<DovizPozisyon, Long> getEntityDAO() {
		// TODO Auto-generated method stub
		return dovizPozisyonDAO;
	}

}

package com.deloitte.shk.services;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.deloitte.shk.dao.BorcYaslandirmaDAO;
import com.deloitte.shk.entity.BorcYaslandirma;
import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.generic.GenericDAO;
import com.deloitte.shk.generic.GenericService;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class BorcYaslandirmaService extends GenericService<BorcYaslandirma,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject BorcYaslandirmaDAO borcYaslandirmaDAO;
	
	
	public void save(BorcYaslandirma instance,BorcYaslandirma instance1,BorcYaslandirma instance2,BorcYaslandirma instance3,BorcYaslandirma instance4) 
	{
		borcYaslandirmaDAO.save(instance, instance1, instance2, instance3, instance4);
	}
	public BorcYaslandirma findByDonemAndCompany(Donem donem, Company company, Long columnNumber)
	{
		return borcYaslandirmaDAO.findByDonemAndCompany(donem, company, columnNumber);
	}

	@Override
	public GenericDAO<BorcYaslandirma, Long> getEntityDAO() {
		// TODO Auto-generated method stub
		return borcYaslandirmaDAO;
	}

}

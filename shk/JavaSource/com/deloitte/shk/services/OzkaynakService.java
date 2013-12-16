package com.deloitte.shk.services;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.deloitte.shk.dao.OzkaynakDAO;
import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.Ozkaynak;
import com.deloitte.shk.generic.GenericDAO;
import com.deloitte.shk.generic.GenericService;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class OzkaynakService extends GenericService<Ozkaynak,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject OzkaynakDAO ozkaynakDAO;
	
	
	public void save(Ozkaynak instance,Ozkaynak instance1,Ozkaynak instance2,Ozkaynak instance3,Ozkaynak instance4,Ozkaynak instance5,Ozkaynak instance6,Ozkaynak instance7,Ozkaynak instance8,Ozkaynak instance9,Ozkaynak instance10) 
	{
		ozkaynakDAO.save(instance, instance1, instance2, instance3, instance4, instance5, instance6, instance7, instance8, instance9, instance10);
	}
	public Ozkaynak findByDonemAndCompany(Donem donem, Company company, Long columnNumber)
	{
		return ozkaynakDAO.findByDonemAndCompany(donem, company, columnNumber);
	}

	@Override
	public GenericDAO<Ozkaynak, Long> getEntityDAO() {
		// TODO Auto-generated method stub
		return ozkaynakDAO;
	}

}

package com.deloitte.shk.services;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.deloitte.shk.dao.ToplamCalisanDAO;
import com.deloitte.shk.entity.ToplamCalisan;
import com.deloitte.shk.generic.GenericDAO;
import com.deloitte.shk.generic.GenericService;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class ToplamCalisanService extends GenericService<ToplamCalisan,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject ToplamCalisanDAO toplamCalisanDAO;
	
	
	@Override
	public GenericDAO<ToplamCalisan, Long> getEntityDAO() {
		// TODO Auto-generated method stub
		return toplamCalisanDAO;
	}

}

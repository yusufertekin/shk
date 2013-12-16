package com.deloitte.shk.services;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.deloitte.shk.dao.DipnotDAO;
import com.deloitte.shk.entity.Dipnot;
import com.deloitte.shk.generic.GenericDAO;
import com.deloitte.shk.generic.GenericService;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class DipnotService extends GenericService<Dipnot,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject DipnotDAO dipnotDAO;
	
	@Override
	public GenericDAO<Dipnot, Long> getEntityDAO() {
		// TODO Auto-generated method stub
		return dipnotDAO;
	}

}

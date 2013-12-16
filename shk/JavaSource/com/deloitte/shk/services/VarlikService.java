package com.deloitte.shk.services;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.deloitte.shk.dao.VarlikDAO;
import com.deloitte.shk.entity.Varlik;
import com.deloitte.shk.generic.GenericDAO;
import com.deloitte.shk.generic.GenericService;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class VarlikService extends GenericService<Varlik,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject VarlikDAO varlikDAO;
	
	@Override
	public GenericDAO<Varlik, Long> getEntityDAO() {
		// TODO Auto-generated method stub
		return varlikDAO;
	}

}

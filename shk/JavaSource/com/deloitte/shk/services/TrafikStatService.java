package com.deloitte.shk.services;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.deloitte.shk.dao.TrafikStatDAO;
import com.deloitte.shk.entity.TrafikStat;
import com.deloitte.shk.generic.GenericDAO;
import com.deloitte.shk.generic.GenericService;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class TrafikStatService extends GenericService<TrafikStat,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject TrafikStatDAO trafikStatDAO;
	
	
	@Override
	public GenericDAO<TrafikStat, Long> getEntityDAO() {
		// TODO Auto-generated method stub
		return trafikStatDAO;
	}

}

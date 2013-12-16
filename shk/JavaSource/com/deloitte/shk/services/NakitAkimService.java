package com.deloitte.shk.services;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.deloitte.shk.dao.NakitAkimDAO;
import com.deloitte.shk.entity.NakitAkim;
import com.deloitte.shk.generic.GenericDAO;
import com.deloitte.shk.generic.GenericService;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class NakitAkimService extends GenericService<NakitAkim,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject NakitAkimDAO nakitAkimDAO;
	
	
	@Override
	public GenericDAO<NakitAkim, Long> getEntityDAO() {
		// TODO Auto-generated method stub
		return nakitAkimDAO;
	}

}

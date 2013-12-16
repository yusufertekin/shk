package com.deloitte.shk.services;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.deloitte.shk.dao.KaynakDAO;
import com.deloitte.shk.entity.Kaynak;
import com.deloitte.shk.generic.GenericDAO;
import com.deloitte.shk.generic.GenericService;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class KaynakService extends GenericService<Kaynak,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject KaynakDAO kaynakDAO;
	
	
	@Override
	public GenericDAO<Kaynak, Long> getEntityDAO() {
		// TODO Auto-generated method stub
		return kaynakDAO;
	}

}

package com.deloitte.shk.services;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.deloitte.shk.dao.DonemDAO;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.generic.GenericDAO;
import com.deloitte.shk.generic.GenericService;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class DonemService implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject DonemDAO donemDAO;
	
	
	public Donem findByDonem(Date donem)
	{
		return donemDAO.findByDonem(donem);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void save(Donem instance) {
		donemDAO.save(instance);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void remove(Donem instance) {
		donemDAO.remove(instance);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void update(Donem instance) {
		donemDAO.update(instance);
	}

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<Donem> list() {
		return donemDAO.list();
	}

}

package com.deloitte.shk.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.Kaynak;
import com.deloitte.shk.generic.GenericDAO;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class KaynakDAO extends GenericDAO<Kaynak,Long> implements Serializable {
	
	private static final long serialVersionUID = 1L;
/*	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	@Override
	public Kaynak findByDonemAndCompany(Donem donem, Company company) {
		// TODO Auto-generated method stub
		return super.findByDonemAndCompany(donem, company);
	}
*/
}

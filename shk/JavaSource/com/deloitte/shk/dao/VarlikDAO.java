package com.deloitte.shk.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.Varlik;
import com.deloitte.shk.generic.GenericDAO;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class VarlikDAO extends GenericDAO<Varlik,Long> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
}

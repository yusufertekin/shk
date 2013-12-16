package com.deloitte.shk.dao;

import java.io.Serializable;

import javax.ejb.Stateless;

import com.deloitte.shk.entity.Dipnot;
import com.deloitte.shk.generic.GenericDAO;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class DipnotDAO extends GenericDAO<Dipnot,Long> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
}

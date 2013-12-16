package com.deloitte.shk.dao;

import java.io.Serializable;

import javax.ejb.Stateless;

import com.deloitte.shk.entity.ToplamCalisan;
import com.deloitte.shk.generic.GenericDAO;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class ToplamCalisanDAO extends GenericDAO<ToplamCalisan,Long> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
}

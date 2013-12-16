package com.deloitte.shk.dao;

import java.io.Serializable;

import javax.ejb.Stateless;

import com.deloitte.shk.entity.TrafikStat;
import com.deloitte.shk.generic.GenericDAO;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class TrafikStatDAO extends GenericDAO<TrafikStat,Long> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
}

package com.deloitte.shk.dao;

import java.io.Serializable;

import javax.ejb.Stateless;

import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.generic.GenericDAO;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class KullaniciDAO extends GenericDAO<Kullanici,Long> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
//	
//	@SuppressWarnings("unchecked")
//	public List<String> getCompanyList()
//	{
//		return (List<String>)this.em.createQuery("select t.companyName from Kullanici t")
//				.getResultList();
//	}
	
	public Kullanici userByUserNamePassword(String username, String password) {
		return (Kullanici)this.em.createQuery("from Kullanici where username = :username and password = :password")
				.setParameter("username", username)
				.setParameter("password", password)
				.getSingleResult();
	}
	
	public Kullanici verifyUser(String key){
		System.out.println(key);
		try {
			return (Kullanici)this.em.createQuery("from Kullanici u where key =:key").setParameter("key", key).getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

}

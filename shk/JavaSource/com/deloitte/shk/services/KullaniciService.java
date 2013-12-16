package com.deloitte.shk.services;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.apache.shiro.crypto.hash.Md5Hash;

import com.deloitte.shk.dao.KullaniciDAO;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.generic.GenericDAO;
import com.deloitte.shk.generic.GenericService;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class KullaniciService extends GenericService<Kullanici,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject KullaniciDAO kullaniciDAO;
	
	@Override
	public void save(Kullanici instance) {
		instance.setPassword(new Md5Hash(instance.getUsername()+instance.getPassword()).toHex());
		super.save(instance);
	}
	
//	public List<String> getCompanyList()
//	{
//		return kullaniciDAO.getCompanyList();
//	}
	
	public boolean comparePasswords(String password, String retypePassword)
	{
		return password.equals(retypePassword);
	}
	public String createMD5(String username, String password)
	{
		 return new Md5Hash(username+password).toHex(); 
	}
	
	@Override
	public GenericDAO<Kullanici,Long> getEntityDAO() {
		return kullaniciDAO;
	}

}

package com.deloitte.shk.services;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;

import com.deloitte.shk.dao.KullaniciDAO;
import com.deloitte.shk.entity.Kullanici;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class LoginService implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject KullaniciDAO kullaniciDAO;
	Subject currentUser;

	public Kullanici login(String username, String password)
	{
		 currentUser = SecurityUtils.getSubject();  
		 String hex = new Md5Hash(username+password).toHex(); 
		 UsernamePasswordToken token = new UsernamePasswordToken(username, hex);
         currentUser.login(token);
         return kullaniciDAO.userByUserNamePassword(username, hex);
	}
	public void logout()
	{
		Subject currentUser = SecurityUtils.getSubject();
		currentUser.logout();
	}
	
	public String navigate()
	{
		return "/xhtml/user/index.xhtml?faces-redirect=true";
	}

}

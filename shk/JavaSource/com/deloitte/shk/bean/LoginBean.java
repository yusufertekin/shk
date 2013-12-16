package com.deloitte.shk.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;

import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.qualifier.DonemList;
import com.deloitte.shk.services.DonemService;
import com.deloitte.shk.services.LoginService;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class LoginBean implements Serializable {

	@Inject LoginService loginService;
	@Inject DonemService donemService;
	String username;
	String password;
	private static final long serialVersionUID = 1L;


	private Kullanici currentUser;
	private List<Donem> donemList;
	
	public String login() {
		try {
			Kullanici kul = loginService.login(username, password);
			setCurrentUser(kul);
		} catch (UnknownAccountException uae) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage());
			return "/login.xhtml";
		} catch (IncorrectCredentialsException ice) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Giris Basarisiz"));
			return "/login.xhtml";
		} catch (LockedAccountException lae) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Bu kullanici kilitli"));
			return "/login.xhtml";
		} catch (AuthenticationException aex) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Giris Basarisiz"));
			return "/login.xhtml";
		}
		catch (Exception aex) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Giris Basarisiz"));
			return "/login.xhtml";
		}
		donemList = donemService.list();
		return loginService.navigate();
	}
	
	public String info()
	{
		return "/xhtml/info.xhtml?faces-redirect=true";
	}
	
	public String back()
	{
		return "/login.xhtml?faces-redirect=true";
	}
	
	@Produces @CurrentUser @Named @SessionScoped
	public Kullanici getCurrentUser() {
		return currentUser;
	}
	
	@Produces @DonemList @Named @SessionScoped
	public List<Donem> getDonemList() {
		return donemList;
	}

	
	public String logout() {
		loginService.logout();
		return "/login.xhtml?faces-redirect=true";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public void setCurrentUser(Kullanici currentUser) {
		this.currentUser = currentUser;
	}

	public void setDonemList(List<Donem> donemList) {
		this.donemList = donemList;
	}


}

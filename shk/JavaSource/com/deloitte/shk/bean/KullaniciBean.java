package com.deloitte.shk.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.resource.spi.AdministeredObject;

import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.generic.GenericBean;
import com.deloitte.shk.generic.GenericService;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.services.KullaniciService;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class KullaniciBean extends GenericBean<Kullanici,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject KullaniciService kullaniciService;
	@Inject @CurrentUser Kullanici currentUser;
	
	
	private Boolean adminOrNot;
	private String password;
	private String retypePassword;

//	
//	public void loadCompanyList()
//	{
//		setCompanyList(kullaniciService.getCompanyList());
//	}
//	
	
	@Override
	public void save() {
		// TODO Auto-generated method stub
		try {
			if(adminOrNot)
			{
				getInstance().setCompany(null);
			}
			super.save();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			if(e.getCause().getCause().getMessage().contains("ORA-00001"))
			{
				addMessage("user.uniqueConstraint");
				return;
			}
			else
			{
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(getMsg().getString("common.error")));
			}
		}
	}
	@Override
	public void update() {
		if(getPassword() != null || retypePassword != null)
		{
			if(kullaniciService.comparePasswords(getPassword(), retypePassword))
			{
				getInstance().setPassword(kullaniciService.createMD5(getInstance().getUsername(), getPassword()));
			}
		}
		try {
			super.update();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			if(e.getCause().getCause().getMessage().contains("ORA-00001"))
			{
				addMessage("user.uniqueConstraint");
				return;
			}
			else
			{
				addMessage("common.error");	
			}
		}
	}
	
	public String emptyUser()
	{
		setInstance(new Kullanici());
		return "/xhtml/admin/userRegistration.xhtml?faces-redirect=true";
	}
	
	public String loadUser()
	{
		setInstance(currentUser);
		return "/xhtml/admin/userUpdate.xhtml?faces-redirect=true";
	}
	
	@Override
	public GenericService<Kullanici,Long> getEntityService() {
		// TODO Auto-generated method stub
		return kullaniciService;
	}

	public String getRetypePassword() {
		return retypePassword;
	}

	public void setRetypePassword(String retypePassword) {
		this.retypePassword = retypePassword;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getAdminOrNot() {
		return adminOrNot;
	}
	public void setAdminOrNot(Boolean adminOrNot) {
		this.adminOrNot = adminOrNot;
	}


}

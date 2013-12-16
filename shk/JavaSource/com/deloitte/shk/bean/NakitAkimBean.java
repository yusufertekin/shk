package com.deloitte.shk.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.entity.NakitAkim;
import com.deloitte.shk.generic.GenericBean;
import com.deloitte.shk.generic.GenericService;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.services.NakitAkimService;

/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class NakitAkimBean extends GenericBean<NakitAkim,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject NakitAkimService nakitAkimService;
	@Inject @CurrentUser Kullanici currentUser;
	
	
	@Override
	public GenericService<NakitAkim,Long> getEntityService() {
		// TODO Auto-generated method stub
		return nakitAkimService;
	}

	
	public void sorgula()
	{
		if(currentUser.getCompany() != null && currentUser.getCompany().getCompanyId() != null)
		{
			try {
				getInstance().setCompany((Company)currentUser.getCompany().clone());
				setCompany((Company)currentUser.getCompany().clone());
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		getInstance().setDonem(getSelectedDonem());
		NakitAkim nakitAkim = nakitAkimService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany());
		if(nakitAkim != null)
		{
			setInstance(nakitAkim);
		}
		else
		{
			newInstance();
		}
	}
	public String initPage() {
		// TODO Auto-generated method stub
		newInstance();
		getInstance().setDonem(getDonemList().get(0));
		setSelectedDonem(getDonemList().get(0));
		sorgula();
		return "/xhtml/user/nakitAkim.xhtml?faces-redirect=true";
	}


}

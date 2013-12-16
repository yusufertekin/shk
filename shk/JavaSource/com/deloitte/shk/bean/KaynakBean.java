package com.deloitte.shk.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Kaynak;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.generic.GenericBean;
import com.deloitte.shk.generic.GenericService;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.services.KarZararService;
import com.deloitte.shk.services.KaynakService;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class KaynakBean extends GenericBean<Kaynak,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject KaynakService kaynakService;
	@Inject KarZararService karZararService;
	@Inject @CurrentUser Kullanici currentUser;
	
	private Double donemNetKarZarar;
	
	
	@Override
	public GenericService<Kaynak,Long> getEntityService() {
		// TODO Auto-generated method stub
		return kaynakService;
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
		Kaynak kaynak = kaynakService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany());
		donemNetKarZarar = karZararService.findDonemNetKarZarar(getInstance().getDonem(), getInstance().getCompany());
		if(kaynak != null)
		{
			setInstance(kaynak);
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
		return "/xhtml/user/kaynaklar.xhtml?faces-redirect=true";
	}


	public Double getDonemNetKarZarar() {
		return donemNetKarZarar;
	}


	public void setDonemNetKarZarar(Double donemNetKarZarar) {
		this.donemNetKarZarar = donemNetKarZarar;
	}


}

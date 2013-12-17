package com.deloitte.shk.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Dipnot;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.entity.ToplamCalisan;
import com.deloitte.shk.enums.Tablo;
import com.deloitte.shk.generic.GenericBean;
import com.deloitte.shk.generic.GenericService;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.services.ToplamCalisanService;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class ToplamCalisanBean extends GenericBean<ToplamCalisan,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject ToplamCalisanService toplamCalisanService;
	@Inject @CurrentUser Kullanici currentUser;
	
	
	@Override
	public GenericService<ToplamCalisan,Long> getEntityService() {
		// TODO Auto-generated method stub
		return toplamCalisanService;
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
		Dipnot tmp = toplamCalisanService.findDipnotByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), Tablo.TOPLAMCALISAN.getValue());
		if(tmp != null)
		{
			setDipnot(tmp);
		}
		else
		{
			setDipnot(new Dipnot());
		}
		ToplamCalisan toplamCalisan = toplamCalisanService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany());
		if(toplamCalisan != null)
		{
			setInstance(toplamCalisan);
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
		return "/xhtml/user/toplamCalisan.xhtml?faces-redirect=true";
	}


}

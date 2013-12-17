package com.deloitte.shk.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Dipnot;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.entity.Varlik;
import com.deloitte.shk.enums.Tablo;
import com.deloitte.shk.generic.GenericBean;
import com.deloitte.shk.generic.GenericService;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.services.VarlikService;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class VarlikBean extends GenericBean<Varlik,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject VarlikService varlikService;
	@Inject @CurrentUser Kullanici currentUser;
	
	
	@Override
	public GenericService<Varlik,Long> getEntityService() {
		// TODO Auto-generated method stub
		return varlikService;
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
		Dipnot tmp = varlikService.findDipnotByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), Tablo.VARLIK.getValue());
		if(tmp != null)
		{
			setDipnot(tmp);
		}
		else
		{
			setDipnot(new Dipnot());
		}
		Varlik varlik = varlikService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany());
		if(varlik != null)
		{
			setInstance(varlik);
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
		return "/xhtml/user/varliklar.xhtml?faces-redirect=true";
	}


}

package com.deloitte.shk.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Dipnot;
import com.deloitte.shk.entity.IliskiliTaraflar;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.generic.GenericBean;
import com.deloitte.shk.generic.GenericService;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.services.IliskiliTaraflarService;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class IliskiliTaraflarBean extends GenericBean<IliskiliTaraflar,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject IliskiliTaraflarService iliskiliTaraflarService;
	@Inject @CurrentUser Kullanici currentUser;
	
	private List<IliskiliTaraflar> ortakList;
	private List<IliskiliTaraflar> aileBireyList;
	private List<IliskiliTaraflar> ustDuzeyYonList;
	private List<IliskiliTaraflar> digerIliskiliTarafList;
	
	
	@Override
	public GenericService<IliskiliTaraflar,Long> getEntityService() {
		// TODO Auto-generated method stub
		return iliskiliTaraflarService;
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
		Dipnot tmp = iliskiliTaraflarService.findDipnotByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 14L);
		if(tmp != null)
		{
			setDipnot(tmp);
		}
		else
		{
			setDipnot(new Dipnot());
		}
		loadLists();
	}
	public String initPage() {
		// TODO Auto-generated method stub
		newInstance();
		getInstance().setDonem(getDonemList().get(0));
		setSelectedDonem(getDonemList().get(0));
		getInstance().setTip(0L);
		sorgula();
		return "/xhtml/user/iliskiliTaraflar.xhtml?faces-redirect=true";
	}
	@Override
	public void remove(IliskiliTaraflar instance) {
		// TODO Auto-generated method stub
		super.remove(instance);
		getInstance().setTip(0L);
		loadLists();
	}
	
	public void loadLists()
	{
		ortakList = iliskiliTaraflarService.findByDonemAndCompanyAndTip(getInstance().getDonem(), getInstance().getCompany(), 0L);
		aileBireyList = iliskiliTaraflarService.findByDonemAndCompanyAndTip(getInstance().getDonem(), getInstance().getCompany(), 1L);
		ustDuzeyYonList = iliskiliTaraflarService.findByDonemAndCompanyAndTip(getInstance().getDonem(), getInstance().getCompany(), 2L);
		digerIliskiliTarafList = iliskiliTaraflarService.findByDonemAndCompanyAndTip(getInstance().getDonem(), getInstance().getCompany(), 3L);
	}
	
	
	public void update(IliskiliTaraflar instance) {
		try {
			getEntityService().update(instance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			addMessage("common.updateError");
		}
		addMessage("common.updateSuccessful");
		loadLists();
	}
	
	@Override
	public void save() throws Exception {
		// TODO Auto-generated method stub
		super.save();
		getInstance().setTip(0L);
	}
	public List<IliskiliTaraflar> getOrtakList() {
		return ortakList;
	}


	public void setOrtakList(List<IliskiliTaraflar> ortakList) {
		this.ortakList = ortakList;
	}


	public List<IliskiliTaraflar> getAileBireyList() {
		return aileBireyList;
	}


	public void setAileBireyList(List<IliskiliTaraflar> aileBireyList) {
		this.aileBireyList = aileBireyList;
	}


	public List<IliskiliTaraflar> getUstDuzeyYonList() {
		return ustDuzeyYonList;
	}


	public void setUstDuzeyYonList(List<IliskiliTaraflar> ustDuzeyYonList) {
		this.ustDuzeyYonList = ustDuzeyYonList;
	}


	public List<IliskiliTaraflar> getDigerIliskiliTarafList() {
		return digerIliskiliTarafList;
	}


	public void setDigerIliskiliTarafList(List<IliskiliTaraflar> digerIliskiliTarafList) {
		this.digerIliskiliTarafList = digerIliskiliTarafList;
	}

}

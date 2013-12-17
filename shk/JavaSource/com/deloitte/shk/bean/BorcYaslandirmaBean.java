package com.deloitte.shk.bean;


import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.deloitte.shk.entity.BorcYaslandirma;
import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Dipnot;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.enums.Tablo;
import com.deloitte.shk.generic.GenericBean;
import com.deloitte.shk.generic.GenericService;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.services.BorcYaslandirmaService;

/**
 * @author yusufertekin
 *
 */

@Named
@SessionScoped
public class BorcYaslandirmaBean extends GenericBean<BorcYaslandirma,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject BorcYaslandirmaService borcYaslandirmaService;
	@Inject @CurrentUser Kullanici currentUser;
	private BorcYaslandirma instance1;
	private BorcYaslandirma instance2;
	private BorcYaslandirma instance3;
	private BorcYaslandirma instance4;
	
	
	@Override
	public GenericService<BorcYaslandirma,Long> getEntityService() {
		// TODO Auto-generated method stub
		return borcYaslandirmaService;
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
		Dipnot tmp = borcYaslandirmaService.findDipnotByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), Tablo.BORCYASLANDIRMA.getValue());
		if(tmp != null)
		{
			setDipnot(tmp);
		}
		else
		{
			setDipnot(new Dipnot());
		}
		BorcYaslandirma borcYaslandirma = borcYaslandirmaService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 0L);
		BorcYaslandirma borcYaslandirma1 = borcYaslandirmaService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 1L);
		BorcYaslandirma borcYaslandirma2 = borcYaslandirmaService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 2L);
		BorcYaslandirma borcYaslandirma3 = borcYaslandirmaService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 3L);
		BorcYaslandirma borcYaslandirma4 = borcYaslandirmaService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 4L);
		if(borcYaslandirma != null)
		{
			setInstance(borcYaslandirma);
		}
		else
		{
			newInstance();
			getInstance().setColumnNumber(0L);
		}
		if(borcYaslandirma1 != null)
		{
			instance1 = borcYaslandirma1;
		}
		else
		{
			instance1 = new BorcYaslandirma();
			instance1.setColumnNumber(1L);
		}
		if(borcYaslandirma2 != null)
		{
			instance2 = borcYaslandirma2;
		}
		else
		{
			instance2 = new BorcYaslandirma();
			instance2.setColumnNumber(2L);
		}
		if(borcYaslandirma3 != null)
		{
			instance3 = borcYaslandirma3;
		}
		else
		{
			instance3 = new BorcYaslandirma();
			instance3.setColumnNumber(3L);
		}
		if(borcYaslandirma4 != null)
		{
			instance4 = borcYaslandirma4;
		}
		else
		{
			instance4 = new BorcYaslandirma();
			instance4.setColumnNumber(4L);
		}
	}
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		if(getEntityService().findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany()) != null)
		{
			try {
				getEntityService().remove(getInstance());
				getEntityService().remove(instance1);
				getEntityService().remove(instance2);
				getEntityService().remove(instance3);
				getEntityService().remove(instance4);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				addMessage("common.removeError");
				return;
			}
			initInstances();
			addMessage("common.removeSuccessful");
		}
		else
		{
			addMessage("common.removeHata");
		}
	}
	@Override
	public void save() throws Exception {
		// TODO Auto-generated method stub
		instance1.setDonem(getInstance().getDonem());
		instance2.setDonem(getInstance().getDonem());
		instance3.setDonem(getInstance().getDonem());
		instance4.setDonem(getInstance().getDonem());
		instance1.setCompany(getInstance().getCompany());
		instance2.setCompany(getInstance().getCompany());
		instance3.setCompany(getInstance().getCompany());
		instance4.setCompany(getInstance().getCompany());
		try {
			borcYaslandirmaService.save(getInstance(), instance1, instance2, instance3, instance4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			addMessage("common.saveError");
		}
		initInstances();
		addMessage("common.saveSuccessful");
	}
	public void initInstances()
	{
		newInstance();
		instance1 = new BorcYaslandirma();
		instance2 = new BorcYaslandirma();
		instance3 = new BorcYaslandirma();
		instance4 = new BorcYaslandirma();
		getInstance().setColumnNumber(0L);
		instance1.setColumnNumber(1L);
		instance2.setColumnNumber(2L);
		instance3.setColumnNumber(3L);
		instance4.setColumnNumber(4L);
	}
	public String initPage() {
		// TODO Auto-generated method stub
		initInstances();
		getInstance().setDonem(getDonemList().get(0));
		setSelectedDonem(getDonemList().get(0));
		sorgula();
		return "/xhtml/user/borcYaslandirma.xhtml?faces-redirect=true";
	}

	public BorcYaslandirma getInstance1() {
		return instance1;
	}

	public void setInstance1(BorcYaslandirma instance1) {
		this.instance1 = instance1;
	}

	public BorcYaslandirma getInstance2() {
		return instance2;
	}

	public void setInstance2(BorcYaslandirma instance2) {
		this.instance2 = instance2;
	}

	public BorcYaslandirma getInstance3() {
		return instance3;
	}

	public void setInstance3(BorcYaslandirma instance3) {
		this.instance3 = instance3;
	}

	public BorcYaslandirma getInstance4() {
		return instance4;
	}

	public void setInstance4(BorcYaslandirma instance4) {
		this.instance4 = instance4;
	}
	

}

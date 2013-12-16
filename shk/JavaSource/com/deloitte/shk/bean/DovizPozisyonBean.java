package com.deloitte.shk.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Dipnot;
import com.deloitte.shk.entity.DovizPozisyon;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.generic.GenericBean;
import com.deloitte.shk.generic.GenericService;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.services.DovizPozisyonService;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class DovizPozisyonBean extends GenericBean<DovizPozisyon,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject DovizPozisyonService dovizPozisyonService;
	@Inject @CurrentUser Kullanici currentUser;
	private DovizPozisyon instance1;
	private DovizPozisyon instance2;
	private DovizPozisyon instance3;
	private DovizPozisyon instance4;
	
	
	@Override
	public GenericService<DovizPozisyon,Long> getEntityService() {
		// TODO Auto-generated method stub
		return dovizPozisyonService;
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
		Dipnot tmp = dovizPozisyonService.findDipnotByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 9L);
		if(tmp != null)
		{
			setDipnot(tmp);
		}
		else
		{
			setDipnot(new Dipnot());
		}
		DovizPozisyon dovizPozisyon = dovizPozisyonService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 0L);
		DovizPozisyon dovizPozisyon1 = dovizPozisyonService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 1L);
		DovizPozisyon dovizPozisyon2 = dovizPozisyonService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 2L);
		DovizPozisyon dovizPozisyon3 = dovizPozisyonService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 3L);
		DovizPozisyon dovizPozisyon4 = dovizPozisyonService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 4L);
		if(dovizPozisyon != null)
		{
			setInstance(dovizPozisyon);
		}
		else
		{
			newInstance();
			getInstance().setColumnNumber(0L);
		}
		if(dovizPozisyon1 != null)
		{
			instance1 = dovizPozisyon1;
		}
		else
		{
			instance1 = new DovizPozisyon();
			instance1.setColumnNumber(1L);
		}
		if(dovizPozisyon2 != null)
		{
			instance2 = dovizPozisyon2;
		}
		else
		{
			instance2 = new DovizPozisyon();
			instance2.setColumnNumber(2L);
		}
		if(dovizPozisyon3 != null)
		{
			instance3 = dovizPozisyon3;
		}
		else
		{
			instance3 = new DovizPozisyon();
			instance3.setColumnNumber(3L);
		}
		if(dovizPozisyon4 != null)
		{
			instance4 = dovizPozisyon4;
		}
		else
		{
			instance4 = new DovizPozisyon();
			instance4.setColumnNumber(4L);
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
		instance1.setParaBirim(getInstance().getParaBirim());
		instance2.setParaBirim(getInstance().getParaBirim());
		instance3.setParaBirim(getInstance().getParaBirim());
		instance4.setParaBirim(getInstance().getParaBirim());
		try {
			dovizPozisyonService.save(getInstance(), instance1, instance2, instance3, instance4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			addMessage("common.saveError");
		}
		initInstances();
		addMessage("common.saveSuccessful");
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
	public void initInstances()
	{
		newInstance();
		instance1 = new DovizPozisyon();
		instance2 = new DovizPozisyon();
		instance3 = new DovizPozisyon();
		instance4 = new DovizPozisyon();
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
		return "/xhtml/user/dovizPozisyon.xhtml?faces-redirect=true";
	}

	public DovizPozisyon getInstance1() {
		return instance1;
	}

	public void setInstance1(DovizPozisyon instance1) {
		this.instance1 = instance1;
	}

	public DovizPozisyon getInstance2() {
		return instance2;
	}

	public void setInstance2(DovizPozisyon instance2) {
		this.instance2 = instance2;
	}

	public DovizPozisyon getInstance3() {
		return instance3;
	}

	public void setInstance3(DovizPozisyon instance3) {
		this.instance3 = instance3;
	}

	public DovizPozisyon getInstance4() {
		return instance4;
	}

	public void setInstance4(DovizPozisyon instance4) {
		this.instance4 = instance4;
	}
	

}

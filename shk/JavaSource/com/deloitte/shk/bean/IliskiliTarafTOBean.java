package com.deloitte.shk.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.IliskiliTarafTO;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.generic.GenericBean;
import com.deloitte.shk.generic.GenericService;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.services.IliskiliTarafTOService;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class IliskiliTarafTOBean extends GenericBean<IliskiliTarafTO,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject IliskiliTarafTOService iliskiliTarafTOService;
	@Inject @CurrentUser Kullanici currentUser;
	
	private List<IliskiliTarafTO> ortakList;
	private List<IliskiliTarafTO> aileBireyList;
	private List<IliskiliTarafTO> ustDuzeyYonList;
	private List<IliskiliTarafTO> digerIliskiliTarafList;
	
	
	private Double kisaVadeToplam;
	private Double uzunVadeToplam;
	
	@Override
	public GenericService<IliskiliTarafTO,Long> getEntityService() {
		// TODO Auto-generated method stub
		return iliskiliTarafTOService;
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
		loadLists();
	}

	
	public String initPage() {
		// TODO Auto-generated method stub
		newInstance();
		getInstance().setDonem(getDonemList().get(0));
		setSelectedDonem(getDonemList().get(0));
		getInstance().setTip(0L);
		setKisaVadeToplam(new Double(0));
		setUzunVadeToplam(new Double(0));
		sorgula();
		return "/xhtml/user/iliskiliTarafTO.xhtml?faces-redirect=true";
	}
	@Override
	public void remove(IliskiliTarafTO instance) {
		// TODO Auto-generated method stub
		super.remove(instance);
		getInstance().setTip(0L);
	}
	public void loadLists()
	{
		setKisaVadeToplam(new Double(0));
		setUzunVadeToplam(new Double(0));
		ortakList = iliskiliTarafTOService.findByDonemAndCompanyAndTip(getInstance().getDonem(), getInstance().getCompany(), 0L);
		aileBireyList = iliskiliTarafTOService.findByDonemAndCompanyAndTip(getInstance().getDonem(), getInstance().getCompany(), 1L);
		ustDuzeyYonList = iliskiliTarafTOService.findByDonemAndCompanyAndTip(getInstance().getDonem(), getInstance().getCompany(), 2L);
		digerIliskiliTarafList = iliskiliTarafTOService.findByDonemAndCompanyAndTip(getInstance().getDonem(), getInstance().getCompany(), 3L);
		for (IliskiliTarafTO iliskiliTaraf : ortakList) {
			setKisaVadeToplam(getKisaVadeToplam() + iliskiliTaraf.getKisaVadeliAlacak());
			uzunVadeToplam = uzunVadeToplam + iliskiliTaraf.getUzunVadeliAlacak();
		}
		for (IliskiliTarafTO iliskiliTaraf : aileBireyList) {
			setKisaVadeToplam(getKisaVadeToplam() + iliskiliTaraf.getKisaVadeliAlacak());
			setUzunVadeToplam(getUzunVadeToplam() + iliskiliTaraf.getUzunVadeliAlacak());
		}
		
		for (IliskiliTarafTO iliskiliTaraf : ustDuzeyYonList) {
			setKisaVadeToplam(getKisaVadeToplam() + iliskiliTaraf.getKisaVadeliAlacak());
			setUzunVadeToplam(getUzunVadeToplam() + iliskiliTaraf.getUzunVadeliAlacak());
		}
		
		for (IliskiliTarafTO iliskiliTaraf : digerIliskiliTarafList) {
			setKisaVadeToplam(getKisaVadeToplam() + iliskiliTaraf.getKisaVadeliAlacak());
			setUzunVadeToplam(getUzunVadeToplam() + iliskiliTaraf.getUzunVadeliAlacak());
		}
		
	}
	
	
	public void update(IliskiliTarafTO instance) {
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
	public List<IliskiliTarafTO> getOrtakList() {
		return ortakList;
	}


	public void setOrtakList(List<IliskiliTarafTO> ortakList) {
		this.ortakList = ortakList;
	}


	public List<IliskiliTarafTO> getAileBireyList() {
		return aileBireyList;
	}


	public void setAileBireyList(List<IliskiliTarafTO> aileBireyList) {
		this.aileBireyList = aileBireyList;
	}


	public List<IliskiliTarafTO> getUstDuzeyYonList() {
		return ustDuzeyYonList;
	}


	public void setUstDuzeyYonList(List<IliskiliTarafTO> ustDuzeyYonList) {
		this.ustDuzeyYonList = ustDuzeyYonList;
	}


	public List<IliskiliTarafTO> getDigerIliskiliTarafList() {
		return digerIliskiliTarafList;
	}


	public void setDigerIliskiliTarafList(List<IliskiliTarafTO> digerIliskiliTarafList) {
		this.digerIliskiliTarafList = digerIliskiliTarafList;
	}


	public Double getKisaVadeToplam() {
		return kisaVadeToplam;
	}


	public void setKisaVadeToplam(Double kisaVadeToplam) {
		this.kisaVadeToplam = kisaVadeToplam;
	}


	public Double getUzunVadeToplam() {
		return uzunVadeToplam;
	}


	public void setUzunVadeToplam(Double uzunVadeToplam) {
		this.uzunVadeToplam = uzunVadeToplam;
	}


}

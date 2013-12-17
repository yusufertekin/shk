package com.deloitte.shk.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Dipnot;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.entity.UcakFilo;
import com.deloitte.shk.enums.Tablo;
import com.deloitte.shk.generic.GenericBean;
import com.deloitte.shk.generic.GenericService;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.services.UcakFiloService;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class UcakFiloBean extends GenericBean<UcakFilo,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject UcakFiloService ucakFiloService;
	@Inject @CurrentUser Kullanici currentUser;
	
	private List<UcakFilo> filoyaGirenList;
	private List<UcakFilo> filodanCikanList;
	
	private UcakFilo instanceAdet;
	
	private Long girenToplam;
	private Long cikanToplam;
	private Long donemSonToplam;
	private Long adet;
	
	@Override
	public GenericService<UcakFilo,Long> getEntityService() {
		// TODO Auto-generated method stub
		return ucakFiloService;
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
		Dipnot tmp = ucakFiloService.findDipnotByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), Tablo.UCAKFILO.getValue());
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
	@Override
	public void remove(UcakFilo instance) {
		// TODO Auto-generated method stub
		super.remove(instance);
		getInstance().setTip(0L);
	}
	public String initPage() {
		// TODO Auto-generated method stub
		newInstance();
		instanceAdet = new UcakFilo();
		getInstance().setDonem(getDonemList().get(0));
		setSelectedDonem(getDonemList().get(0));
		getInstance().setTip(0L);
		girenToplam = new Long(0);
		cikanToplam = new Long(0);
		donemSonToplam = new Long(0);
		sorgula();
		return "/xhtml/user/ucakFilo.xhtml?faces-redirect=true";
	}
	
	public void loadLists()
	{
		girenToplam = new Long(0);
		cikanToplam = new Long(0);
		donemSonToplam = new Long(0); 
		filoyaGirenList = ucakFiloService.findByDonemAndCompanyAndTip(getInstance().getDonem(), getInstance().getCompany(), 0L);
		filodanCikanList = ucakFiloService.findByDonemAndCompanyAndTip(getInstance().getDonem(), getInstance().getCompany(), 1L);
		UcakFilo adet = ucakFiloService.findAdetByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany());
		for (UcakFilo ucak : filoyaGirenList) {
			girenToplam = girenToplam + ucak.getAdet();
		}
		for (UcakFilo ucak : filodanCikanList) {
			cikanToplam = cikanToplam + ucak.getAdet();
		}
		
		if(adet!=null && adet.getAdet() != null)
		{
			instanceAdet = adet;
			donemSonToplam = girenToplam - cikanToplam + adet.getAdet();
		}
		else
		{
			donemSonToplam = girenToplam - cikanToplam;
		}
	}
	
	
	public void update(UcakFilo instance) {
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
		try {
			getEntityService().save(getInstance());
			instanceAdet.setCompany(getInstance().getCompany());
			instanceAdet.setDonem(getInstance().getDonem());
			instanceAdet.setTip(2L);
			getEntityService().save(instanceAdet);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			addMessage("common.saveError");
			return;
		}
		newInstance();
		addMessage("common.saveSuccessful");
		getInstance().setTip(0L);
		loadLists();
	}
	
	public List<UcakFilo> getFiloyaGirenList() {
		return filoyaGirenList;
	}


	public void setFiloyaGirenList(List<UcakFilo> filoyaGirenList) {
		this.filoyaGirenList = filoyaGirenList;
	}


	public List<UcakFilo> getFilodanCikanList() {
		return filodanCikanList;
	}


	public void setFilodanCikanList(List<UcakFilo> filodanCikanList) {
		this.filodanCikanList = filodanCikanList;
	}


	public UcakFilo getInstanceAdet() {
		return instanceAdet;
	}


	public void setInstanceAdet(UcakFilo instanceAdet) {
		this.instanceAdet = instanceAdet;
	}


	public Long getGirenToplam() {
		return girenToplam;
	}


	public void setGirenToplam(Long girenToplam) {
		this.girenToplam = girenToplam;
	}


	public Long getCikanToplam() {
		return cikanToplam;
	}


	public void setCikanToplam(Long cikanToplam) {
		this.cikanToplam = cikanToplam;
	}


	public Long getDonemSonToplam() {
		return donemSonToplam;
	}


	public void setDonemSonToplam(Long donemSonToplam) {
		this.donemSonToplam = donemSonToplam;
	}


	public Long getAdet() {
		return adet;
	}


	public void setAdet(Long adet) {
		this.adet = adet;
	}

}

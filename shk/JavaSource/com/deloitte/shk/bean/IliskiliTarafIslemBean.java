package com.deloitte.shk.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Dipnot;
import com.deloitte.shk.entity.IliskiliTarafIslem;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.enums.Tablo;
import com.deloitte.shk.generic.GenericBean;
import com.deloitte.shk.generic.GenericService;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.services.IliskiliTarafIslemService;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class IliskiliTarafIslemBean extends GenericBean<IliskiliTarafIslem,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject IliskiliTarafIslemService iliskiliTarafIslemService;
	@Inject @CurrentUser Kullanici currentUser;
	
	private List<IliskiliTarafIslem> ortakList;
	private List<IliskiliTarafIslem> aileBireyList;
	private List<IliskiliTarafIslem> ustDuzeyYonList;
	private List<IliskiliTarafIslem> digerIliskiliTarafList;
	
	
	private Double toplam1;
	private Double toplam2;
	private Double toplam3;
	private Double toplam4;
	private Double toplam5;
	private Double toplam6;
	private Double toplam7;
	private Double toplam8;
	
	@Override
	public GenericService<IliskiliTarafIslem,Long> getEntityService() {
		// TODO Auto-generated method stub
		return iliskiliTarafIslemService;
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
		Dipnot tmp = iliskiliTarafIslemService.findDipnotByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), Tablo.ILISKILITARAFISLEM.getValue());
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

	public void initToplams()
	{
		toplam1 = new Double(0);
		toplam2 = new Double(0);
		toplam3 = new Double(0);
		toplam4 = new Double(0);
		toplam5 = new Double(0);
		toplam6 = new Double(0);
		toplam7 = new Double(0);
		toplam8 = new Double(0);
	}
	public String initPage() {
		// TODO Auto-generated method stub
		newInstance();
		getInstance().setDonem(getDonemList().get(0));
		setSelectedDonem(getDonemList().get(0));
		getInstance().setTip(0L);
		initToplams();
		sorgula();
		return "/xhtml/user/iliskiliTarafIslem.xhtml?faces-redirect=true";
	}
	@Override
	public void remove(IliskiliTarafIslem instance) {
		// TODO Auto-generated method stub
		super.remove(instance);
		getInstance().setTip(0L);
		loadLists();
	}
	
	public void loadLists()
	{
		initToplams();
		ortakList = iliskiliTarafIslemService.findByDonemAndCompanyAndTip(getInstance().getDonem(), getInstance().getCompany(), 0L);
		aileBireyList = iliskiliTarafIslemService.findByDonemAndCompanyAndTip(getInstance().getDonem(), getInstance().getCompany(), 1L);
		ustDuzeyYonList = iliskiliTarafIslemService.findByDonemAndCompanyAndTip(getInstance().getDonem(), getInstance().getCompany(), 2L);
		digerIliskiliTarafList = iliskiliTarafIslemService.findByDonemAndCompanyAndTip(getInstance().getDonem(), getInstance().getCompany(), 3L);
		for (IliskiliTarafIslem iliskiliTaraf : ortakList) {
			toplam1 = toplam1 + iliskiliTaraf.getMalHizmetAlim();
			toplam2 = toplam2 + iliskiliTaraf.getMalHizmetSatis();
			toplam3 = toplam3 + iliskiliTaraf.getFaizGelir();
			toplam4 = toplam4 + iliskiliTaraf.getFaizGider();
			toplam5 = toplam5 + iliskiliTaraf.getKiraGelir();
			toplam6 = toplam6 + iliskiliTaraf.getKiraGider();
			toplam7 = toplam7 + iliskiliTaraf.getSabitKiymetSatis();
			toplam8 = toplam8 + iliskiliTaraf.getKomisyonGider();
		}
		for (IliskiliTarafIslem iliskiliTaraf : aileBireyList) {
			toplam1 = toplam1 + iliskiliTaraf.getMalHizmetAlim();
			toplam2 = toplam2 + iliskiliTaraf.getMalHizmetSatis();
			toplam3 = toplam3 + iliskiliTaraf.getFaizGelir();
			toplam4 = toplam4 + iliskiliTaraf.getFaizGider();
			toplam5 = toplam5 + iliskiliTaraf.getKiraGelir();
			toplam6 = toplam6 + iliskiliTaraf.getKiraGider();
			toplam7 = toplam7 + iliskiliTaraf.getSabitKiymetSatis();
			toplam8 = toplam8 + iliskiliTaraf.getKomisyonGider();
		}
		
		for (IliskiliTarafIslem iliskiliTaraf : ustDuzeyYonList) {
			toplam1 = toplam1 + iliskiliTaraf.getMalHizmetAlim();
			toplam2 = toplam2 + iliskiliTaraf.getMalHizmetSatis();
			toplam3 = toplam3 + iliskiliTaraf.getFaizGelir();
			toplam4 = toplam4 + iliskiliTaraf.getFaizGider();
			toplam5 = toplam5 + iliskiliTaraf.getKiraGelir();
			toplam6 = toplam6 + iliskiliTaraf.getKiraGider();
			toplam7 = toplam7 + iliskiliTaraf.getSabitKiymetSatis();
			toplam8 = toplam8 + iliskiliTaraf.getKomisyonGider();
		}
		
		for (IliskiliTarafIslem iliskiliTaraf : digerIliskiliTarafList) {
			toplam1 = toplam1 + iliskiliTaraf.getMalHizmetAlim();
			toplam2 = toplam2 + iliskiliTaraf.getMalHizmetSatis();
			toplam3 = toplam3 + iliskiliTaraf.getFaizGelir();
			toplam4 = toplam4 + iliskiliTaraf.getFaizGider();
			toplam5 = toplam5 + iliskiliTaraf.getKiraGelir();
			toplam6 = toplam6 + iliskiliTaraf.getKiraGider();
			toplam7 = toplam7 + iliskiliTaraf.getSabitKiymetSatis();
			toplam8 = toplam8 + iliskiliTaraf.getKomisyonGider();
		}
		
	}
	
	
	public void update(IliskiliTarafIslem instance) {
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
	
	public List<IliskiliTarafIslem> getOrtakList() {
		return ortakList;
	}


	public void setOrtakList(List<IliskiliTarafIslem> ortakList) {
		this.ortakList = ortakList;
	}


	public List<IliskiliTarafIslem> getAileBireyList() {
		return aileBireyList;
	}


	public void setAileBireyList(List<IliskiliTarafIslem> aileBireyList) {
		this.aileBireyList = aileBireyList;
	}


	public List<IliskiliTarafIslem> getUstDuzeyYonList() {
		return ustDuzeyYonList;
	}


	public void setUstDuzeyYonList(List<IliskiliTarafIslem> ustDuzeyYonList) {
		this.ustDuzeyYonList = ustDuzeyYonList;
	}


	public List<IliskiliTarafIslem> getDigerIliskiliTarafList() {
		return digerIliskiliTarafList;
	}


	public void setDigerIliskiliTarafList(List<IliskiliTarafIslem> digerIliskiliTarafList) {
		this.digerIliskiliTarafList = digerIliskiliTarafList;
	}



	public Double getToplam1() {
		return toplam1;
	}


	public void setToplam1(Double toplam1) {
		this.toplam1 = toplam1;
	}


	public Double getToplam2() {
		return toplam2;
	}


	public void setToplam2(Double toplam2) {
		this.toplam2 = toplam2;
	}


	public Double getToplam3() {
		return toplam3;
	}


	public void setToplam3(Double toplam3) {
		this.toplam3 = toplam3;
	}


	public Double getToplam4() {
		return toplam4;
	}


	public void setToplam4(Double toplam4) {
		this.toplam4 = toplam4;
	}


	public Double getToplam5() {
		return toplam5;
	}


	public void setToplam5(Double toplam5) {
		this.toplam5 = toplam5;
	}


	public Double getToplam6() {
		return toplam6;
	}


	public void setToplam6(Double toplam6) {
		this.toplam6 = toplam6;
	}


	public Double getToplam7() {
		return toplam7;
	}


	public void setToplam7(Double toplam7) {
		this.toplam7 = toplam7;
	}


	public Double getToplam8() {
		return toplam8;
	}


	public void setToplam8(Double toplam8) {
		this.toplam8 = toplam8;
	}
	

}

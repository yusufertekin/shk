package com.deloitte.shk.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.IliskiliTarafBakiye;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.generic.GenericBean;
import com.deloitte.shk.generic.GenericService;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.services.IliskiliTarafBakiyeService;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class IliskiliTarafBakiyeBean extends GenericBean<IliskiliTarafBakiye,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject IliskiliTarafBakiyeService iliskiliTarafBakiyeService;
	@Inject @CurrentUser Kullanici currentUser;
	
	private List<IliskiliTarafBakiye> ortakList;
	private List<IliskiliTarafBakiye> aileBireyList;
	private List<IliskiliTarafBakiye> ustDuzeyYonList;
	private List<IliskiliTarafBakiye> digerIliskiliTarafList;
	
	
	private Double toplam1;
	private Double toplam2;
	private Double toplam3;
	private Double toplam4;
	private Double toplam5;
	private Double toplam6;
	private Double toplam7;
	private Double toplam8;
	
	@Override
	public GenericService<IliskiliTarafBakiye,Long> getEntityService() {
		// TODO Auto-generated method stub
		return iliskiliTarafBakiyeService;
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
		return "/xhtml/user/iliskiliTarafBakiye.xhtml?faces-redirect=true";
	}
	@Override
	public void remove(IliskiliTarafBakiye instance) {
		// TODO Auto-generated method stub
		super.remove(instance);
		getInstance().setTip(0L);
	}
	
	public void loadLists()
	{
		initToplams();
		ortakList = iliskiliTarafBakiyeService.findByDonemAndCompanyAndTip(getInstance().getDonem(), getInstance().getCompany(), 0L);
		aileBireyList = iliskiliTarafBakiyeService.findByDonemAndCompanyAndTip(getInstance().getDonem(), getInstance().getCompany(), 1L);
		ustDuzeyYonList = iliskiliTarafBakiyeService.findByDonemAndCompanyAndTip(getInstance().getDonem(), getInstance().getCompany(), 2L);
		digerIliskiliTarafList = iliskiliTarafBakiyeService.findByDonemAndCompanyAndTip(getInstance().getDonem(), getInstance().getCompany(), 3L);
		for (IliskiliTarafBakiye iliskiliTaraf : ortakList) {
			toplam1 = toplam1 + iliskiliTaraf.getTicariKisaAlacak();
			toplam2 = toplam2 + iliskiliTaraf.getTicariOlmayanKisaAlacak();
			toplam3 = toplam3 + iliskiliTaraf.getTicariUzunAlacak();
			toplam4 = toplam4 + iliskiliTaraf.getTicariOlmayanUzunAlacak();
			toplam5 = toplam5 + iliskiliTaraf.getTicariKisaBorc();
			toplam6 = toplam6 + iliskiliTaraf.getTicariOlmayanKisaBorc();
			toplam7 = toplam7 + iliskiliTaraf.getTicariUzunBorc();
			toplam8 = toplam8 + iliskiliTaraf.getTicariOlmayanUzunBorc();
		}
		for (IliskiliTarafBakiye iliskiliTaraf : aileBireyList) {
			toplam1 = toplam1 + iliskiliTaraf.getTicariKisaAlacak();
			toplam2 = toplam2 + iliskiliTaraf.getTicariOlmayanKisaAlacak();
			toplam3 = toplam3 + iliskiliTaraf.getTicariUzunAlacak();
			toplam4 = toplam4 + iliskiliTaraf.getTicariOlmayanUzunAlacak();
			toplam5 = toplam5 + iliskiliTaraf.getTicariKisaBorc();
			toplam6 = toplam6 + iliskiliTaraf.getTicariOlmayanKisaBorc();
			toplam7 = toplam7 + iliskiliTaraf.getTicariUzunBorc();
			toplam8 = toplam8 + iliskiliTaraf.getTicariOlmayanUzunBorc();
		}
		
		for (IliskiliTarafBakiye iliskiliTaraf : ustDuzeyYonList) {
			toplam1 = toplam1 + iliskiliTaraf.getTicariKisaAlacak();
			toplam2 = toplam2 + iliskiliTaraf.getTicariOlmayanKisaAlacak();
			toplam3 = toplam3 + iliskiliTaraf.getTicariUzunAlacak();
			toplam4 = toplam4 + iliskiliTaraf.getTicariOlmayanUzunAlacak();
			toplam5 = toplam5 + iliskiliTaraf.getTicariKisaBorc();
			toplam6 = toplam6 + iliskiliTaraf.getTicariOlmayanKisaBorc();
			toplam7 = toplam7 + iliskiliTaraf.getTicariUzunBorc();
			toplam8 = toplam8 + iliskiliTaraf.getTicariOlmayanUzunBorc();
		}
		
		for (IliskiliTarafBakiye iliskiliTaraf : digerIliskiliTarafList) {
			toplam1 = toplam1 + iliskiliTaraf.getTicariKisaAlacak();
			toplam2 = toplam2 + iliskiliTaraf.getTicariOlmayanKisaAlacak();
			toplam3 = toplam3 + iliskiliTaraf.getTicariUzunAlacak();
			toplam4 = toplam4 + iliskiliTaraf.getTicariOlmayanUzunAlacak();
			toplam5 = toplam5 + iliskiliTaraf.getTicariKisaBorc();
			toplam6 = toplam6 + iliskiliTaraf.getTicariOlmayanKisaBorc();
			toplam7 = toplam7 + iliskiliTaraf.getTicariUzunBorc();
			toplam8 = toplam8 + iliskiliTaraf.getTicariOlmayanUzunBorc();
		}
		
	}
	
	
	public void update(IliskiliTarafBakiye instance) {
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
	
	public List<IliskiliTarafBakiye> getOrtakList() {
		return ortakList;
	}


	public void setOrtakList(List<IliskiliTarafBakiye> ortakList) {
		this.ortakList = ortakList;
	}


	public List<IliskiliTarafBakiye> getAileBireyList() {
		return aileBireyList;
	}


	public void setAileBireyList(List<IliskiliTarafBakiye> aileBireyList) {
		this.aileBireyList = aileBireyList;
	}


	public List<IliskiliTarafBakiye> getUstDuzeyYonList() {
		return ustDuzeyYonList;
	}


	public void setUstDuzeyYonList(List<IliskiliTarafBakiye> ustDuzeyYonList) {
		this.ustDuzeyYonList = ustDuzeyYonList;
	}


	public List<IliskiliTarafBakiye> getDigerIliskiliTarafList() {
		return digerIliskiliTarafList;
	}


	public void setDigerIliskiliTarafList(List<IliskiliTarafBakiye> digerIliskiliTarafList) {
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

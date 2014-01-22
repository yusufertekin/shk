package com.deloitte.shk.bean;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.ejb.TransactionManagement;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.qualifier.DonemList;
import com.deloitte.shk.services.BorcYaslandirmaService;
import com.deloitte.shk.services.CompanyService;
import com.deloitte.shk.services.DovizPozisyonService;
import com.deloitte.shk.services.IliskiliTarafBakiyeService;
import com.deloitte.shk.services.IliskiliTarafIslemService;
import com.deloitte.shk.services.IliskiliTarafTOService;
import com.deloitte.shk.services.IliskiliTaraflarService;
import com.deloitte.shk.services.KarZararService;
import com.deloitte.shk.services.KaynakService;
import com.deloitte.shk.services.NakitAkimService;
import com.deloitte.shk.services.OzkaynakService;
import com.deloitte.shk.services.ToplamCalisanService;
import com.deloitte.shk.services.TrafikStatService;
import com.deloitte.shk.services.UcakFiloService;
import com.deloitte.shk.services.UcakGiderService;
import com.deloitte.shk.services.VarlikService;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
@TransactionManagement
public class EksikTabloBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject @CurrentUser Kullanici currentUser;
	private @Inject @DonemList List<Donem> donemList;

	private Donem donem;

	@Inject CompanyService companyService;

	@Inject VarlikService varlikService;
	@Inject KaynakService kaynakService;
	@Inject KarZararService karZararService;
	@Inject NakitAkimService nakitAkimService;
	@Inject ToplamCalisanService toplamCalisanService;
	@Inject BorcYaslandirmaService borcYaslandirmaService;
	@Inject TrafikStatService trafikStatService;
	@Inject UcakGiderService ucakGiderService;
	@Inject DovizPozisyonService dovizPozisyonService;
	@Inject UcakFiloService ucakFiloService;
	@Inject IliskiliTarafBakiyeService IliskiliTarafBakiyeService;
	@Inject IliskiliTarafIslemService IliskiliTarafIslemService;
	@Inject IliskiliTaraflarService IliskiliTaraflarService;
	@Inject IliskiliTarafTOService IliskiliTarafTOService;
	@Inject OzkaynakService ozkaynakService;
	
	private List<Object[]> list;
	private List<String> listName;
	
	public static String formatDate(Date date, String pattern) {
	    if (date == null) {
	        return null;
	    }

	    if (pattern == null) {
	        throw new NullPointerException("pattern");
	    }

	    Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
	    return new SimpleDateFormat(pattern, locale).format(date);
	}
	public void sorgula()
	{
		Object[] o;
		initValues();
		for(Company comp : companyService.list()) {
			if (getDonem() == null){
				setDonem(donemList.get(0));
			}

			o = new Object[16];
			o[0] = varlikService.findByDonemAndCompany(getDonem(), comp)!=null?"TAMAM":" ";
			o[1] = kaynakService.findByDonemAndCompany(getDonem(), comp)!=null?"TAMAM":" ";
			o[2] = karZararService.findByDonemAndCompany(getDonem(), comp)!=null?"TAMAM":" ";
			o[3] = nakitAkimService.findByDonemAndCompany(getDonem(), comp)!=null?"TAMAM":" ";
			o[4] = toplamCalisanService.findByDonemAndCompany(getDonem(), comp)!=null?"TAMAM":" ";
			o[5] = borcYaslandirmaService.findByDonemAndCompany(getDonem(), comp)!=null?"TAMAM":" ";
			o[6] = trafikStatService.findByDonemAndCompany(getDonem(), comp)!=null?"TAMAM":" ";
			o[7] = ucakGiderService.findByDonemAndCompany(getDonem(), comp)!=null?"TAMAM":" ";
			o[8] = dovizPozisyonService.findByDonemAndCompany(getDonem(), comp)!=null?"TAMAM":" ";
			o[9] = ucakFiloService.findByDonemAndCompany(getDonem(), comp)!=null?"TAMAM":" ";
			o[10] = IliskiliTarafBakiyeService.findByDonemAndCompany(getDonem(), comp)!=null?"TAMAM":" ";
			o[11] = IliskiliTarafIslemService.findByDonemAndCompany(getDonem(), comp)!=null?"TAMAM":" ";
			o[12] = IliskiliTarafTOService.findByDonemAndCompany(getDonem(), comp)!=null?"TAMAM":" ";
			o[13] = IliskiliTaraflarService.findByDonemAndCompany(getDonem(), comp)!=null?"TAMAM":" ";
			o[14] = ozkaynakService.findByDonemAndCompany(getDonem(), comp)!=null?"TAMAM":" ";
			listName.add(comp.getName());
			list.add(o);
		}
	}
	public void initValues()
	{
		list = new ArrayList<Object[]>();
		listName = new ArrayList<String>();
	}
	public String initPage() {
		// TODO Auto-generated method stub
		sorgula();
		return "/xhtml/admin/eksikTablo.xhtml?faces-redirect=true";
	}
	public Kullanici getCurrentUser() {
		return currentUser;
	}
	public void setCurrentUser(Kullanici currentUser) {
		this.currentUser = currentUser;
	}

	public List<Object[]> getList() {
		return this.list;
	}
	public void setList(List<Object[]> list) {
		this.list = list;
	}
	public Donem getDonem() {
		return donem;
	}
	public void setDonem(Donem donem) {
		this.donem = donem;
	}
	public List<String> getListName() {
		return listName;
	}
	public void setListName(List<String> listName) {
		this.listName = listName;
	}
	

}

package com.deloitte.shk.bean;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Dipnot;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.Kaynak;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.entity.Varlik;
import com.deloitte.shk.enums.Tablo;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.qualifier.DonemList;
import com.deloitte.shk.services.KaynakService;
import com.deloitte.shk.services.VarlikService;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class KarneBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject @CurrentUser Kullanici currentUser;
	private @Inject @DonemList List<Donem> donemList;
	
	@Inject VarlikService varlikService;
	@Inject KaynakService kaynakService;
	
	private Company company;
	private Donem donem;
	private Dipnot dipnot;
	private Double cariOran;
	private Double likiditeOran;
	private Double nakitOran;
	private Double alacakTahsilSure;
	private Double varlikDevirHizSure;
	private Double ticariBorcOdeme;
	private Double toplamBorcOzkaynak;
	private Double uzunVadeliBorcToplam;
	private Double toplamBorcVarlik;
	private Double finansmanGiderKarsilama;
	private Double borcServisKarsilama;
	private Varlik varlik;
	private Kaynak kaynak;
	
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
		initValues();
		if(currentUser.getCompany() != null && currentUser.getCompany().getCompanyId() != null)
		{
			try {
				setCompany((Company)currentUser.getCompany().clone());
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (getDonem() == null){
			setDonem(donemList.get(0));
		}
		Dipnot tmp = varlikService.findDipnotByDonemAndCompany(getDonem(), getCompany(), Tablo.KARNE.getValue());
		if(tmp != null)
		{
			setDipnot(tmp);
		}
		else
		{
			setDipnot(new Dipnot());
		}
		varlik = varlikService.findByDonemAndCompany(getDonem(), getCompany());
		kaynak = kaynakService.findByDonemAndCompany(getDonem(), getCompany());
		
	}
	public void initValues()
	{
		
		 cariOran = new Double(0);
		 likiditeOran = new Double(0);
		 nakitOran = new Double(0);
		 alacakTahsilSure = new Double(0);
		 varlikDevirHizSure = new Double(0);
		 ticariBorcOdeme = new Double(0);
		 toplamBorcOzkaynak = new Double(0);
		 uzunVadeliBorcToplam = new Double(0);
		 toplamBorcVarlik = new Double(0);
		 finansmanGiderKarsilama = new Double(0);
		 borcServisKarsilama = new Double(0);
		 setDipnot(new Dipnot());
//		 varlik = new Varlik();
//		 kaynak = new Kaynak(); 
	}
	public String initPage() {
		// TODO Auto-generated method stub
		sorgula();
		return "/xhtml/admin/karne.xhtml?faces-redirect=true";
	}
	public Kullanici getCurrentUser() {
		return currentUser;
	}
	public void setCurrentUser(Kullanici currentUser) {
		this.currentUser = currentUser;
	}
	public Double getCariOran() {
		if(varlik != null && kaynak != null){
			Double toplamDonenVarliklar = varlik.getToplamDonenVarliklar();
			Double toplamKisaVadeliYukumlulukler = kaynak.getToplamKisaVadeliYukumlulukler();
			cariOran = toplamDonenVarliklar/toplamKisaVadeliYukumlulukler;
		}
		return cariOran;
	}
	public void setCariOran(Double cariOran) {
		this.cariOran = cariOran;
	}
	public Double getLikiditeOran() {
		if(varlik != null && kaynak != null){
			Double likiditeOranPay = varlik.getLikiditeOranPay();
			Double toplamKisaVadeliYukumlulukler = kaynak.getToplamKisaVadeliYukumlulukler();
			likiditeOran = likiditeOranPay/toplamKisaVadeliYukumlulukler;
		}
		return likiditeOran;
	}
	public void setLikiditeOran(Double likiditeOran) {
		this.likiditeOran = likiditeOran;
	}
	public Double getNakitOran() {
		if(varlik != null && kaynak != null){
			Double nakitOranPay = varlik.getNakitOranPay();
			Double toplamKisaVadeliYukumlulukler = kaynak.getToplamKisaVadeliYukumlulukler();
			nakitOran = nakitOranPay/toplamKisaVadeliYukumlulukler;
		}
		return nakitOran;
	}
	public void setNakitOran(Double nakitOran) {
		this.nakitOran = nakitOran;
	}
	public Double getAlacakTahsilSure() {
		return alacakTahsilSure;
	}
	public void setAlacakTahsilSure(Double alacakTahsilSure) {
		this.alacakTahsilSure = alacakTahsilSure;
	}
	public Double getVarlikDevirHizSure() {
		return varlikDevirHizSure;
	}
	public void setVarlikDevirHizSure(Double varlikDevirHizSure) {
		this.varlikDevirHizSure = varlikDevirHizSure;
	}
	public Double getTicariBorcOdeme() {
		return ticariBorcOdeme;
	}
	public void setTicariBorcOdeme(Double ticariBorcOdeme) {
		this.ticariBorcOdeme = ticariBorcOdeme;
	}
	public Double getUzunVadeliBorcToplam() {
		return uzunVadeliBorcToplam;
	}
	public void setUzunVadeliBorcToplam(Double uzunVadeliBorcToplam) {
		this.uzunVadeliBorcToplam = uzunVadeliBorcToplam;
	}
	public Double getToplamBorcVarlik() {
		return toplamBorcVarlik;
	}
	public void setToplamBorcVarlik(Double toplamBorcVarlik) {
		this.toplamBorcVarlik = toplamBorcVarlik;
	}
	public Double getFinansmanGiderKarsilama() {
		return finansmanGiderKarsilama;
	}
	public void setFinansmanGiderKarsilama(Double finansmanGiderKarsilama) {
		this.finansmanGiderKarsilama = finansmanGiderKarsilama;
	}
	public Double getBorcServisKarsilama() {
		return borcServisKarsilama;
	}
	public void setBorcServisKarsilama(Double borcServisKarsilama) {
		this.borcServisKarsilama = borcServisKarsilama;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Donem getDonem() {
		return donem;
	}
	public void setDonem(Donem donem) {
		this.donem = donem;
	}
	public Double getToplamBorcOzkaynak() {
		return toplamBorcOzkaynak;
	}
	public void setToplamBorcOzkaynak(Double toplamBorcOzkaynak) {
		this.toplamBorcOzkaynak = toplamBorcOzkaynak;
	}
	public Dipnot getDipnot() {
		return dipnot;
	}
	public void setDipnot(Dipnot dipnot) {
		this.dipnot = dipnot;
	}
	

}

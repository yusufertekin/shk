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
import com.deloitte.shk.entity.KarZarar;
import com.deloitte.shk.entity.Karne;
import com.deloitte.shk.entity.Kaynak;
import com.deloitte.shk.entity.Varlik;
import com.deloitte.shk.qualifier.DonemList;
import com.deloitte.shk.services.KarZararService;
import com.deloitte.shk.services.KaynakService;
import com.deloitte.shk.services.VarlikService;
import com.deloitte.shk.util.FuncUtils;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class KarneBeanSektorOrt implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private @Inject @DonemList List<Donem> donemList;
	
	@Inject VarlikService varlikService;
	@Inject KaynakService kaynakService;
	@Inject KarZararService karZararService;
	
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
	private KarZarar karZarar;
	
	private Karne karne;
	
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
		if (getDonem() == null){
			setDonem(donemList.get(0));
		}
		varlik = varlikService.findByDonemAndCompany(getDonem(), getCompany());
		kaynak = kaynakService.findByDonemAndCompany(getDonem(), getCompany());
		karZarar = karZararService.findByDonemAndCompany(getDonem(), getCompany());

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
	}
	public String initPage() {
		// TODO Auto-generated method stub
		sorgula();
		return "/xhtml/admin/karne.xhtml?faces-redirect=true";
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
		if(varlik != null && karZarar != null){
			Double ticariAlacak = varlik.getTicariAlacak();
			Double toplamHasilat = karZarar.getToplamHasilat();
			alacakTahsilSure = FuncUtils.getYilbasindanBeriGecenGun(getDonem().getDonem())/toplamHasilat/ticariAlacak;  //TODO Bir önceki yilin ticari alacagi ile ortalama almali
		}
		return alacakTahsilSure;
	}
	public void setAlacakTahsilSure(Double alacakTahsilSure) {
		this.alacakTahsilSure = alacakTahsilSure;
	}
	public Double getVarlikDevirHizSure() {
		if(varlik != null && karZarar != null){
			Double toplamVarliklar = varlik.getToplamVarliklar();
			Double toplamHasilat = karZarar.getToplamHasilat();
			varlikDevirHizSure = (toplamVarliklar/toplamHasilat)*FuncUtils.getYilbasindanBeriGecenGun(getDonem().getDonem());
		}
		return varlikDevirHizSure;
	}
	public void setVarlikDevirHizSure(Double varlikDevirHizSure) {
		this.varlikDevirHizSure = varlikDevirHizSure;
	}

	public Double getTicariBorcOdeme() {
		if(kaynak != null && karZarar != null){
			Double toplamFaaliyetGideri = karZarar.getToplamFaailyetGiderleri();
			Double ticariBorclar = kaynak.getTicariBorc();
			ticariBorcOdeme = -1 * FuncUtils.getYilbasindanBeriGecenGun(getDonem().getDonem()) / toplamFaaliyetGideri / ticariBorclar;
		}
		return ticariBorcOdeme;
	}
	public void setTicariBorcOdeme(Double ticariBorcOdeme) {
		this.ticariBorcOdeme = ticariBorcOdeme;
	}
	public Double getUzunVadeliBorcToplam() {
		if(varlik != null && kaynak != null){
			Double toplamVarliklar = varlik.getToplamVarliklar();
			Double toplamUzunVadeliYukumlulukler = kaynak.getToplamUzunVadeliYukumlulukler();
			uzunVadeliBorcToplam = toplamUzunVadeliYukumlulukler/toplamVarliklar;
		}
		return uzunVadeliBorcToplam;
	}
	public void setUzunVadeliBorcToplam(Double uzunVadeliBorcToplam) {
		this.uzunVadeliBorcToplam = uzunVadeliBorcToplam;
	}
	public Double getToplamBorcVarlik() {
		if(kaynak != null && varlik != null){
			Double toplamVarliklar = varlik.getToplamVarliklar();
			Double toplamYukumlulukler = kaynak.getToplamUzunVadeliYukumlulukler() + kaynak.getToplamKisaVadeliYukumlulukler();
			toplamBorcVarlik = toplamYukumlulukler/toplamVarliklar;
		}
		return toplamBorcVarlik;
	}
	public void setToplamBorcVarlik(Double toplamBorcVarlik) {
		this.toplamBorcVarlik = toplamBorcVarlik;
	}
	public Double getFinansmanGiderKarsilama() {
		if(karZarar != null){
			Double gider = karZarar.getFinansalKiralamaFaizGider() + karZarar.getFinansalGider();
			finansmanGiderKarsilama = -1 * getEbitda() / gider;
		}
		return finansmanGiderKarsilama;
	}
	public void setFinansmanGiderKarsilama(Double finansmanGiderKarsilama) {
		this.finansmanGiderKarsilama = finansmanGiderKarsilama;
	}
	public Double getBorcServisKarsilama() {
		if(karZarar != null && kaynak != null){
			Double gider = karZarar.getFinansalKiralamaFaizGider() + karZarar.getFinansalGider();
			Double kaynaklar = kaynak.getFinansalBorclar() + kaynak.getUzunVadeliKrediKisaKisim() + kaynak.getFinansalKiralama();
			borcServisKarsilama = 2 * getEbitda() / (-1 * (gider + kaynaklar));
		}
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
		if(kaynak != null && karZarar != null){
			Double anaOrtakligaAitOzkaynaklar = kaynak.getAnaOrtakligaAitOzkaynaklarToplamiNetKarZararHaric() + karZarar.getAnaOrtaklikNetKar();
			Double toplamYukumlulukler = kaynak.getToplamKisaVadeliYukumlulukler() + kaynak.getToplamUzunVadeliYukumlulukler();
			toplamBorcOzkaynak = toplamYukumlulukler / anaOrtakligaAitOzkaynaklar;
		}
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
	
	public Double getEbitda(){
		Double ebitda = 0.0;
		if(karZarar != null){
			ebitda = karZarar.getNetKarZarar() - (karZarar.getVergiGiderGelir() + karZarar.getErtelenmisVergiGiderGelir() + karZarar.getOzkaynakYontemiyleKarZarar() 
													+ karZarar.getFinansalKiralamaFaizGider() + karZarar.getFinansalGelir() + karZarar.getFinansalGider() 
													+ karZarar.getKurFarkiKarZarar() + karZarar.getTurevFinansalAracKarZarar() + karZarar.getYerEkipmanAmortismanGider() 
													+ karZarar.getYerEkipmanDegerDusukGider() 
													+ karZarar.getUcusEkipmanAmortismanGider() + karZarar.getUcusEkipmanDegerDusukGider() + karZarar.getUcusEkipmanBakimGider()
													+ karZarar.getAktiflesenBakimGider());
		}
		return ebitda;
	}

}

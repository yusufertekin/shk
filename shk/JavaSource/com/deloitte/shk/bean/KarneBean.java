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
import com.deloitte.shk.entity.Kaynak;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.entity.Varlik;
import com.deloitte.shk.enums.Tablo;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.qualifier.DonemList;
import com.deloitte.shk.services.CompanyService;
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
public class KarneBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject @CurrentUser Kullanici currentUser;
	private @Inject @DonemList List<Donem> donemList;
	
	@Inject VarlikService varlikService;
	@Inject KaynakService kaynakService;
	@Inject KarZararService karZararService;
	@Inject CompanyService companyService;
	
	private Company company;
	private Company companySO;
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
	private Double yilSonuOzKaynakYeterliligi;
	private Double donemNetKarZarar;


	private Double cariOranSO;
	private Double likiditeOranSO;
	private Double nakitOranSO;
	private Double alacakTahsilSureSO;
	private Double varlikDevirHizSureSO;
	private Double ticariBorcOdemeSO;
	private Double toplamBorcOzkaynakSO;
	private Double uzunVadeliBorcToplamSO;
	private Double toplamBorcVarlikSO;
	private Double finansmanGiderKarsilamaSO;
	private Double borcServisKarsilamaSO;
	private Double yilSonuOzKaynakYeterliligiSO;
	
	private Varlik varlik;
	private Kaynak kaynak;
	private KarZarar karZarar;
	
	private boolean ortSorgula = false;
	
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
		initValuesAll();
		
		if(ortSorgula){
			sorgulaOrt();
		}
		
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
		karZarar = karZararService.findByDonemAndCompany(getDonem(), getCompany());
		donemNetKarZarar = karZararService.findDonemNetKarZarar(getDonem(), getCompany());
		
	}
	
	public void sorgulaOrt()
	{
		int count = 0;
		initOrtValues();
		for(Company comp : companyService.list()) {
			if (getDonem() == null){
				setDonem(donemList.get(0));
			}
			initValues();
			varlik = varlikService.findByDonemAndCompany(getDonem(), comp);
			kaynak = kaynakService.findByDonemAndCompany(getDonem(), comp);
			karZarar = karZararService.findByDonemAndCompany(getDonem(), comp);
			
			cariOranSO += getCariOran();
			likiditeOranSO += getLikiditeOran();
			nakitOranSO += getNakitOran();
			alacakTahsilSureSO += getAlacakTahsilSure();
			varlikDevirHizSureSO += getVarlikDevirHizSure();
			ticariBorcOdemeSO += getTicariBorcOdeme();
			toplamBorcOzkaynakSO += getToplamBorcOzkaynak();
			uzunVadeliBorcToplamSO += getUzunVadeliBorcToplam();
			toplamBorcVarlikSO += getToplamBorcVarlik();
			finansmanGiderKarsilamaSO += getFinansmanGiderKarsilama();
			borcServisKarsilamaSO += getBorcServisKarsilama();
			yilSonuOzKaynakYeterliligiSO += getYilSonuOzKaynakYeterliligi();

			
			count++;
		}

		cariOranSO = cariOranSO/count;
		likiditeOranSO = likiditeOranSO/count;
		nakitOranSO = nakitOranSO/count;
		alacakTahsilSureSO = alacakTahsilSureSO/count;
		varlikDevirHizSureSO = varlikDevirHizSureSO/count;
		ticariBorcOdemeSO = ticariBorcOdemeSO/count;
		toplamBorcOzkaynakSO = toplamBorcOzkaynakSO/count;
		uzunVadeliBorcToplamSO = uzunVadeliBorcToplamSO/count;
		toplamBorcVarlikSO = toplamBorcVarlikSO/count;
		finansmanGiderKarsilamaSO = finansmanGiderKarsilamaSO/count;
		borcServisKarsilamaSO = borcServisKarsilamaSO/count;
		yilSonuOzKaynakYeterliligiSO = yilSonuOzKaynakYeterliligiSO/count;

		ortSorgula = false;
		
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
		 borcServisKarsilama = new Double(0);
		 yilSonuOzKaynakYeterliligi = new Double(0);
		 
		 setDipnot(new Dipnot());
	}

	public void initValuesAll()
	{
		initValues();
		setDipnot(new Dipnot());
	}

	public void initOrtValues()
	{
		
		 cariOranSO = new Double(0);
		 likiditeOranSO = new Double(0);
		 nakitOranSO = new Double(0);
		 alacakTahsilSureSO = new Double(0);
		 varlikDevirHizSureSO = new Double(0);
		 ticariBorcOdemeSO = new Double(0);
		 toplamBorcOzkaynakSO = new Double(0);
		 uzunVadeliBorcToplamSO = new Double(0);
		 toplamBorcVarlikSO = new Double(0);
		 finansmanGiderKarsilamaSO = new Double(0);
		 borcServisKarsilamaSO = new Double(0);
		 yilSonuOzKaynakYeterliligiSO = new Double(0);
	}

	public String initPage() {
		boolean initPageOrtSorgula;
		
		initPageOrtSorgula = ortSorgula;
		ortSorgula = false;
		sorgula();
		ortSorgula = initPageOrtSorgula;
		sorgulaOrt();
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
		if(varlik != null && karZarar != null){
			Double ticariAlacak = varlik.getTicariAlacak();
			Double toplamHasilat = karZarar.getToplamHasilat();
			alacakTahsilSure = FuncUtils.getYilbasindanBeriGecenGun(getDonem().getDonem())/(toplamHasilat/ticariAlacak);  //TODO Bir önceki yilin ticari alacagi ile ortalama almali
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
			ticariBorcOdeme = -1 * (FuncUtils.getYilbasindanBeriGecenGun(getDonem().getDonem()) / (toplamFaaliyetGideri / ticariBorclar));
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
			borcServisKarsilama = getEbitda() / (gider + kaynaklar);
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
		if (donem != null && this.donem != null && donem.getDonem().compareTo(this.donem.getDonem()) != 0) {
			ortSorgula = true;
		}
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
													+ karZarar.getUcusEkipmanDegerDusukGider()
													+ karZarar.getAktiflesenBakimGider());
		}
		return ebitda;
	}

	public Double getYilSonuOzKaynakYeterliligi() {
		if(kaynak != null){
			Double sermaye = kaynak.getSermaye();
			Double toplamOzKaynaklar = kaynak.getKontrolGucuOlmayan() + donemNetKarZarar + kaynak.getSermaye() 
										+ kaynak.getSermayeDuzeltmeFark() + kaynak.getHisseSenediIhracPrim() + kaynak.getKardanAyrilanKisitYedek() 
										+ kaynak.getYabanciParaCevrimFarki() + kaynak.getFinansalRisktenKorunmaFon() 
										+ kaynak.getDuranVarlikDegerFonu() + kaynak.getFinansalVarlikDegerFonu() + kaynak.getGecmisYillarKarZarar();
			if (sermaye > toplamOzKaynaklar){
				yilSonuOzKaynakYeterliligi = kaynak.getOdenmisSermayeUSDKarsiligi() - (sermaye - toplamOzKaynaklar) * donemList.get(0).getDolarKur();
			}
		}
		return yilSonuOzKaynakYeterliligi;
	}

	public Company getCompanySO() {
		return companySO;
	}

	public void setCompanySO(Company companySO) {
		this.companySO = companySO;
	}

	public Double getCariOranSO() {
		return cariOranSO;
	}

	public void setCariOranSO(Double cariOranSO) {
		this.cariOranSO = cariOranSO;
	}

	public Double getLikiditeOranSO() {
		return likiditeOranSO;
	}

	public void setLikiditeOranSO(Double likiditeOranSO) {
		this.likiditeOranSO = likiditeOranSO;
	}

	public Double getNakitOranSO() {
		return nakitOranSO;
	}

	public void setNakitOranSO(Double nakitOranSO) {
		this.nakitOranSO = nakitOranSO;
	}

	public Double getAlacakTahsilSureSO() {
		return alacakTahsilSureSO;
	}

	public void setAlacakTahsilSureSO(Double alacakTahsilSureSO) {
		this.alacakTahsilSureSO = alacakTahsilSureSO;
	}

	public Double getVarlikDevirHizSureSO() {
		return varlikDevirHizSureSO;
	}

	public void setVarlikDevirHizSureSO(Double varlikDevirHizSureSO) {
		this.varlikDevirHizSureSO = varlikDevirHizSureSO;
	}

	public Double getTicariBorcOdemeSO() {
		return ticariBorcOdemeSO;
	}

	public void setTicariBorcOdemeSO(Double ticariBorcOdemeSO) {
		this.ticariBorcOdemeSO = ticariBorcOdemeSO;
	}

	public Double getToplamBorcOzkaynakSO() {
		return toplamBorcOzkaynakSO;
	}

	public void setToplamBorcOzkaynakSO(Double toplamBorcOzkaynakSO) {
		this.toplamBorcOzkaynakSO = toplamBorcOzkaynakSO;
	}

	public Double getUzunVadeliBorcToplamSO() {
		return uzunVadeliBorcToplamSO;
	}

	public void setUzunVadeliBorcToplamSO(Double uzunVadeliBorcToplamSO) {
		this.uzunVadeliBorcToplamSO = uzunVadeliBorcToplamSO;
	}

	public Double getToplamBorcVarlikSO() {
		return toplamBorcVarlikSO;
	}

	public void setToplamBorcVarlikSO(Double toplamBorcVarlikSO) {
		this.toplamBorcVarlikSO = toplamBorcVarlikSO;
	}

	public Double getFinansmanGiderKarsilamaSO() {
		return finansmanGiderKarsilamaSO;
	}

	public void setFinansmanGiderKarsilamaSO(Double finansmanGiderKarsilamaSO) {
		this.finansmanGiderKarsilamaSO = finansmanGiderKarsilamaSO;
	}

	public Double getBorcServisKarsilamaSO() {
		return borcServisKarsilamaSO;
	}

	public void setBorcServisKarsilamaSO(Double borcServisKarsilamaSO) {
		this.borcServisKarsilamaSO = borcServisKarsilamaSO;
	}

	public Double getYilSonuOzKaynakYeterliligiSO() {
		return yilSonuOzKaynakYeterliligiSO;
	}

	public void setYilSonuOzKaynakYeterliligiSO(Double yilSonuOzKaynakYeterliligiSO) {
		this.yilSonuOzKaynakYeterliligiSO = yilSonuOzKaynakYeterliligiSO;
	}

}

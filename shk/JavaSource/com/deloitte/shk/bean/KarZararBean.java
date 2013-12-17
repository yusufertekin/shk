package com.deloitte.shk.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Dipnot;
import com.deloitte.shk.entity.KarZarar;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.enums.Tablo;
import com.deloitte.shk.generic.GenericBean;
import com.deloitte.shk.generic.GenericService;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.services.KarZararService;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class KarZararBean extends GenericBean<KarZarar,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject KarZararService karZararService;
	@Inject @CurrentUser Kullanici currentUser;
	private KarZarar karZararGecmis;
	
	
	@Override
	public GenericService<KarZarar,Long> getEntityService() {
		// TODO Auto-generated method stub
		return karZararService;
	}

	@Override
	public void save() throws Exception {
		// TODO Auto-generated method stub
		Double toplam = getInstance().getAkaryakitGider() + getInstance().getAktiflesenBakimGider() + getInstance().getBellyKargoGelir() + getInstance().getDigerGelirler() +
				getInstance().getDigerGelirlerHasilat() + getInstance().getDigerGenelIdariGider() + getInstance().getDigerGiderler() + getInstance().getDigerSatisReklamGider() + getInstance().getDisHatHasilat() +
				getInstance().getErtelenmisVergiGiderGelir() + getInstance().getFinansalGelir() + getInstance().getFinansalGider() + getInstance().getFinansalKiralamaFaizGider() + getInstance().getHavaalaniVergiGuvenlik() +
				getInstance().getIcHatHasilat() + getInstance().getIkramGider() + getInstance().getKabinEkipGider() + getInstance().getKargoKomisyon() + getInstance().getKargoUcaklariKargoGelir() + getInstance().getKokpitEkipEgitimGider() +
				getInstance().getKokpitEkipGider() + getInstance().getKoltukKiraGider() + getInstance().getKonmaYerIstasyonGider() + getInstance().getKurFarkiKarZarar() +
				getInstance().getMaliMesuliyetSigortaGider() + getInstance().getOzkaynakYontemiyleKarZarar() + getInstance().getPersonelGider() + getInstance().getReklamGider() + getInstance().getSabitKiymetSatisKarZarar() +
				getInstance().getSupheliAlacakKarsilikGider() + getInstance().getTurevFinansalAracKarZarar() + getInstance().getUcakKiraGider() + getInstance().getUcusEkipmanAmortismanGider() + getInstance().getUcusEkipmanBakimGider() +
				getInstance().getUcusEkipmanDegerDusukGider() + getInstance().getUcusEkipmanKiraGider() + getInstance().getUcusEkipmanSigortaGider() + getInstance().getUcusIsletmeGider() + getInstance().getUstgecisGider() +
				getInstance().getVergiGiderGelir() + getInstance().getWetleaseGelir() + getInstance().getYerEkipmanAmortismanGider() + getInstance().getYerEkipmanDegerDusukGider() + getInstance().getYolcuKomisyon() +
				getInstance().getYurtdisiCharter() + getInstance().getYurticiCharter();
				
				
		
		if(getInstance().getAnaOrtaklikNetKar() + getInstance().getKontrolGucuOlmayanNetKar() != toplam)
		{
			addMessage("karZarar.karTutmuyor");
		}
		else
		{
			super.save();
		}
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
		Dipnot tmp = karZararService.findDipnotByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), Tablo.KARZARAR.getValue());
		if(tmp != null)
		{
			setDipnot(tmp);
		}
		else
		{
			setDipnot(new Dipnot());
		}
		KarZarar karZarar = karZararService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany());
//		Date donem = (Date) getInstance().getDonem().clone();
//		donem.setMonth(getInstance().getDonem().getMonth() - 3);
//		karZararGecmis = karZararService.findByDonemAndCompany(donem, getInstance().getCompany());
		if(karZarar != null)
		{
			setInstance(karZarar);
		}
		else
		{
			newInstance();
		}
	}
	public String initPage() {
		
		newInstance();
		getInstance().setDonem(getDonemList().get(0));
		setSelectedDonem(getDonemList().get(0));
		sorgula();
		return "/xhtml/user/karZarar.xhtml?faces-redirect=true";
	}

	public KarZarar getKarZararGecmis() {
		return karZararGecmis;
	}

	public void setKarZararGecmis(KarZarar karZararGecmis) {
		this.karZararGecmis = karZararGecmis;
	}


}

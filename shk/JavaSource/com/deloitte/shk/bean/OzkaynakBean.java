package com.deloitte.shk.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Dipnot;
import com.deloitte.shk.entity.KarZarar;
import com.deloitte.shk.entity.Kaynak;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.entity.Ozkaynak;
import com.deloitte.shk.enums.Tablo;
import com.deloitte.shk.generic.GenericBean;
import com.deloitte.shk.generic.GenericService;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.services.KarZararService;
import com.deloitte.shk.services.KaynakService;
import com.deloitte.shk.services.OzkaynakService;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class OzkaynakBean extends GenericBean<Ozkaynak,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject OzkaynakService ozkaynakService;
	@Inject @CurrentUser Kullanici currentUser;
	@Inject KarZararService karZararService;
	@Inject KaynakService kaynakService;
	private Ozkaynak instance1;
	private Ozkaynak instance2;
	private Ozkaynak instance3;
	private Ozkaynak instance4;
	private Ozkaynak instance5;
	private Ozkaynak instance6;
	private Ozkaynak instance7;
	private Ozkaynak instance8;
	private Ozkaynak instance9;
	private Ozkaynak instance10;
	
	private KarZarar karZarar;
	
	private Boolean instanceBoolean;
	private Boolean instance1Boolean;
	private Boolean instance2Boolean;
	private Boolean instance3Boolean;
	private Boolean instance4Boolean;
	private Boolean instance5Boolean;
	private Boolean instance6Boolean;
	private Boolean instance7Boolean;
	private Boolean instance8Boolean;
	private Boolean instance9Boolean;
	private Boolean instance10Boolean;
	private Boolean toplam1Boolean;
	private Boolean toplam2Boolean;
	
	
	@Override
	public GenericService<Ozkaynak,Long> getEntityService() {
		// TODO Auto-generated method stub
		return ozkaynakService;
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
		Dipnot tmp = ozkaynakService.findDipnotByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), Tablo.OZKAYNAK.getValue());
		if(tmp != null)
		{
			setDipnot(tmp);
		}
		else
		{
			setDipnot(new Dipnot());
		}
		Ozkaynak ozkaynak = ozkaynakService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 0L);
		Ozkaynak ozkaynak1 = ozkaynakService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 1L);
		Ozkaynak ozkaynak2 = ozkaynakService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 2L);
		Ozkaynak ozkaynak3 = ozkaynakService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 3L);
		Ozkaynak ozkaynak4 = ozkaynakService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 4L);
		Ozkaynak ozkaynak5 = ozkaynakService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 5L);
		Ozkaynak ozkaynak6 = ozkaynakService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 6L);
		Ozkaynak ozkaynak7 = ozkaynakService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 7L);
		Ozkaynak ozkaynak8 = ozkaynakService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 8L);
		Ozkaynak ozkaynak9 = ozkaynakService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 9L);
		Ozkaynak ozkaynak10 = ozkaynakService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 10L);
		karZarar = karZararService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany());
		if(ozkaynak != null)
		{
			setInstance(ozkaynak);
		}
		else
		{
			newInstance();
			getInstance().setColumnNumber(0L);
		}
		if(ozkaynak1 != null)
		{
			instance1 = ozkaynak1;
		}
		else
		{
			instance1 = new Ozkaynak();
			instance1.setColumnNumber(1L);
		}
		if(ozkaynak2 != null)
		{
			instance2 = ozkaynak2;
		}
		else
		{
			instance2 = new Ozkaynak();
			instance2.setColumnNumber(2L);
		}
		if(ozkaynak3 != null)
		{
			instance3 = ozkaynak3;
		}
		else
		{
			instance3 = new Ozkaynak();
			instance3.setColumnNumber(3L);
		}
		if(ozkaynak4 != null)
		{
			instance4 = ozkaynak4;
		}
		else
		{
			instance4 = new Ozkaynak();
			instance4.setColumnNumber(4L);
		}
		if(ozkaynak5 != null)
		{
			instance5 = ozkaynak5;
		}
		else
		{
			instance5 = new Ozkaynak();
			instance5.setColumnNumber(5L);
		}
		if(ozkaynak6 != null)
		{
			instance6 = ozkaynak6;
		}
		else
		{
			instance6 = new Ozkaynak();
			instance6.setColumnNumber(6L);
		}
		if(ozkaynak7 != null)
		{
			instance7 = ozkaynak7;
		}
		else
		{
			instance7 = new Ozkaynak();
			instance7.setColumnNumber(7L);
		}
		if(ozkaynak8 != null)
		{
			instance8 = ozkaynak8;
		}
		else
		{
			instance8 = new Ozkaynak();
			instance8.setColumnNumber(8L);
		}
		if(ozkaynak9 != null)
		{
			instance9 = ozkaynak9;
		}
		else
		{
			instance9 = new Ozkaynak();
			instance9.setColumnNumber(9L);
		}
		if(ozkaynak10 != null)
		{
			instance10 = ozkaynak10;
		}
		else
		{
			instance10 = new Ozkaynak();
			instance10.setColumnNumber(10L);
		}
		if(karZarar != null && karZarar.getAnaOrtaklikNetKar() != null)
		{
			instance9.setDonemKarZarar(karZarar.getAnaOrtaklikNetKar());
		}
		if(karZarar != null && karZarar.getKontrolGucuOlmayanNetKar() != null)
		{
			instance10.setDonemKarZarar(karZarar.getKontrolGucuOlmayanNetKar());
		}
		kontrol();
	}
	
	public void save() throws Exception {
		// TODO Auto-generated method stub
		instance1.setDonem(getInstance().getDonem());
		instance2.setDonem(getInstance().getDonem());
		instance3.setDonem(getInstance().getDonem());
		instance4.setDonem(getInstance().getDonem());
		instance5.setDonem(getInstance().getDonem());
		instance6.setDonem(getInstance().getDonem());
		instance7.setDonem(getInstance().getDonem());
		instance8.setDonem(getInstance().getDonem());
		instance9.setDonem(getInstance().getDonem());
		instance10.setDonem(getInstance().getDonem());
		instance1.setCompany(getInstance().getCompany());
		instance2.setCompany(getInstance().getCompany());
		instance3.setCompany(getInstance().getCompany());
		instance4.setCompany(getInstance().getCompany());
		instance5.setCompany(getInstance().getCompany());
		instance6.setCompany(getInstance().getCompany());
		instance7.setCompany(getInstance().getCompany());
		instance8.setCompany(getInstance().getCompany());
		instance9.setCompany(getInstance().getCompany());
		instance10.setCompany(getInstance().getCompany());
		try {
			ozkaynakService.save(getInstance(), instance1, instance2, instance3, instance4,instance5,instance6,instance7,instance8,instance9,instance10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			addMessage("common.saveError");
		}
		addMessage("common.saveSuccessful");
		kontrol();
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
				getEntityService().remove(instance5);
				getEntityService().remove(instance6);
				getEntityService().remove(instance7);
				getEntityService().remove(instance8);
				getEntityService().remove(instance9);
				getEntityService().remove(instance10);
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
	public void kontrol()
	{
		Double instanceToplam = new Double(0);
		Double instance1Toplam = new Double(0);
		Double instance2Toplam = new Double(0);
		Double instance3Toplam = new Double(0);
		Double instance4Toplam = new Double(0);
		Double instance5Toplam = new Double(0);
		Double instance6Toplam = new Double(0);
		Double instance7Toplam = new Double(0);
		Double instance8Toplam = new Double(0);
		Double instance9Toplam = new Double(0);
		Double instance10Toplam = new Double(0);
		Double toplam1 = new Double(0);
		Double toplam2 = new Double(0);
		if(getInstance() != null && getInstance().getIlkBakiye() != null && getInstance().getDonemKarZarar() != null &&  getInstance().getDigerKapsamliGelir() != null &&  getInstance().getSermayeArtisi()
				!= null &&  getInstance().getOdenenTemettuler() != null &&  getInstance().getBagliOrtaklikAlimiKaynakli() != null &&  getInstance().getKismiBagliOrtaklikSatis()
				!= null &&  getInstance().getTransfer() != null &&  getInstance().getDiger() != null)
		{
			instanceToplam = getInstance().getIlkBakiye() + getInstance().getDonemKarZarar() + getInstance().getDigerKapsamliGelir() + getInstance().getSermayeArtisi()
					+ getInstance().getOdenenTemettuler() + getInstance().getBagliOrtaklikAlimiKaynakli() + getInstance().getKismiBagliOrtaklikSatis()
					+ getInstance().getTransfer() + getInstance().getDiger();
		}
		
		if(instance1 != null && instance1.getIlkBakiye() != null && instance1.getDonemKarZarar() != null &&  instance1.getDigerKapsamliGelir() != null &&  instance1.getSermayeArtisi()
				!= null &&  instance1.getOdenenTemettuler() != null &&  instance1.getBagliOrtaklikAlimiKaynakli() != null &&  instance1.getKismiBagliOrtaklikSatis()
				!= null &&  instance1.getTransfer() != null &&  instance1.getDiger() != null)
		{
			instance1Toplam = instance1.getIlkBakiye() +  instance1.getDonemKarZarar() + instance1.getDigerKapsamliGelir() + instance1.getSermayeArtisi()
					+ instance1.getOdenenTemettuler() + instance1.getBagliOrtaklikAlimiKaynakli() + instance1.getKismiBagliOrtaklikSatis()
					+ instance1.getTransfer() + instance1.getDiger();
		}
		if(instance2 != null && instance2.getIlkBakiye() != null &&  instance2.getDonemKarZarar() != null &&  instance2.getDigerKapsamliGelir() != null &&  instance2.getSermayeArtisi()
				!= null &&  instance2.getOdenenTemettuler() != null &&  instance2.getBagliOrtaklikAlimiKaynakli() != null &&  instance2.getKismiBagliOrtaklikSatis()
				!= null &&  instance2.getTransfer() != null &&  instance2.getDiger() != null)
		{
			instance2Toplam = instance2.getIlkBakiye() + instance2.getDonemKarZarar() + instance2.getDigerKapsamliGelir() + instance2.getSermayeArtisi()
					+ instance2.getOdenenTemettuler() + instance2.getBagliOrtaklikAlimiKaynakli() + instance2.getKismiBagliOrtaklikSatis()
					+ instance2.getTransfer() + instance2.getDiger();
		}
		if(instance3 != null && instance3.getIlkBakiye() != null &&  instance3.getDonemKarZarar() != null &&  instance3.getDigerKapsamliGelir() != null &&  instance3.getSermayeArtisi()
				!= null &&  instance3.getOdenenTemettuler() != null &&  instance3.getBagliOrtaklikAlimiKaynakli() != null &&  instance3.getKismiBagliOrtaklikSatis()
				!= null &&  instance3.getTransfer() != null &&  instance3.getDiger() != null)
		{
			instance3Toplam = instance3.getIlkBakiye() +  instance3.getDonemKarZarar() + instance3.getDigerKapsamliGelir() + instance3.getSermayeArtisi()
					+ instance3.getOdenenTemettuler() + instance3.getBagliOrtaklikAlimiKaynakli() + instance3.getKismiBagliOrtaklikSatis()
					+ instance3.getTransfer() + instance3.getDiger();
		}
		if(instance4 != null && instance4.getIlkBakiye() != null &&  instance4.getDonemKarZarar() != null &&  instance4.getDigerKapsamliGelir() != null &&  instance4.getSermayeArtisi()
				!= null &&  instance4.getOdenenTemettuler() != null &&  instance4.getBagliOrtaklikAlimiKaynakli() != null &&  instance4.getKismiBagliOrtaklikSatis()
				!= null &&  instance4.getTransfer() != null &&  instance4.getDiger() != null)
		{
			instance4Toplam = instance4.getIlkBakiye() +  instance4.getDonemKarZarar() + instance4.getDigerKapsamliGelir() + instance4.getSermayeArtisi()
					+ instance4.getOdenenTemettuler() + instance4.getBagliOrtaklikAlimiKaynakli() + instance4.getKismiBagliOrtaklikSatis()
					+ instance4.getTransfer() + instance4.getDiger();
		}
		if(instance5 != null && instance5.getIlkBakiye() != null &&  instance5.getDonemKarZarar() != null &&  instance5.getDigerKapsamliGelir() != null &&  instance5.getSermayeArtisi()
				!= null &&  instance5.getOdenenTemettuler() != null &&  instance5.getBagliOrtaklikAlimiKaynakli() != null &&  instance5.getKismiBagliOrtaklikSatis()
				!= null &&  instance5.getTransfer() != null &&  instance5.getDiger() != null)
		{
			instance5Toplam = instance5.getIlkBakiye() +  instance5.getDonemKarZarar() + instance5.getDigerKapsamliGelir() + instance5.getSermayeArtisi()
					+ instance5.getOdenenTemettuler() + instance5.getBagliOrtaklikAlimiKaynakli() + instance5.getKismiBagliOrtaklikSatis()
					+ instance5.getTransfer() + instance5.getDiger();
		}
		if(instance6 != null && instance6.getIlkBakiye() != null &&  instance6.getDonemKarZarar() != null &&  instance6.getDigerKapsamliGelir() != null &&  instance6.getSermayeArtisi()
				!= null &&  instance6.getOdenenTemettuler() != null &&  instance6.getBagliOrtaklikAlimiKaynakli() != null &&  instance6.getKismiBagliOrtaklikSatis()
				!= null &&  instance6.getTransfer() != null &&  instance6.getDiger() != null)
		{
			instance6Toplam = instance6.getIlkBakiye() +  instance6.getDonemKarZarar() + instance6.getDigerKapsamliGelir() + instance6.getSermayeArtisi()
					+ instance6.getOdenenTemettuler() + instance6.getBagliOrtaklikAlimiKaynakli() + instance6.getKismiBagliOrtaklikSatis()
					+ instance6.getTransfer() + instance6.getDiger();
		}
		if(instance7 != null && instance7.getIlkBakiye() != null &&  instance7.getDonemKarZarar() != null &&  instance7.getDigerKapsamliGelir() != null &&  instance7.getSermayeArtisi()
				!= null &&  instance7.getOdenenTemettuler() != null &&  instance7.getBagliOrtaklikAlimiKaynakli() != null &&  instance7.getKismiBagliOrtaklikSatis()
				!= null &&  instance7.getTransfer() != null &&  instance7.getDiger() != null)
		{
			instance7Toplam = instance7.getIlkBakiye() +  instance7.getDonemKarZarar() + instance7.getDigerKapsamliGelir() + instance7.getSermayeArtisi()
					+ instance7.getOdenenTemettuler() + instance7.getBagliOrtaklikAlimiKaynakli() + instance7.getKismiBagliOrtaklikSatis()
					+ instance7.getTransfer() + instance7.getDiger();
		}
		if(instance8 != null && instance8.getIlkBakiye() != null &&  instance8.getDonemKarZarar() != null &&  instance8.getDigerKapsamliGelir() != null &&  instance8.getSermayeArtisi()
				!= null &&  instance8.getOdenenTemettuler() != null &&  instance8.getBagliOrtaklikAlimiKaynakli() != null &&  instance8.getKismiBagliOrtaklikSatis()
				!= null &&  instance8.getTransfer() != null &&  instance8.getDiger() != null)
		{
			instance8Toplam = instance8.getIlkBakiye() +  instance8.getDonemKarZarar() + instance8.getDigerKapsamliGelir() + instance8.getSermayeArtisi()
					+ instance8.getOdenenTemettuler() + instance8.getBagliOrtaklikAlimiKaynakli() + instance8.getKismiBagliOrtaklikSatis()
					+ instance8.getTransfer() + instance8.getDiger();
		}
		if(instance9 != null && instance9.getIlkBakiye() != null &&  instance9.getDonemKarZarar() != null &&  instance9.getDigerKapsamliGelir() != null &&  instance9.getSermayeArtisi()
				!= null &&  instance9.getOdenenTemettuler() != null &&  instance9.getBagliOrtaklikAlimiKaynakli() != null &&  instance9.getKismiBagliOrtaklikSatis()
				!= null &&  instance9.getTransfer() != null &&  instance9.getDiger() != null)
		{
			instance9Toplam = instance9.getIlkBakiye() +  instance9.getDonemKarZarar() + instance9.getDigerKapsamliGelir() + instance9.getSermayeArtisi()
					+ instance9.getOdenenTemettuler() + instance9.getBagliOrtaklikAlimiKaynakli() + instance9.getKismiBagliOrtaklikSatis()
					+ instance9.getTransfer() + instance9.getDiger();
		}
		if(instance10 != null && instance10.getIlkBakiye() != null &&  instance10.getDonemKarZarar() != null &&  instance10.getDigerKapsamliGelir() != null &&  instance10.getSermayeArtisi()
				!= null &&  instance10.getOdenenTemettuler() != null &&  instance10.getBagliOrtaklikAlimiKaynakli() != null &&  instance10.getKismiBagliOrtaklikSatis()
				!= null &&  instance10.getTransfer() != null &&  instance10.getDiger() != null)
		{
			instance10Toplam = instance10.getIlkBakiye() +  instance10.getDonemKarZarar() + instance10.getDigerKapsamliGelir() + instance10.getSermayeArtisi()
					+ instance10.getOdenenTemettuler() + instance10.getBagliOrtaklikAlimiKaynakli() + instance10.getKismiBagliOrtaklikSatis()
					+ instance10.getTransfer() + instance10.getDiger();
		}
		if(instance1Toplam != null && instance2Toplam != null && instance3Toplam != null && instance4Toplam != null && instance5Toplam != null && instance6Toplam != null && instance7Toplam
					!= null && instance8Toplam != null && instance9Toplam != null)
		{
			toplam1 = instance1Toplam + instance2Toplam + instance3Toplam + instance4Toplam + instance5Toplam + instance6Toplam + instance7Toplam
					+ instance8Toplam + instance9Toplam;
		}
		if(instance1Toplam != null && instance2Toplam != null && instance3Toplam != null && instance4Toplam != null && instance5Toplam != null && instance6Toplam != null && instance7Toplam
				!= null && instance8Toplam != null && instance9Toplam != null && instance10Toplam != null)
		{
			toplam2 = instance1Toplam + instance2Toplam + instance3Toplam + instance4Toplam + instance5Toplam + instance6Toplam + instance7Toplam
					+ instance8Toplam + instance9Toplam + instance10Toplam;
		}
		Kaynak kaynak = kaynakService.findByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany());
		
		if(instanceToplam != null && kaynak != null && kaynak.getSermaye() != null && instanceToplam.doubleValue() == kaynak.getSermaye().doubleValue())
		{
			instanceBoolean = true;
		}
		else
		{
			instanceBoolean = false;
		}
		if(instance1Toplam != null && kaynak != null && kaynak.getSermaye() != null && instance1Toplam.doubleValue() == kaynak.getSermayeDuzeltmeFark().doubleValue())
		{
			instance1Boolean = true;
		}
		else
		{
			instance1Boolean = false;
		}
		if(instance2Toplam != null && kaynak != null && kaynak.getSermaye() != null && instance2Toplam.doubleValue() == kaynak.getHisseSenediIhracPrim().doubleValue())
		{
			instance2Boolean = true;
		}
		else
		{
			instance2Boolean = false;
		}
		if(instance3Toplam != null && kaynak != null && kaynak.getSermaye() != null && instance3Toplam.doubleValue() == kaynak.getDuranVarlikDegerFonu().doubleValue())
		{
			instance3Boolean = true;
		}
		else
		{
			instance3Boolean = false;
		}
		if(instance4Toplam != null && kaynak != null && kaynak.getSermaye() != null && instance4Toplam.doubleValue() == kaynak.getFinansalVarlikDegerFonu().doubleValue())
		{
			instance4Boolean = true;
		}
		else
		{
			instance4Boolean = false;
		}
		if(instance5Toplam != null && kaynak != null && kaynak.getSermaye() != null && instance5Toplam.doubleValue() == kaynak.getFinansalRisktenKorunmaFon().doubleValue())
		{
			instance5Boolean = true;
		}
		else
		{
			instance5Boolean = false;
		}
		if(instance6Toplam != null && kaynak != null && kaynak.getSermaye() != null && instance6Toplam.doubleValue() == kaynak.getYabanciParaCevrimFarki().doubleValue())
		{
			instance6Boolean = true;
		}
		else
		{
			instance6Boolean = false;
		}
		if(instance7Toplam != null && kaynak != null && kaynak.getSermaye() != null && instance7Toplam.doubleValue() == kaynak.getKardanAyrilanKisitYedek().doubleValue())
		{
			instance7Boolean = true;
		}
		else
		{
			instance7Boolean = false;
		}
		if(instance8Toplam != null && kaynak != null && kaynak.getSermaye() != null && instance8Toplam.doubleValue() == kaynak.getGecmisYillarKarZarar().doubleValue())
		{
			instance8Boolean = true;
		}
		else
		{
			instance8Boolean = false;
		}
		if(instance9Toplam != null && kaynak != null && kaynak.getSermaye() != null && karZarar != null && karZarar.getAnaOrtaklikNetKar() != null && instance9Toplam.doubleValue() == karZarar.getAnaOrtaklikNetKar().doubleValue())
		{
			instance9Boolean = true;
		}
		else
		{
			instance9Boolean = false;
		}
		Double kaynakToplam = new Double(0);
		if(karZarar != null && kaynak != null && karZarar.getAnaOrtaklikNetKar()  != null && kaynak.getGecmisYillarKarZarar()  != null && kaynak.getKardanAyrilanKisitYedek() 
				 != null && kaynak.getYabanciParaCevrimFarki()  != null &&  kaynak.getFinansalRisktenKorunmaFon()  != null && kaynak.getFinansalVarlikDegerFonu()
				 != null && kaynak.getDuranVarlikDegerFonu()  != null && kaynak.getHisseSenediIhracPrim()  != null && kaynak.getSermayeDuzeltmeFark()  != null 
				 && kaynak.getSermaye() != null)
		{
			kaynakToplam = karZarar.getAnaOrtaklikNetKar() + kaynak.getGecmisYillarKarZarar() + kaynak.getKardanAyrilanKisitYedek() 
					+ kaynak.getYabanciParaCevrimFarki() +  kaynak.getFinansalRisktenKorunmaFon() + kaynak.getFinansalVarlikDegerFonu()
					+ kaynak.getDuranVarlikDegerFonu() + kaynak.getHisseSenediIhracPrim() + kaynak.getSermayeDuzeltmeFark() +kaynak.getSermaye();
		}	
		if(toplam1 != null && toplam1.doubleValue() == kaynakToplam.doubleValue())
		{
			toplam1Boolean = true;
		}
		else
		{
			toplam1Boolean = false;
		}
		if(instance10Toplam != null && kaynak != null && kaynak.getKontrolGucuOlmayan() != null && instance10Toplam.doubleValue() == kaynak.getKontrolGucuOlmayan().doubleValue())
		{
			instance10Boolean = true;
		}
		else
		{
			instance10Boolean = false;
		}
		if(toplam2 != null && kaynak != null && kaynak.getKontrolGucuOlmayan() != null && toplam2.doubleValue() == kaynakToplam.doubleValue() + kaynak.getKontrolGucuOlmayan().doubleValue())
		{
			toplam2Boolean = true;
		}
		else
		{
			toplam2Boolean = false;
		}
		
	}
	public void initInstances()
	{
		newInstance();
		instance1 = new Ozkaynak();
		instance2 = new Ozkaynak();
		instance3 = new Ozkaynak();
		instance4 = new Ozkaynak();
		instance5 = new Ozkaynak();
		instance6 = new Ozkaynak();
		instance7 = new Ozkaynak();
		instance8 = new Ozkaynak();
		instance9 = new Ozkaynak();
		instance10 = new Ozkaynak();
		getInstance().setColumnNumber(0L);
		instance1.setColumnNumber(1L);
		instance2.setColumnNumber(2L);
		instance3.setColumnNumber(3L);
		instance4.setColumnNumber(4L);
		instance5.setColumnNumber(5L);
		instance6.setColumnNumber(6L);
		instance7.setColumnNumber(7L);
		instance8.setColumnNumber(8L);
		instance9.setColumnNumber(9L);
		instance10.setColumnNumber(10L);
		instanceBoolean = false;
		instance1Boolean = false;
		instance2Boolean = false;
		instance3Boolean = false;
		instance4Boolean = false;
		instance5Boolean = false;
		instance6Boolean = false;
		instance7Boolean = false;
		instance8Boolean = false;
		instance9Boolean = false;
		instance10Boolean = false;
		toplam1Boolean = false;
		toplam2Boolean = false;
	}
	public String initPage() {
		// TODO Auto-generated method stub
		initInstances();
		getInstance().setDonem(getDonemList().get(0));
		setSelectedDonem(getDonemList().get(0));
		sorgula();
		return "/xhtml/user/ozkaynak.xhtml?faces-redirect=true";
	}

	public Ozkaynak getInstance1() {
		return instance1;
	}

	public void setInstance1(Ozkaynak instance1) {
		this.instance1 = instance1;
	}

	public Ozkaynak getInstance2() {
		return instance2;
	}

	public void setInstance2(Ozkaynak instance2) {
		this.instance2 = instance2;
	}

	public Ozkaynak getInstance3() {
		return instance3;
	}

	public void setInstance3(Ozkaynak instance3) {
		this.instance3 = instance3;
	}

	public Ozkaynak getInstance4() {
		return instance4;
	}

	public void setInstance4(Ozkaynak instance4) {
		this.instance4 = instance4;
	}

	public Ozkaynak getInstance5() {
		return instance5;
	}

	public void setInstance5(Ozkaynak instance5) {
		this.instance5 = instance5;
	}

	public Ozkaynak getInstance6() {
		return instance6;
	}

	public void setInstance6(Ozkaynak instance6) {
		this.instance6 = instance6;
	}

	public Ozkaynak getInstance7() {
		return instance7;
	}

	public void setInstance7(Ozkaynak instance7) {
		this.instance7 = instance7;
	}

	public Ozkaynak getInstance8() {
		return instance8;
	}

	public void setInstance8(Ozkaynak instance8) {
		this.instance8 = instance8;
	}

	public Ozkaynak getInstance9() {
		return instance9;
	}

	public void setInstance9(Ozkaynak instance9) {
		this.instance9 = instance9;
	}

	public Ozkaynak getInstance10() {
		return instance10;
	}

	public void setInstance10(Ozkaynak instance10) {
		this.instance10 = instance10;
	}

	public Boolean getInstanceBoolean() {
		return instanceBoolean;
	}

	public void setInstanceBoolean(Boolean instanceBoolean) {
		this.instanceBoolean = instanceBoolean;
	}

	public Boolean getInstance1Boolean() {
		return instance1Boolean;
	}

	public void setInstance1Boolean(Boolean instance1Boolean) {
		this.instance1Boolean = instance1Boolean;
	}

	public Boolean getInstance2Boolean() {
		return instance2Boolean;
	}

	public void setInstance2Boolean(Boolean instance2Boolean) {
		this.instance2Boolean = instance2Boolean;
	}

	public Boolean getInstance3Boolean() {
		return instance3Boolean;
	}

	public void setInstance3Boolean(Boolean instance3Boolean) {
		this.instance3Boolean = instance3Boolean;
	}

	public Boolean getInstance4Boolean() {
		return instance4Boolean;
	}

	public void setInstance4Boolean(Boolean instance4Boolean) {
		this.instance4Boolean = instance4Boolean;
	}

	public Boolean getInstance5Boolean() {
		return instance5Boolean;
	}

	public void setInstance5Boolean(Boolean instance5Boolean) {
		this.instance5Boolean = instance5Boolean;
	}

	public Boolean getInstance6Boolean() {
		return instance6Boolean;
	}

	public void setInstance6Boolean(Boolean instance6Boolean) {
		this.instance6Boolean = instance6Boolean;
	}

	public Boolean getInstance7Boolean() {
		return instance7Boolean;
	}

	public void setInstance7Boolean(Boolean instance7Boolean) {
		this.instance7Boolean = instance7Boolean;
	}

	public Boolean getInstance8Boolean() {
		return instance8Boolean;
	}

	public void setInstance8Boolean(Boolean instance8Boolean) {
		this.instance8Boolean = instance8Boolean;
	}

	public Boolean getInstance9Boolean() {
		return instance9Boolean;
	}

	public void setInstance9Boolean(Boolean instance9Boolean) {
		this.instance9Boolean = instance9Boolean;
	}

	public Boolean getInstance10Boolean() {
		return instance10Boolean;
	}

	public void setInstance10Boolean(Boolean instance10Boolean) {
		this.instance10Boolean = instance10Boolean;
	}

	public Boolean getToplam1Boolean() {
		return toplam1Boolean;
	}

	public void setToplam1Boolean(Boolean toplam1Boolean) {
		this.toplam1Boolean = toplam1Boolean;
	}

	public Boolean getToplam2Boolean() {
		return toplam2Boolean;
	}

	public void setToplam2Boolean(Boolean toplam2Boolean) {
		this.toplam2Boolean = toplam2Boolean;
	}
	

}

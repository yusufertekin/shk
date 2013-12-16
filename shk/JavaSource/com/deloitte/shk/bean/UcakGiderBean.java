package com.deloitte.shk.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Dipnot;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.entity.UcakGider;
import com.deloitte.shk.generic.GenericBean;
import com.deloitte.shk.generic.GenericService;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.services.UcakGiderService;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class UcakGiderBean extends GenericBean<UcakGider,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject UcakGiderService ucakGiderService;
	@Inject @CurrentUser Kullanici currentUser;
	private List<UcakGider> ucakList;
	private Double toplam1;
	private Double toplam2;
	private Double toplam3;
	private Double toplam4;
	private Double toplam5;
	private Double toplam6;
	private Double toplam7;
	private Double toplam8;
	private Double toplam9;
	private Double toplam10;
	private Double toplam11;
	private Double toplam12;
	private Double toplam13;
	private Double toplam14;
	private Double toplam15;
	private Double toplam16;
	private Double toplam17;
	private Double toplam18;
	private Double toplam19;
	private Double toplam20;
	private Double toplam21;
	private Double toplam22;
	private Double toplam23;
	private Double toplamBig1;
	private Double toplamBig2;
	private Double toplamBig3;
	private Double toplamBig4;
	private Double toplamGenel;
	
	@Override
	public GenericService<UcakGider,Long> getEntityService() {
		// TODO Auto-generated method stub
		return ucakGiderService;
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
		initToplam();
		Dipnot tmp = ucakGiderService.findDipnotByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), 8L);
		if(tmp != null)
		{
			setDipnot(tmp);
		}
		else
		{
			setDipnot(new Dipnot());
		}
		ucakList = ucakGiderService.findByDonemAndCompanyList(getInstance().getDonem(), getInstance().getCompany());
		if(ucakList != null && ucakList.size() > 0)
		{
			for (UcakGider ucak : ucakList) {
				toplamHesapla(ucak);
			}
			genelToplamHesapla();
			setInstance(ucakList.get(0));
		}
		else
		{
			initUcakList();
		}
		
	}
	public void initToplam()
	{
		toplam1 = new Double(0);
		toplam2 = new Double(0);
		toplam3 = new Double(0);
		toplam4 = new Double(0);
		toplam5 = new Double(0);
		toplam6 = new Double(0);
		toplam7 = new Double(0);
		toplam8 = new Double(0);
		toplam9 = new Double(0);
		toplam10 = new Double(0);
		toplam11 = new Double(0);
		toplam12 = new Double(0);
		toplam13 = new Double(0);
		toplam14 = new Double(0);
		toplam15 = new Double(0);
		toplam16 = new Double(0);
		toplam17 = new Double(0);
		toplam18 = new Double(0);
		toplam19 = new Double(0);
		toplam20 = new Double(0);
		toplam21 = new Double(0);
		toplamBig1 = new Double(0);
		toplamBig2 = new Double(0);
		toplamBig3 = new Double(0);
		toplamBig4 = new Double(0);
		toplamGenel = new Double(0);
	}
	public void initUcakList()
	{
		ucakList = new ArrayList<UcakGider>();
		ucakList.clear();
		newInstance();
		UcakGider instance1 = new UcakGider();
		UcakGider instance2 = new UcakGider();
		UcakGider instance3 = new UcakGider();
		UcakGider instance4 = new UcakGider();
		UcakGider instance5 = new UcakGider();
		UcakGider instance6 = new UcakGider();
		UcakGider instance7 = new UcakGider();
		UcakGider instance8 = new UcakGider();
		UcakGider instance9 = new UcakGider();
		UcakGider instance10 = new UcakGider();
		UcakGider instance11 = new UcakGider();
		UcakGider instance12 = new UcakGider();
		UcakGider instance13 = new UcakGider();
		UcakGider instance14 = new UcakGider();
		UcakGider instance15 = new UcakGider();
		UcakGider instance16 = new UcakGider();
		UcakGider instance17 = new UcakGider();
		UcakGider instance18 = new UcakGider();
		UcakGider instance19 = new UcakGider();
		UcakGider instance20 = new UcakGider();
		UcakGider instance21 = new UcakGider();
		UcakGider instance22 = new UcakGider();
		UcakGider instance23 = new UcakGider();
		getInstance().setUcakTipi("A300 B4");
		instance1.setUcakTipi("A300-600");
		instance2.setUcakTipi("A310");
		instance3.setUcakTipi("A319-100");
		instance4.setUcakTipi("A320-200");
		instance5.setUcakTipi("A320-232");
		instance6.setUcakTipi("A321-100");
		instance7.setUcakTipi("A321-200");
		instance8.setUcakTipi("A330-200");
		instance9.setUcakTipi("A330-200F");
		instance23.setUcakTipi("A330-300");
		instance10.setUcakTipi("A340-300");
		instance11.setUcakTipi("ATR72");
		instance12.setUcakTipi("B737-300");
		instance13.setUcakTipi("B737-400");
		instance14.setUcakTipi("B737-700");
		instance15.setUcakTipi("B737-800");
		instance16.setUcakTipi("B737-900ER");
		instance17.setUcakTipi("B757-200");
		instance18.setUcakTipi("B777-300ER");
		instance19.setUcakTipi("GLOBAL EXPRES");
		instance20.setUcakTipi("CHALLENGER 600");
		instance21.setUcakTipi("GLOBAL EXPRES");
		instance22.setUcakTipi("MD 82-83-88");
		ucakList.add(getInstance());
		ucakList.add(instance1);
		ucakList.add(instance2);
		ucakList.add(instance3);
		ucakList.add(instance4);
		ucakList.add(instance5);
		ucakList.add(instance6);
		ucakList.add(instance7);
		ucakList.add(instance8);
		ucakList.add(instance9);
		ucakList.add(instance23);
		ucakList.add(instance10);
		ucakList.add(instance11);
		ucakList.add(instance12);
		ucakList.add(instance13);
		ucakList.add(instance14);
		ucakList.add(instance15);
		ucakList.add(instance16);
		ucakList.add(instance17);
		ucakList.add(instance18);
		ucakList.add(instance19);
		ucakList.add(instance20);
		ucakList.add(instance21);
		ucakList.add(instance22);
	}
	
	public String initPage() {
		// TODO Auto-generated method stub
		newInstance();
		getInstance().setDonem(getDonemList().get(0));
		setSelectedDonem(getDonemList().get(0));
		ucakList = new ArrayList<UcakGider>();
		initUcakList();
		sorgula();
		return "/xhtml/user/ucakGider.xhtml?faces-redirect=true";
	}

	public void save() throws Exception {
		try {
			initToplam();
			for (UcakGider ucak : ucakList) {
				ucak.setCompany(getInstance().getCompany());
				ucak.setDonem(getInstance().getDonem());
				toplamHesapla(ucak);
				getEntityService().save(ucak);
			}
			genelToplamHesapla();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			addMessage("common.saveError");
		}
		addMessage("common.saveSuccessful");
	}
	
	@Override
	public void remove(UcakGider ucak) {
		// TODO Auto-generated method stub
		ucakList.get(ucakList.indexOf(ucak)).setAkaryakitGiderler(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setHarcananYakitYaglar(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setHavaalaniVergiGuvenlikUcret(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setHavaEmniyetGiderler(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setHizmettekiGunSayisi(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setIkramGiderler(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setKabinUcretDigerMenfaat(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setKoltukKiraGider(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setKokpitUcretDigerMenfaat(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setKonmaYerHizmetleriIstasyon(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setMaliMesuliyetSigartasiGider(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setPilotEgitimGiderler(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setToplamUculanSaat(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setUcakKiraGider(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setUcakKodu(null);
		ucakList.get(ucakList.indexOf(ucak)).setUcakOrtalamaYas(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setUcusEkipmanAmortismanGider(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setUcusEkipmanDegerDusuklugu(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setUcusEkipmanKiraGider(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setUcusEkipmanSigortaGider(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setUcusEkipmanTeknikBakimGider(0.0);
		ucakList.get(ucakList.indexOf(ucak)).setUstgecisGiderler(0.0);
		try {
			getEntityService().update(ucakList.get(ucakList.indexOf(ucak)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			addMessage("common.removeError");
			return;
		}
		addMessage("common.removeSuccessful");
		newInstance();
		if(ucakList != null && ucakList.size() > 0)
		{
			setInstance(ucakList.get(0));
		}
		initToplam();
		for (UcakGider uc : ucakList) {
			toplamHesapla(uc);
		}
		genelToplamHesapla();
	}
	public void genelToplamHesapla()
	{
		toplamBig1 = toplamBig1 + toplam1 + toplam2 + toplam3 + toplam4;
		toplamBig2 = toplamBig2 + toplam5 + toplam6;
		toplamBig3 = toplamBig3 + toplam7 + toplam8 + toplam9 + toplam10;
		toplamBig4 = toplamBig4 + toplam11 + toplam12 + toplam13 + toplam14 + toplam15 + toplam16 + toplam17;
		setToplamGenel(toplamBig1 + toplamBig2 + toplamBig3 + toplamBig4);

	}
	public void toplamHesapla(UcakGider ucak)
	{
		toplam1 = toplam1 + ucak.getAkaryakitGiderler();
		toplam2 = toplam2 + ucak.getHavaEmniyetGiderler();
		toplam3 = toplam3 + ucak.getUstgecisGiderler();
		toplam4 = toplam4 + ucak.getIkramGiderler();
		toplam5 = toplam5 + ucak.getKonmaYerHizmetleriIstasyon();
		toplam6 = toplam6 + ucak.getHavaalaniVergiGuvenlikUcret();
		toplam7 = toplam7 + ucak.getKokpitUcretDigerMenfaat();
		toplam8 = toplam8 + ucak.getKabinUcretDigerMenfaat();
		toplam9 = toplam9 + ucak.getPilotEgitimGiderler();
		toplam10 = toplam10 + ucak.getMaliMesuliyetSigartasiGider();
		toplam11 = toplam11 + ucak.getUcusEkipmanAmortismanGider();
		toplam12 = toplam12 + ucak.getUcusEkipmanDegerDusuklugu();
		toplam13 = toplam13 + ucak.getUcusEkipmanTeknikBakimGider();
		toplam14 = toplam14 + ucak.getUcusEkipmanKiraGider();
		toplam15 = toplam15 + ucak.getUcakKiraGider();
		toplam16 = toplam16 + ucak.getKoltukKiraGider();
		toplam17 = toplam17 + ucak.getUcusEkipmanSigortaGider();
		toplam18 = toplam18 + ucak.getUcakOrtalamaYas();
		toplam19 = toplam19 + ucak.getToplamUculanSaat();
		toplam20 = toplam20 + ucak.getHizmettekiGunSayisi();
		toplam21 = toplam21 + ucak.getHarcananYakitYaglar();
	}
	public List<UcakGider> getUcakList() {
		return ucakList;
	}


	public void setUcakList(List<UcakGider> ucakList) {
		this.ucakList = ucakList;
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


	public Double getToplam9() {
		return toplam9;
	}


	public void setToplam9(Double toplam9) {
		this.toplam9 = toplam9;
	}


	public Double getToplam10() {
		return toplam10;
	}


	public void setToplam10(Double toplam10) {
		this.toplam10 = toplam10;
	}


	public Double getToplam11() {
		return toplam11;
	}


	public void setToplam11(Double toplam11) {
		this.toplam11 = toplam11;
	}


	public Double getToplam12() {
		return toplam12;
	}


	public void setToplam12(Double toplam12) {
		this.toplam12 = toplam12;
	}


	public Double getToplam13() {
		return toplam13;
	}


	public void setToplam13(Double toplam13) {
		this.toplam13 = toplam13;
	}


	public Double getToplam14() {
		return toplam14;
	}


	public void setToplam14(Double toplam14) {
		this.toplam14 = toplam14;
	}


	public Double getToplam15() {
		return toplam15;
	}


	public void setToplam15(Double toplam15) {
		this.toplam15 = toplam15;
	}


	public Double getToplam16() {
		return toplam16;
	}


	public void setToplam16(Double toplam16) {
		this.toplam16 = toplam16;
	}


	public Double getToplam17() {
		return toplam17;
	}


	public void setToplam17(Double toplam17) {
		this.toplam17 = toplam17;
	}


	public Double getToplam18() {
		return toplam18;
	}


	public void setToplam18(Double toplam18) {
		this.toplam18 = toplam18;
	}


	public Double getToplam19() {
		return toplam19;
	}


	public void setToplam19(Double toplam19) {
		this.toplam19 = toplam19;
	}


	public Double getToplam20() {
		return toplam20;
	}


	public void setToplam20(Double toplam20) {
		this.toplam20 = toplam20;
	}


	public Double getToplam21() {
		return toplam21;
	}


	public void setToplam21(Double toplam21) {
		this.toplam21 = toplam21;
	}


	public Double getToplam22() {
		return toplam22;
	}


	public void setToplam22(Double toplam22) {
		this.toplam22 = toplam22;
	}


	public Double getToplam23() {
		return toplam23;
	}


	public void setToplam23(Double toplam23) {
		this.toplam23 = toplam23;
	}


	public Double getToplamBig1() {
		return toplamBig1;
	}


	public void setToplamBig1(Double toplamBig1) {
		this.toplamBig1 = toplamBig1;
	}


	public Double getToplamBig2() {
		return toplamBig2;
	}


	public void setToplamBig2(Double toplamBig2) {
		this.toplamBig2 = toplamBig2;
	}


	public Double getToplamBig3() {
		return toplamBig3;
	}


	public void setToplamBig3(Double toplamBig3) {
		this.toplamBig3 = toplamBig3;
	}


	public Double getToplamBig4() {
		return toplamBig4;
	}


	public void setToplamBig4(Double toplamBig4) {
		this.toplamBig4 = toplamBig4;
	}


	public Double getToplamGenel() {
		return toplamGenel;
	}


	public void setToplamGenel(Double toplamGenel) {
		this.toplamGenel = toplamGenel;
	}
	


}

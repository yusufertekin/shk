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
import com.deloitte.shk.enums.Tablo;
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
	private UcakGider selectedInstance;
	
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
		Dipnot tmp = ucakGiderService.findDipnotByDonemAndCompany(getInstance().getDonem(), getInstance().getCompany(), Tablo.UCAKGIDER.getValue());
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
		}
		else
		{
			initUcakList();
		}
		newInstance();
		
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
	}
	
	public void selectInstance()
	{
		try {
			if(selectedInstance != null)
			{
				setInstance((UcakGider) selectedInstance.clone());
			}
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deselectInstance()
	{
		newInstance();
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

	@Override
	public void save() throws Exception {
		// TODO Auto-generated method stub
		super.update();
		sorgula();
	}
	@Override
	public void remove(UcakGider instance) {
		// TODO Auto-generated method stub
		super.remove(instance);
		sorgula();
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


	public UcakGider getSelectedInstance() {
		return selectedInstance;
	}


	public void setSelectedInstance(UcakGider selectedInstance) {
		this.selectedInstance = selectedInstance;
	}
	


}

package com.deloitte.shk.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.deloitte.shk.generic.GenericEntity;
/**
 * @author yusufertekin
 *
 */
@Entity
public class UcakGider extends GenericEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "ucakGiderSeq")
	@SequenceGenerator(name="ucakGiderSeq", sequenceName="UCUS_GIDER_SEQ", allocationSize=1, initialValue=1)
	private Long ucakGiderId;
	
	@Column
	private String ucakTipi;
	@Column
	private String ucakKodu;
	@Column
	private Double akaryakitGiderler;
	@Column
	private Double havaEmniyetGiderler;
	@Column
	private Double ustgecisGiderler;
	@Column
	private Double ikramGiderler;
	@Column
	private Double konmaYerHizmetleriIstasyon;
	@Column
	private Double havaalaniVergiGuvenlikUcret;
	@Column
	private Double kokpitUcretDigerMenfaat;
	@Column
	private Double kabinUcretDigerMenfaat;
	@Column
	private Double pilotEgitimGiderler;
	@Column
	private Double maliMesuliyetSigartasiGider;
	@Column
	private Double ucusEkipmanAmortismanGider;
	@Column
	private Double ucusEkipmanDegerDusuklugu;
	@Column
	private Double ucusEkipmanTeknikBakimGider;
	@Column
	private Double ucusEkipmanKiraGider;
	@Column
	private Double ucakKiraGider;
	@Column
	private Double koltukKiraGider;
	@Column	
	private Double ucusEkipmanSigortaGider;
	@Column
	private Double ucakOrtalamaYas;
	@Column
	private Double toplamUculanSaat;
	@Column
	private Double hizmettekiGunSayisi;
	@Column
	private Double harcananYakitYaglar;
	
	

	public Long getUcakGiderId() {
		return ucakGiderId;
	}

	public void setUcakGiderId(Long ucakGiderId) {
		this.ucakGiderId = ucakGiderId;
	}

	@Override
	public Long entityId() {
		// TODO Auto-generated method stub
		return getUcakGiderId();
	}

	@Override
	public void setEntityId(Long id) {
		setUcakGiderId(id);
	}


	public Double getAkaryakitGiderler() {
		return akaryakitGiderler;
	}

	public void setAkaryakitGiderler(Double akaryakitGiderler) {
		this.akaryakitGiderler = akaryakitGiderler;
	}

	public Double getHavaEmniyetGiderler() {
		return havaEmniyetGiderler;
	}

	public void setHavaEmniyetGiderler(Double havaEmniyetGiderler) {
		this.havaEmniyetGiderler = havaEmniyetGiderler;
	}

	public Double getUstgecisGiderler() {
		return ustgecisGiderler;
	}

	public void setUstgecisGiderler(Double ustgecisGiderler) {
		this.ustgecisGiderler = ustgecisGiderler;
	}

	public Double getIkramGiderler() {
		return ikramGiderler;
	}

	public void setIkramGiderler(Double ikramGiderler) {
		this.ikramGiderler = ikramGiderler;
	}

	public Double getKonmaYerHizmetleriIstasyon() {
		return konmaYerHizmetleriIstasyon;
	}

	public void setKonmaYerHizmetleriIstasyon(Double konmaYerHizmetleriIstasyon) {
		this.konmaYerHizmetleriIstasyon = konmaYerHizmetleriIstasyon;
	}

	public Double getHavaalaniVergiGuvenlikUcret() {
		return havaalaniVergiGuvenlikUcret;
	}

	public void setHavaalaniVergiGuvenlikUcret(Double havaalaniVergiGuvenlikUcret) {
		this.havaalaniVergiGuvenlikUcret = havaalaniVergiGuvenlikUcret;
	}

	public Double getKokpitUcretDigerMenfaat() {
		return kokpitUcretDigerMenfaat;
	}

	public void setKokpitUcretDigerMenfaat(Double kokpitUcretDigerMenfaat) {
		this.kokpitUcretDigerMenfaat = kokpitUcretDigerMenfaat;
	}

	public Double getKabinUcretDigerMenfaat() {
		return kabinUcretDigerMenfaat;
	}

	public void setKabinUcretDigerMenfaat(Double kabinUcretDigerMenfaat) {
		this.kabinUcretDigerMenfaat = kabinUcretDigerMenfaat;
	}

	public Double getPilotEgitimGiderler() {
		return pilotEgitimGiderler;
	}

	public void setPilotEgitimGiderler(Double pilotEgitimGiderler) {
		this.pilotEgitimGiderler = pilotEgitimGiderler;
	}

	public Double getMaliMesuliyetSigartasiGider() {
		return maliMesuliyetSigartasiGider;
	}

	public void setMaliMesuliyetSigartasiGider(Double maliMesuliyetSigartasiGider) {
		this.maliMesuliyetSigartasiGider = maliMesuliyetSigartasiGider;
	}

	public Double getUcusEkipmanAmortismanGider() {
		return ucusEkipmanAmortismanGider;
	}

	public void setUcusEkipmanAmortismanGider(Double ucusEkipmanAmortismanGider) {
		this.ucusEkipmanAmortismanGider = ucusEkipmanAmortismanGider;
	}

	public Double getUcusEkipmanDegerDusuklugu() {
		return ucusEkipmanDegerDusuklugu;
	}

	public void setUcusEkipmanDegerDusuklugu(Double ucusEkipmanDegerDusuklugu) {
		this.ucusEkipmanDegerDusuklugu = ucusEkipmanDegerDusuklugu;
	}

	public Double getUcusEkipmanTeknikBakimGider() {
		return ucusEkipmanTeknikBakimGider;
	}

	public void setUcusEkipmanTeknikBakimGider(Double ucusEkipmanTeknikBakimGider) {
		this.ucusEkipmanTeknikBakimGider = ucusEkipmanTeknikBakimGider;
	}

	public Double getUcusEkipmanKiraGider() {
		return ucusEkipmanKiraGider;
	}

	public void setUcusEkipmanKiraGider(Double ucusEkipmanKiraGider) {
		this.ucusEkipmanKiraGider = ucusEkipmanKiraGider;
	}

	public Double getUcakKiraGider() {
		return ucakKiraGider;
	}

	public void setUcakKiraGider(Double ucakKiraGider) {
		this.ucakKiraGider = ucakKiraGider;
	}

	public Double getKoltukKiraGider() {
		return koltukKiraGider;
	}

	public void setKoltukKiraGider(Double koltukKiraGider) {
		this.koltukKiraGider = koltukKiraGider;
	}

	public Double getUcusEkipmanSigortaGider() {
		return ucusEkipmanSigortaGider;
	}

	public void setUcusEkipmanSigortaGider(Double ucusEkipmanSigortaGider) {
		this.ucusEkipmanSigortaGider = ucusEkipmanSigortaGider;
	}

	public Double getUcakOrtalamaYas() {
		return ucakOrtalamaYas;
	}

	public void setUcakOrtalamaYas(Double ucakOrtalamaYas) {
		this.ucakOrtalamaYas = ucakOrtalamaYas;
	}

	public Double getToplamUculanSaat() {
		return toplamUculanSaat;
	}

	public void setToplamUculanSaat(Double toplamUculanSaat) {
		this.toplamUculanSaat = toplamUculanSaat;
	}

	public Double getHizmettekiGunSayisi() {
		return hizmettekiGunSayisi;
	}

	public void setHizmettekiGunSayisi(Double hizmettekiGunSayisi) {
		this.hizmettekiGunSayisi = hizmettekiGunSayisi;
	}

	public Double getHarcananYakitYaglar() {
		return harcananYakitYaglar;
	}

	public void setHarcananYakitYaglar(Double harcananYakitYaglar) {
		this.harcananYakitYaglar = harcananYakitYaglar;
	}

	public String getUcakTipi() {
		return ucakTipi;
	}

	public void setUcakTipi(String ucakTipi) {
		this.ucakTipi = ucakTipi;
	}

	public String getUcakKodu() {
		return ucakKodu;
	}

	public void setUcakKodu(String ucakKodu) {
		this.ucakKodu = ucakKodu;
	}
	
}

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
public class KarZarar extends GenericEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "karZararSeq")
	@SequenceGenerator(name="karZararSeq", sequenceName="KAR_ZARAR_SEQ", allocationSize=1, initialValue=1)
	private Long karZararId;
	
	@Column
	private Double icHatHasilat;
	@Column
	private Double disHatHasilat;
	@Column
	private Double bellyKargoGelir;
	@Column
	private Double kargoUcaklariKargoGelir;
	@Column
	private Double yurticiCharter;
	@Column
	private Double yurtdisiCharter;
	@Column
	private Double wetleaseGelir;
	@Column
	private Double digerGelirlerHasilat;
	@Column
	private Double akaryakitGider;
	@Column
	private Double ustgecisGider;
	@Column
	private Double ikramGider;
	@Column
	private Double konmaYerIstasyonGider;
	@Column
	private Double havaalaniVergiGuvenlik;
	@Column
	private Double kokpitEkipGider;
	@Column
	private Double kabinEkipGider;
	@Column
	private Double kokpitEkipEgitimGider;
	@Column	
	private Double maliMesuliyetSigortaGider;
	@Column
	private Double ucusEkipmanAmortismanGider;
	@Column
	private Double ucusEkipmanDegerDusukGider;
	@Column
	private Double ucusEkipmanBakimGider;
	@Column
	private Double aktiflesenBakimGider;
	@Column
	private Double ucusEkipmanKiraGider;
	@Column
	private Double ucakKiraGider;
	@Column
	private Double koltukKiraGider;
	@Column
	private Double ucusEkipmanSigortaGider;
	public Double getAktiflesenBakimGider() {
		return aktiflesenBakimGider;
	}


	public void setAktiflesenBakimGider(Double aktiflesenBakimGider) {
		this.aktiflesenBakimGider = aktiflesenBakimGider;
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


	@Column
	private Double yolcuKomisyon;
	@Column
	private Double kargoKomisyon;
	@Column
	private Double reklamGider;
	@Column
	private Double personelGider;
	@Column
	private Double digerSatisReklamGider;
	@Column
	private Double yerEkipmanAmortismanGider;
	@Column
	private Double yerEkipmanDegerDusukGider;
	@Column
	private Double ucusIsletmeGider;
	@Column
	private Double digerGenelIdariGider;
	@Column
	private Double sabitKiymetSatisKarZarar;
	@Column
	private Double supheliAlacakKarsilikGider;
	@Column
	private Double digerGiderler;
	@Column
	private Double digerGelirler;
	@Column
	private Double ozkaynakYontemiyleKarZarar;
	@Column
	private Double finansalKiralamaFaizGider;
	@Column
	private Double finansalGelir;
	@Column
	private Double finansalGider;
	@Column
	private Double kurFarkiKarZarar;
	@Column
	private Double turevFinansalAracKarZarar;
	@Column
	private Double vergiGiderGelir;
	@Column
	private Double ertelenmisVergiGiderGelir;
	@Column
	private Double anaOrtaklikNetKar;
	@Column
	private Double kontrolGucuOlmayanNetKar;
	

	public Double getIcHatHasilat() {
		return icHatHasilat;
	}


	public void setIcHatHasilat(Double icHatHasilat) {
		this.icHatHasilat = icHatHasilat;
	}


	public Double getDisHatHasilat() {
		return disHatHasilat;
	}


	public void setDisHatHasilat(Double disHatHasilat) {
		this.disHatHasilat = disHatHasilat;
	}


	public Double getBellyKargoGelir() {
		return bellyKargoGelir;
	}


	public void setBellyKargoGelir(Double bellyKargoGelir) {
		this.bellyKargoGelir = bellyKargoGelir;
	}


	public Double getKargoUcaklariKargoGelir() {
		return kargoUcaklariKargoGelir;
	}


	public void setKargoUcaklariKargoGelir(Double kargoUcaklariKargoGelir) {
		this.kargoUcaklariKargoGelir = kargoUcaklariKargoGelir;
	}


	public Double getYurticiCharter() {
		return yurticiCharter;
	}


	public void setYurticiCharter(Double yurticiCharter) {
		this.yurticiCharter = yurticiCharter;
	}


	public Double getYurtdisiCharter() {
		return yurtdisiCharter;
	}


	public void setYurtdisiCharter(Double yurtdisiCharter) {
		this.yurtdisiCharter = yurtdisiCharter;
	}


	public Double getWetleaseGelir() {
		return wetleaseGelir;
	}


	public void setWetleaseGelir(Double wetleaseGelir) {
		this.wetleaseGelir = wetleaseGelir;
	}


	public Double getAkaryakitGider() {
		return akaryakitGider;
	}


	public void setAkaryakitGider(Double akaryakitGider) {
		this.akaryakitGider = akaryakitGider;
	}


	public Double getUstgecisGider() {
		return ustgecisGider;
	}


	public void setUstgecisGider(Double ustgecisGider) {
		this.ustgecisGider = ustgecisGider;
	}


	public Double getIkramGider() {
		return ikramGider;
	}


	public void setIkramGider(Double ikramGider) {
		this.ikramGider = ikramGider;
	}


	public Double getKonmaYerIstasyonGider() {
		return konmaYerIstasyonGider;
	}


	public void setKonmaYerIstasyonGider(Double konmaYerIstasyonGider) {
		this.konmaYerIstasyonGider = konmaYerIstasyonGider;
	}


	public Double getHavaalaniVergiGuvenlik() {
		return havaalaniVergiGuvenlik;
	}


	public void setHavaalaniVergiGuvenlik(Double havaalaniVergiGuvenlik) {
		this.havaalaniVergiGuvenlik = havaalaniVergiGuvenlik;
	}


	public Double getKokpitEkipGider() {
		return kokpitEkipGider;
	}


	public void setKokpitEkipGider(Double kokpitEkipGider) {
		this.kokpitEkipGider = kokpitEkipGider;
	}


	public Double getKabinEkipGider() {
		return kabinEkipGider;
	}


	public void setKabinEkipGider(Double kabinEkipGider) {
		this.kabinEkipGider = kabinEkipGider;
	}


	public Double getKokpitEkipEgitimGider() {
		return kokpitEkipEgitimGider;
	}


	public void setKokpitEkipEgitimGider(Double kokpitEkipEgitimGider) {
		this.kokpitEkipEgitimGider = kokpitEkipEgitimGider;
	}


	public Double getMaliMesuliyetSigortaGider() {
		return maliMesuliyetSigortaGider;
	}


	public void setMaliMesuliyetSigortaGider(Double maliMesuliyetSigortaGider) {
		this.maliMesuliyetSigortaGider = maliMesuliyetSigortaGider;
	}


	public Double getUcusEkipmanAmortismanGider() {
		return ucusEkipmanAmortismanGider;
	}


	public void setUcusEkipmanAmortismanGider(Double ucusEkipmanAmortismanGider) {
		this.ucusEkipmanAmortismanGider = ucusEkipmanAmortismanGider;
	}


	public Double getUcusEkipmanDegerDusukGider() {
		return ucusEkipmanDegerDusukGider;
	}


	public void setUcusEkipmanDegerDusukGider(Double ucusEkipmanDegerDusukGider) {
		this.ucusEkipmanDegerDusukGider = ucusEkipmanDegerDusukGider;
	}


	public Double getUcusEkipmanBakimGider() {
		return ucusEkipmanBakimGider;
	}


	public void setUcusEkipmanBakimGider(Double ucusEkipmanBakimGider) {
		this.ucusEkipmanBakimGider = ucusEkipmanBakimGider;
	}


	public Double getYolcuKomisyon() {
		return yolcuKomisyon;
	}


	public void setYolcuKomisyon(Double yolcuKomisyon) {
		this.yolcuKomisyon = yolcuKomisyon;
	}


	public Double getKargoKomisyon() {
		return kargoKomisyon;
	}


	public void setKargoKomisyon(Double kargoKomisyon) {
		this.kargoKomisyon = kargoKomisyon;
	}


	public Double getReklamGider() {
		return reklamGider;
	}


	public void setReklamGider(Double reklamGider) {
		this.reklamGider = reklamGider;
	}


	public Double getPersonelGider() {
		return personelGider;
	}


	public void setPersonelGider(Double personelGider) {
		this.personelGider = personelGider;
	}


	public Double getDigerSatisReklamGider() {
		return digerSatisReklamGider;
	}


	public void setDigerSatisReklamGider(Double digerSatisReklamGider) {
		this.digerSatisReklamGider = digerSatisReklamGider;
	}


	public Double getYerEkipmanAmortismanGider() {
		return yerEkipmanAmortismanGider;
	}


	public void setYerEkipmanAmortismanGider(Double yerEkipmanAmortismanGider) {
		this.yerEkipmanAmortismanGider = yerEkipmanAmortismanGider;
	}


	public Double getYerEkipmanDegerDusukGider() {
		return yerEkipmanDegerDusukGider;
	}


	public void setYerEkipmanDegerDusukGider(Double yerEkipmanDegerDusukGider) {
		this.yerEkipmanDegerDusukGider = yerEkipmanDegerDusukGider;
	}


	public Double getUcusIsletmeGider() {
		return ucusIsletmeGider;
	}


	public void setUcusIsletmeGider(Double ucusIsletmeGider) {
		this.ucusIsletmeGider = ucusIsletmeGider;
	}


	public Double getDigerGenelIdariGider() {
		return digerGenelIdariGider;
	}


	public void setDigerGenelIdariGider(Double digerGenelIdariGider) {
		this.digerGenelIdariGider = digerGenelIdariGider;
	}


	public Double getSabitKiymetSatisKarZarar() {
		return sabitKiymetSatisKarZarar;
	}


	public void setSabitKiymetSatisKarZarar(Double sabitKiymetSatisKarZarar) {
		this.sabitKiymetSatisKarZarar = sabitKiymetSatisKarZarar;
	}


	public Double getSupheliAlacakKarsilikGider() {
		return supheliAlacakKarsilikGider;
	}


	public void setSupheliAlacakKarsilikGider(Double supheliAlacakKarsilikGider) {
		this.supheliAlacakKarsilikGider = supheliAlacakKarsilikGider;
	}


	public Double getDigerGiderler() {
		return digerGiderler;
	}


	public void setDigerGiderler(Double digerGiderler) {
		this.digerGiderler = digerGiderler;
	}


	public Double getDigerGelirler() {
		return digerGelirler;
	}


	public void setDigerGelirler(Double digerGelirler) {
		this.digerGelirler = digerGelirler;
	}


	public Double getOzkaynakYontemiyleKarZarar() {
		return ozkaynakYontemiyleKarZarar;
	}


	public void setOzkaynakYontemiyleKarZarar(Double ozkaynakYontemiyleKarZarar) {
		this.ozkaynakYontemiyleKarZarar = ozkaynakYontemiyleKarZarar;
	}


	public Double getFinansalKiralamaFaizGider() {
		return finansalKiralamaFaizGider;
	}


	public void setFinansalKiralamaFaizGider(Double finansalKiralamaFaizGider) {
		this.finansalKiralamaFaizGider = finansalKiralamaFaizGider;
	}


	public Double getFinansalGelir() {
		return finansalGelir;
	}


	public void setFinansalGelir(Double finansalGelir) {
		this.finansalGelir = finansalGelir;
	}


	public Double getFinansalGider() {
		return finansalGider;
	}


	public void setFinansalGider(Double finansalGider) {
		this.finansalGider = finansalGider;
	}


	public Double getKurFarkiKarZarar() {
		return kurFarkiKarZarar;
	}


	public void setKurFarkiKarZarar(Double kurFarkiKarZarar) {
		this.kurFarkiKarZarar = kurFarkiKarZarar;
	}


	public Double getTurevFinansalAracKarZarar() {
		return turevFinansalAracKarZarar;
	}


	public void setTurevFinansalAracKarZarar(Double turevFinansalAracKarZarar) {
		this.turevFinansalAracKarZarar = turevFinansalAracKarZarar;
	}


	public Double getVergiGiderGelir() {
		return vergiGiderGelir;
	}


	public void setVergiGiderGelir(Double vergiGiderGelir) {
		this.vergiGiderGelir = vergiGiderGelir;
	}


	public Double getErtelenmisVergiGiderGelir() {
		return ertelenmisVergiGiderGelir;
	}


	public void setErtelenmisVergiGiderGelir(Double ertelenmisVergiGiderGelir) {
		this.ertelenmisVergiGiderGelir = ertelenmisVergiGiderGelir;
	}


	public Double getAnaOrtaklikNetKar() {
		return anaOrtaklikNetKar;
	}


	public void setAnaOrtaklikNetKar(Double anaOrtaklikNetKar) {
		this.anaOrtaklikNetKar = anaOrtaklikNetKar;
	}


	@Override
	public Long entityId() {
		// TODO Auto-generated method stub
		return getKarZararId();
	}


	@Override
	public void setEntityId(Long id) {
		setKarZararId(id);
	}


	public Long getKarZararId() {
		return karZararId;
	}

	public void setKarZararId(Long karZararId) {
		this.karZararId = karZararId;
	}


	public Double getDigerGelirlerHasilat() {
		return digerGelirlerHasilat;
	}


	public void setDigerGelirlerHasilat(Double digerGelirlerHasilat) {
		this.digerGelirlerHasilat = digerGelirlerHasilat;
	}


	public Double getKontrolGucuOlmayanNetKar() {
		return kontrolGucuOlmayanNetKar;
	}


	public void setKontrolGucuOlmayanNetKar(Double kontrolGucuOlmayanNetKar) {
		this.kontrolGucuOlmayanNetKar = kontrolGucuOlmayanNetKar;
	}

	public Double getToplamHasilat(){
		return this.disHatHasilat + this.icHatHasilat + this.kargoUcaklariKargoGelir + this.bellyKargoGelir +this.yurticiCharter + this.yurtdisiCharter + this.wetleaseGelir + this.digerGelirlerHasilat;
	}

	public Double getToplamFaailyetGiderleri(){
		return this.yerEkipmanAmortismanGider + this.yerEkipmanDegerDusukGider + this.ucusIsletmeGider + this.digerGenelIdariGider + this.yolcuKomisyon + this.kargoKomisyon + this.reklamGider + this.personelGider + this.digerSatisReklamGider + this.ucusEkipmanAmortismanGider + this.ucusEkipmanDegerDusukGider + this.ucusEkipmanBakimGider + this.aktiflesenBakimGider + this.ucusEkipmanKiraGider + this.ucakKiraGider + this.koltukKiraGider + this.ucusEkipmanSigortaGider + this.maliMesuliyetSigortaGider + this.kokpitEkipGider + this.kabinEkipGider + this.kokpitEkipEgitimGider + this.havaalaniVergiGuvenlik + this.konmaYerIstasyonGider + this.akaryakitGider + this.ustgecisGider + this.ikramGider;
	}

	public Double getNetKarZarar(){
		return this.vergiGiderGelir + this.ertelenmisVergiGiderGelir + this.turevFinansalAracKarZarar + this.kurFarkiKarZarar + this.finansalGider + this.finansalGelir + this.finansalKiralamaFaizGider + this.ozkaynakYontemiyleKarZarar + this.digerGelirler + this.digerGiderler + this.supheliAlacakKarsilikGider + this.sabitKiymetSatisKarZarar + this.yerEkipmanAmortismanGider + this.yerEkipmanDegerDusukGider + this.ucusIsletmeGider + this.digerGenelIdariGider + this.yolcuKomisyon + this.kargoKomisyon + this.reklamGider + this.personelGider + this.digerSatisReklamGider + this.ucusEkipmanAmortismanGider + this.ucusEkipmanDegerDusukGider + this.ucusEkipmanBakimGider + this.aktiflesenBakimGider + this.ucusEkipmanKiraGider + this.ucakKiraGider + this.koltukKiraGider + this.ucusEkipmanSigortaGider + this.maliMesuliyetSigortaGider + this.kokpitEkipGider + this.kabinEkipGider + this.kokpitEkipEgitimGider + this.havaalaniVergiGuvenlik + this.konmaYerIstasyonGider + this.akaryakitGider + this.ustgecisGider + this.ikramGider + this.disHatHasilat + this.icHatHasilat + this.kargoUcaklariKargoGelir + this.bellyKargoGelir +this.yurticiCharter + this.yurtdisiCharter + this.wetleaseGelir + this.digerGelirlerHasilat;
	}
}

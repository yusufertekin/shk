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
public class NakitAkim extends GenericEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "nakitAkimSeq")
	@SequenceGenerator(name="nakitAkimSeq", sequenceName="NAKIT_AKIM_SEQ", allocationSize=1, initialValue=1)
	private Long nakitAkimId;
	
	@Column
	private Double vergiOncesiKarZarar;
	@Column
	private Double amortsmanItfaPay;
	@Column
	private Double kidemTazminatKarsilik;
	@Column
	private Double borcKarislikNet;
	@Column
	private Double faizGelir;
	@Column
	private Double sabitKiymetSatisKar;
	@Column
	private Double degerDusukKarsilik;
	@Column
	private Double ozkaynakPayAYGMuhasebe;
	@Column
	private Double istirakGelir;
	@Column
	private Double finansalKiralamaFaizGider;
	@Column
	private Double hibeKrediDegisim;
	@Column
	private Double gerceklesmemisKurFarkiGider;
	@Column
	private Double supheliAlacakArtis;
	@Column
	private Double yatirimAmacliGayrimenkul;
	@Column
	private Double turevEnstrumanMakulDeger;
	@Column
	private Double isletmeSermayeDegisiklikKar;
	@Column	
	private Double ticariAlacakArtis;
	@Column
	private Double digerKisaUzunVadeliArtis;
	@Column
	private Double stoklarArtis;
	@Column
	private Double digerCariVarlikArtisAzalis;
	@Column
	private Double digerCariOlmayanDuranVarlik;
	@Column
	private Double ticariBorcArtis;
	@Column
	private Double digerBorcAzalis;
	@Column
	private Double digerKisaUzunYukumlulukArtis;
	@Column
	private Double kisaVadeliCalisanFaydaAA;
	@Column
	private Double yolcuUcusYukumlulukArtis;
	@Column
	private Double faaliyetEldeEdilenNakit;
	@Column
	private Double odenenKidemTazminat;
	@Column
	private Double odenenFaiz;
	@Column
	private Double odenenVergi;
	@Column
	private Double faaliyetEldeEdilenNetNakit;
	@Column
	private Double maddiMaddiOlmayanEldeEdilen;
	@Column
	private Double alinanFaiz;
	@Column
	private Double maddiMaddiOlmayanVarlikAlimi;
	@Column
	private Double ucakOnOdemeGeriDonus;
	@Column
	private Double finansalYatirimArtis;
	@Column
	private Double istirakSermayaArtirimNakit;
	@Column
	private Double yatirimFaaliyetKullanilanNet;
	@Column
	private Double finansalKirlamaAnaparaGeri;
	@Column
	private Double finansalBorcAzalis;
	@Column
	private Double digerFinansalYukumlulukArtis;
	@Column
	private Double finanmanFaaliyetNetNakit;
	@Column
	private Double nakitDegerNetArtisAzalis;
	@Column
	private Double donemBasindakiNakit;
	@Column
	private Double donemSonundakiNakit;
	


	@Override
	public Long entityId() {
		// TODO Auto-generated method stub
		return getNakitAkimId();
	}


	@Override
	public void setEntityId(Long id) {
		setNakitAkimId(id);
	}


	public Long getNakitAkimId() {
		return nakitAkimId;
	}


	public void setNakitAkimId(Long nakitAkimId) {
		this.nakitAkimId = nakitAkimId;
	}


	public Double getVergiOncesiKarZarar() {
		return vergiOncesiKarZarar;
	}


	public void setVergiOncesiKarZarar(Double vergiOncesiKarZarar) {
		this.vergiOncesiKarZarar = vergiOncesiKarZarar;
	}


	public Double getAmortsmanItfaPay() {
		return amortsmanItfaPay;
	}


	public void setAmortsmanItfaPay(Double amortsmanItfaPay) {
		this.amortsmanItfaPay = amortsmanItfaPay;
	}


	public Double getKidemTazminatKarsilik() {
		return kidemTazminatKarsilik;
	}


	public void setKidemTazminatKarsilik(Double kidemTazminatKarsilik) {
		this.kidemTazminatKarsilik = kidemTazminatKarsilik;
	}


	public Double getBorcKarislikNet() {
		return borcKarislikNet;
	}


	public void setBorcKarislikNet(Double borcKarislikNet) {
		this.borcKarislikNet = borcKarislikNet;
	}


	public Double getFaizGelir() {
		return faizGelir;
	}


	public void setFaizGelir(Double faizGelir) {
		this.faizGelir = faizGelir;
	}


	public Double getSabitKiymetSatisKar() {
		return sabitKiymetSatisKar;
	}


	public void setSabitKiymetSatisKar(Double sabitKiymetSatisKar) {
		this.sabitKiymetSatisKar = sabitKiymetSatisKar;
	}


	public Double getDegerDusukKarsilik() {
		return degerDusukKarsilik;
	}


	public void setDegerDusukKarsilik(Double degerDusukKarsilik) {
		this.degerDusukKarsilik = degerDusukKarsilik;
	}


	public Double getOzkaynakPayAYGMuhasebe() {
		return ozkaynakPayAYGMuhasebe;
	}


	public void setOzkaynakPayAYGMuhasebe(Double ozkaynakPayAYGMuhasebe) {
		this.ozkaynakPayAYGMuhasebe = ozkaynakPayAYGMuhasebe;
	}


	public Double getIstirakGelir() {
		return istirakGelir;
	}


	public void setIstirakGelir(Double istirakGelir) {
		this.istirakGelir = istirakGelir;
	}


	public Double getFinansalKiralamaFaizGider() {
		return finansalKiralamaFaizGider;
	}


	public void setFinansalKiralamaFaizGider(Double finansalKiralamaFaizGider) {
		this.finansalKiralamaFaizGider = finansalKiralamaFaizGider;
	}


	public Double getHibeKrediDegisim() {
		return hibeKrediDegisim;
	}


	public void setHibeKrediDegisim(Double hibeKrediDegisim) {
		this.hibeKrediDegisim = hibeKrediDegisim;
	}


	public Double getGerceklesmemisKurFarkiGider() {
		return gerceklesmemisKurFarkiGider;
	}


	public void setGerceklesmemisKurFarkiGider(Double gerceklesmemisKurFarkiGider) {
		this.gerceklesmemisKurFarkiGider = gerceklesmemisKurFarkiGider;
	}


	public Double getSupheliAlacakArtis() {
		return supheliAlacakArtis;
	}


	public void setSupheliAlacakArtis(Double supheliAlacakArtis) {
		this.supheliAlacakArtis = supheliAlacakArtis;
	}


	public Double getYatirimAmacliGayrimenkul() {
		return yatirimAmacliGayrimenkul;
	}


	public void setYatirimAmacliGayrimenkul(Double yatirimAmacliGayrimenkul) {
		this.yatirimAmacliGayrimenkul = yatirimAmacliGayrimenkul;
	}


	public Double getTurevEnstrumanMakulDeger() {
		return turevEnstrumanMakulDeger;
	}


	public void setTurevEnstrumanMakulDeger(Double turevEnstrumanMakulDeger) {
		this.turevEnstrumanMakulDeger = turevEnstrumanMakulDeger;
	}


	public Double getIsletmeSermayeDegisiklikKar() {
		return isletmeSermayeDegisiklikKar;
	}


	public void setIsletmeSermayeDegisiklikKar(Double isletmeSermayeDegisiklikKar) {
		this.isletmeSermayeDegisiklikKar = isletmeSermayeDegisiklikKar;
	}


	public Double getTicariAlacakArtis() {
		return ticariAlacakArtis;
	}


	public void setTicariAlacakArtis(Double ticariAlacakArtis) {
		this.ticariAlacakArtis = ticariAlacakArtis;
	}


	public Double getStoklarArtis() {
		return stoklarArtis;
	}


	public void setStoklarArtis(Double stoklarArtis) {
		this.stoklarArtis = stoklarArtis;
	}


	public Double getDigerCariVarlikArtisAzalis() {
		return digerCariVarlikArtisAzalis;
	}


	public void setDigerCariVarlikArtisAzalis(Double digerCariVarlikArtisAzalis) {
		this.digerCariVarlikArtisAzalis = digerCariVarlikArtisAzalis;
	}


	public Double getDigerCariOlmayanDuranVarlik() {
		return digerCariOlmayanDuranVarlik;
	}


	public void setDigerCariOlmayanDuranVarlik(Double digerCariOlmayanDuranVarlik) {
		this.digerCariOlmayanDuranVarlik = digerCariOlmayanDuranVarlik;
	}


	public Double getTicariBorcArtis() {
		return ticariBorcArtis;
	}


	public void setTicariBorcArtis(Double ticariBorcArtis) {
		this.ticariBorcArtis = ticariBorcArtis;
	}


	public Double getDigerBorcAzalis() {
		return digerBorcAzalis;
	}


	public void setDigerBorcAzalis(Double digerBorcAzalis) {
		this.digerBorcAzalis = digerBorcAzalis;
	}


	public Double getDigerKisaUzunVadeliArtis() {
		return digerKisaUzunVadeliArtis;
	}


	public void setDigerKisaUzunVadeliArtis(Double digerKisaUzunVadeliArtis) {
		this.digerKisaUzunVadeliArtis = digerKisaUzunVadeliArtis;
	}


	public Double getYolcuUcusYukumlulukArtis() {
		return yolcuUcusYukumlulukArtis;
	}


	public void setYolcuUcusYukumlulukArtis(Double yolcuUcusYukumlulukArtis) {
		this.yolcuUcusYukumlulukArtis = yolcuUcusYukumlulukArtis;
	}


	public Double getFaaliyetEldeEdilenNakit() {
		return faaliyetEldeEdilenNakit;
	}


	public void setFaaliyetEldeEdilenNakit(Double faaliyetEldeEdilenNakit) {
		this.faaliyetEldeEdilenNakit = faaliyetEldeEdilenNakit;
	}


	public Double getOdenenKidemTazminat() {
		return odenenKidemTazminat;
	}


	public void setOdenenKidemTazminat(Double odenenKidemTazminat) {
		this.odenenKidemTazminat = odenenKidemTazminat;
	}


	public Double getOdenenFaiz() {
		return odenenFaiz;
	}


	public void setOdenenFaiz(Double odenenFaiz) {
		this.odenenFaiz = odenenFaiz;
	}


	public Double getOdenenVergi() {
		return odenenVergi;
	}


	public void setOdenenVergi(Double odenenVergi) {
		this.odenenVergi = odenenVergi;
	}


	public Double getFaaliyetEldeEdilenNetNakit() {
		return faaliyetEldeEdilenNetNakit;
	}


	public void setFaaliyetEldeEdilenNetNakit(Double faaliyetEldeEdilenNetNakit) {
		this.faaliyetEldeEdilenNetNakit = faaliyetEldeEdilenNetNakit;
	}


	public Double getMaddiMaddiOlmayanEldeEdilen() {
		return maddiMaddiOlmayanEldeEdilen;
	}


	public void setMaddiMaddiOlmayanEldeEdilen(Double maddiMaddiOlmayanEldeEdilen) {
		this.maddiMaddiOlmayanEldeEdilen = maddiMaddiOlmayanEldeEdilen;
	}


	public Double getAlinanFaiz() {
		return alinanFaiz;
	}


	public void setAlinanFaiz(Double alinanFaiz) {
		this.alinanFaiz = alinanFaiz;
	}


	public Double getMaddiMaddiOlmayanVarlikAlimi() {
		return maddiMaddiOlmayanVarlikAlimi;
	}


	public void setMaddiMaddiOlmayanVarlikAlimi(Double maddiMaddiOlmayanVarlikAlimi) {
		this.maddiMaddiOlmayanVarlikAlimi = maddiMaddiOlmayanVarlikAlimi;
	}


	public Double getUcakOnOdemeGeriDonus() {
		return ucakOnOdemeGeriDonus;
	}


	public void setUcakOnOdemeGeriDonus(Double ucakOnOdemeGeriDonus) {
		this.ucakOnOdemeGeriDonus = ucakOnOdemeGeriDonus;
	}


	public Double getFinansalYatirimArtis() {
		return finansalYatirimArtis;
	}


	public void setFinansalYatirimArtis(Double finansalYatirimArtis) {
		this.finansalYatirimArtis = finansalYatirimArtis;
	}


	public Double getIstirakSermayaArtirimNakit() {
		return istirakSermayaArtirimNakit;
	}


	public void setIstirakSermayaArtirimNakit(Double istirakSermayaArtirimNakit) {
		this.istirakSermayaArtirimNakit = istirakSermayaArtirimNakit;
	}


	public Double getYatirimFaaliyetKullanilanNet() {
		return yatirimFaaliyetKullanilanNet;
	}


	public void setYatirimFaaliyetKullanilanNet(Double yatirimFaaliyetKullanilanNet) {
		this.yatirimFaaliyetKullanilanNet = yatirimFaaliyetKullanilanNet;
	}


	public Double getFinansalKirlamaAnaparaGeri() {
		return finansalKirlamaAnaparaGeri;
	}


	public void setFinansalKirlamaAnaparaGeri(Double finansalKirlamaAnaparaGeri) {
		this.finansalKirlamaAnaparaGeri = finansalKirlamaAnaparaGeri;
	}


	public Double getFinansalBorcAzalis() {
		return finansalBorcAzalis;
	}


	public void setFinansalBorcAzalis(Double finansalBorcAzalis) {
		this.finansalBorcAzalis = finansalBorcAzalis;
	}


	public Double getDigerFinansalYukumlulukArtis() {
		return digerFinansalYukumlulukArtis;
	}


	public void setDigerFinansalYukumlulukArtis(Double digerFinansalYukumlulukArtis) {
		this.digerFinansalYukumlulukArtis = digerFinansalYukumlulukArtis;
	}


	public Double getFinanmanFaaliyetNetNakit() {
		return finanmanFaaliyetNetNakit;
	}


	public void setFinanmanFaaliyetNetNakit(Double finanmanFaaliyetNetNakit) {
		this.finanmanFaaliyetNetNakit = finanmanFaaliyetNetNakit;
	}


	public Double getNakitDegerNetArtisAzalis() {
		return nakitDegerNetArtisAzalis;
	}


	public void setNakitDegerNetArtisAzalis(Double nakitDegerNetArtisAzalis) {
		this.nakitDegerNetArtisAzalis = nakitDegerNetArtisAzalis;
	}


	public Double getDonemBasindakiNakit() {
		return donemBasindakiNakit;
	}


	public void setDonemBasindakiNakit(Double donemBasindakiNakit) {
		this.donemBasindakiNakit = donemBasindakiNakit;
	}


	public Double getDonemSonundakiNakit() {
		return donemSonundakiNakit;
	}


	public void setDonemSonundakiNakit(Double donemSonundakiNakit) {
		this.donemSonundakiNakit = donemSonundakiNakit;
	}


	public Double getDigerKisaUzunYukumlulukArtis() {
		return digerKisaUzunYukumlulukArtis;
	}


	public void setDigerKisaUzunYukumlulukArtis(
			Double digerKisaUzunYukumlulukArtis) {
		this.digerKisaUzunYukumlulukArtis = digerKisaUzunYukumlulukArtis;
	}


	public Double getKisaVadeliCalisanFaydaAA() {
		return kisaVadeliCalisanFaydaAA;
	}


	public void setKisaVadeliCalisanFaydaAA(Double kisaVadeliCalisanFaydaAA) {
		this.kisaVadeliCalisanFaydaAA = kisaVadeliCalisanFaydaAA;
	}



}


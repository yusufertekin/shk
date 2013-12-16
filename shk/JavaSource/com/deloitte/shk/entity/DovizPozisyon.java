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
public class DovizPozisyon extends GenericEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "dovizPozisyonSeq")
	@SequenceGenerator(name="dovizPozisyonSeq", sequenceName="DOVIZ_POZISYON_SEQ", allocationSize=1, initialValue=1)
	private Long dovizPozisyonId;
	
	@Column
	private Long columnNumber;
	
	@Column
	private String paraBirim;
	
	@Column
	private Double nakitNakitBenzerleri;
	@Column
	private Double finansalYatirimlar;
	@Column
	private Double ticariAlacaklar;
	@Column
	private Double ucakAlimiOnOdeme;
	@Column
	private Double turevFinansalAraclarDonen;
	@Column
	private Double digerAlacaklarDigerDonen;
	@Column
	private Double iliskiliTarafTicariOADonen;
	@Column
	private Double satisAmaciylaTutulanVarlik;
	@Column
	private Double uzunVadeliDigerAlacak;
	@Column
	private Double iliskiTarafAlacakDuran;
	@Column
	private Double digerAlacakDuran;
	@Column
	private Double digerVarlikDuran;
	@Column
	private Double turevFinansalAracDuran;
	@Column
	private Double finansalBorcKisa;
	@Column
	private Double uzunVadeliKrediKisaKismi;
	@Column
	private Double finansalKiralamaYukumKisa;
	@Column	
	private Double ticariBorclarKisa;
	@Column
	private Double odenecekPersonelUcret;
	@Column
	private Double calisanSaglananFaydaKisa;
	@Column
	private Double turevFinansalAracKisa;
	@Column
	private Double iliskiliTarafDigerBorcKisa;
	@Column
	private Double borcKarsiliklari;
	@Column
	private Double digerBorcYukumlulukKisa;
	@Column
	private Double finansalBorcUzun;
	@Column
	private Double finansalKiralamaYukumUzun;
	@Column
	private Double ticariBorclarUzun;
	@Column
	private Double iliskiliTarafDigerBorcUzun;
	@Column
	private Double calisanSaglananFaydaUzun;
	@Column
	private Double digerUzunVadeYukumluluk;
	@Column
	private Double turevFinansalAracUzun;
	

	public Long getDovizPozisyonId() {
		return dovizPozisyonId;
	}

	public void setDovizPozisyonId(Long dovizPozisyonId) {
		this.dovizPozisyonId = dovizPozisyonId;
	}

	@Override
	public Long entityId() {
		// TODO Auto-generated method stub
		return getDovizPozisyonId();
	}

	@Override
	public void setEntityId(Long id) {
		setDovizPozisyonId(id);
	}

	public Long getColumnNumber() {
		return columnNumber;
	}

	public void setColumnNumber(Long columnNumber) {
		this.columnNumber = columnNumber;
	}

	public String getParaBirim() {
		return paraBirim;
	}

	public void setParaBirim(String paraBirim) {
		this.paraBirim = paraBirim;
	}

	public Double getNakitNakitBenzerleri() {
		return nakitNakitBenzerleri;
	}

	public void setNakitNakitBenzerleri(Double nakitNakitBenzerleri) {
		this.nakitNakitBenzerleri = nakitNakitBenzerleri;
	}

	public Double getFinansalYatirimlar() {
		return finansalYatirimlar;
	}

	public void setFinansalYatirimlar(Double finansalYatirimlar) {
		this.finansalYatirimlar = finansalYatirimlar;
	}

	public Double getTicariAlacaklar() {
		return ticariAlacaklar;
	}

	public void setTicariAlacaklar(Double ticariAlacaklar) {
		this.ticariAlacaklar = ticariAlacaklar;
	}

	public Double getUcakAlimiOnOdeme() {
		return ucakAlimiOnOdeme;
	}

	public void setUcakAlimiOnOdeme(Double ucakAlimiOnOdeme) {
		this.ucakAlimiOnOdeme = ucakAlimiOnOdeme;
	}

	public Double getTurevFinansalAraclarDonen() {
		return turevFinansalAraclarDonen;
	}

	public void setTurevFinansalAraclarDonen(Double turevFinansalAraclarDonen) {
		this.turevFinansalAraclarDonen = turevFinansalAraclarDonen;
	}

	public Double getDigerAlacaklarDigerDonen() {
		return digerAlacaklarDigerDonen;
	}

	public void setDigerAlacaklarDigerDonen(Double digerAlacaklarDigerDonen) {
		this.digerAlacaklarDigerDonen = digerAlacaklarDigerDonen;
	}

	public Double getIliskiliTarafTicariOADonen() {
		return iliskiliTarafTicariOADonen;
	}

	public void setIliskiliTarafTicariOADonen(Double iliskiliTarafTicariOADonen) {
		this.iliskiliTarafTicariOADonen = iliskiliTarafTicariOADonen;
	}

	public Double getSatisAmaciylaTutulanVarlik() {
		return satisAmaciylaTutulanVarlik;
	}

	public void setSatisAmaciylaTutulanVarlik(Double satisAmaciylaTutulanVarlik) {
		this.satisAmaciylaTutulanVarlik = satisAmaciylaTutulanVarlik;
	}

	public Double getUzunVadeliDigerAlacak() {
		return uzunVadeliDigerAlacak;
	}

	public void setUzunVadeliDigerAlacak(Double uzunVadeliDigerAlacak) {
		this.uzunVadeliDigerAlacak = uzunVadeliDigerAlacak;
	}

	public Double getIliskiTarafAlacakDuran() {
		return iliskiTarafAlacakDuran;
	}

	public void setIliskiTarafAlacakDuran(Double iliskiTarafAlacakDuran) {
		this.iliskiTarafAlacakDuran = iliskiTarafAlacakDuran;
	}

	public Double getDigerAlacakDuran() {
		return digerAlacakDuran;
	}

	public void setDigerAlacakDuran(Double digerAlacakDuran) {
		this.digerAlacakDuran = digerAlacakDuran;
	}

	public Double getDigerVarlikDuran() {
		return digerVarlikDuran;
	}

	public void setDigerVarlikDuran(Double digerVarlikDuran) {
		this.digerVarlikDuran = digerVarlikDuran;
	}

	public Double getTurevFinansalAracDuran() {
		return turevFinansalAracDuran;
	}

	public void setTurevFinansalAracDuran(Double turevFinansalAracDuran) {
		this.turevFinansalAracDuran = turevFinansalAracDuran;
	}

	public Double getFinansalBorcKisa() {
		return finansalBorcKisa;
	}

	public void setFinansalBorcKisa(Double finansalBorcKisa) {
		this.finansalBorcKisa = finansalBorcKisa;
	}

	public Double getUzunVadeliKrediKisaKismi() {
		return uzunVadeliKrediKisaKismi;
	}

	public void setUzunVadeliKrediKisaKismi(Double uzunVadeliKrediKisaKismi) {
		this.uzunVadeliKrediKisaKismi = uzunVadeliKrediKisaKismi;
	}

	public Double getFinansalKiralamaYukumKisa() {
		return finansalKiralamaYukumKisa;
	}

	public void setFinansalKiralamaYukumKisa(Double finansalKiralamaYukumKisa) {
		this.finansalKiralamaYukumKisa = finansalKiralamaYukumKisa;
	}

	public Double getTicariBorclarKisa() {
		return ticariBorclarKisa;
	}

	public void setTicariBorclarKisa(Double ticariBorclarKisa) {
		this.ticariBorclarKisa = ticariBorclarKisa;
	}

	public Double getOdenecekPersonelUcret() {
		return odenecekPersonelUcret;
	}

	public void setOdenecekPersonelUcret(Double odenecekPersonelUcret) {
		this.odenecekPersonelUcret = odenecekPersonelUcret;
	}

	public Double getCalisanSaglananFaydaKisa() {
		return calisanSaglananFaydaKisa;
	}

	public void setCalisanSaglananFaydaKisa(Double calisanSaglananFaydaKisa) {
		this.calisanSaglananFaydaKisa = calisanSaglananFaydaKisa;
	}

	public Double getTurevFinansalAracKisa() {
		return turevFinansalAracKisa;
	}

	public void setTurevFinansalAracKisa(Double turevFinansalAracKisa) {
		this.turevFinansalAracKisa = turevFinansalAracKisa;
	}

	public Double getIliskiliTarafDigerBorcKisa() {
		return iliskiliTarafDigerBorcKisa;
	}

	public void setIliskiliTarafDigerBorcKisa(Double iliskiliTarafDigerBorcKisa) {
		this.iliskiliTarafDigerBorcKisa = iliskiliTarafDigerBorcKisa;
	}

	public Double getBorcKarsiliklari() {
		return borcKarsiliklari;
	}

	public void setBorcKarsiliklari(Double borcKarsiliklari) {
		this.borcKarsiliklari = borcKarsiliklari;
	}

	public Double getDigerBorcYukumlulukKisa() {
		return digerBorcYukumlulukKisa;
	}

	public void setDigerBorcYukumlulukKisa(Double digerBorcYukumlulukKisa) {
		this.digerBorcYukumlulukKisa = digerBorcYukumlulukKisa;
	}

	public Double getFinansalBorcUzun() {
		return finansalBorcUzun;
	}

	public void setFinansalBorcUzun(Double finansalBorcUzun) {
		this.finansalBorcUzun = finansalBorcUzun;
	}

	public Double getFinansalKiralamaYukumUzun() {
		return finansalKiralamaYukumUzun;
	}

	public void setFinansalKiralamaYukumUzun(Double finansalKiralamaYukumUzun) {
		this.finansalKiralamaYukumUzun = finansalKiralamaYukumUzun;
	}

	public Double getTicariBorclarUzun() {
		return ticariBorclarUzun;
	}

	public void setTicariBorclarUzun(Double ticariBorclarUzun) {
		this.ticariBorclarUzun = ticariBorclarUzun;
	}

	public Double getIliskiliTarafDigerBorcUzun() {
		return iliskiliTarafDigerBorcUzun;
	}

	public void setIliskiliTarafDigerBorcUzun(Double iliskiliTarafDigerBorcUzun) {
		this.iliskiliTarafDigerBorcUzun = iliskiliTarafDigerBorcUzun;
	}

	public Double getCalisanSaglananFaydaUzun() {
		return calisanSaglananFaydaUzun;
	}

	public void setCalisanSaglananFaydaUzun(Double calisanSaglananFaydaUzun) {
		this.calisanSaglananFaydaUzun = calisanSaglananFaydaUzun;
	}

	public Double getDigerUzunVadeYukumluluk() {
		return digerUzunVadeYukumluluk;
	}

	public void setDigerUzunVadeYukumluluk(Double digerUzunVadeYukumluluk) {
		this.digerUzunVadeYukumluluk = digerUzunVadeYukumluluk;
	}

	public Double getTurevFinansalAracUzun() {
		return turevFinansalAracUzun;
	}

	public void setTurevFinansalAracUzun(Double turevFinansalAracUzun) {
		this.turevFinansalAracUzun = turevFinansalAracUzun;
	}
	


}

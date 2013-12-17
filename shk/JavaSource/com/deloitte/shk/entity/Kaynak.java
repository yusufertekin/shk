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
public class Kaynak extends GenericEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "kaynakSeq")
	@SequenceGenerator(name="kaynakSeq", sequenceName="KAYNAK_SEQ", allocationSize=1, initialValue=1)
	private Long kaynakId;
	
	@Column
	private Double finansalBorclar;
	@Column
	private Double uzunVadeliKrediKisaKisim;
	@Column
	private Double finansalKiralama;
	@Column
	private Double ticariBorc;
	@Column
	private Double donemKariVergi;
	@Column
	private Double yolcuUcusYukumluluk;
	@Column
	private Double faaliyetTipiKiralananUcakBG;
	@Column
	private Double odenecekPersonelUcreti;
	@Column
	private Double calisanlaraSaglananDigerF;
	@Column
	private Double odenecekVergiFonlar;
	@Column
	private Double turevFinansalAraclar;
	@Column
	private Double iliskiliTaraflaraBorclar;
	@Column
	private Double borcKarsiliklari;
	@Column
	private Double digerKisaVadeliYukumluluk;
	@Column
	private Double finansalBorcUzun;
	@Column
	private Double finansalKiralamaUzun;
	@Column	
	private Double ticariBorcUzun;
	@Column
	private Double iliskiliTaraflaraBorclarUzun;
	@Column
	private Double calisanlaraSaglananDigerFUzun;
	@Column
	private Double ertelenmisVergiYukumluluk;
	@Column
	private Double digerUzunVadeliYukumluluk;
	@Column
	private Double turevFinansalAraclarUzun;
	@Column
	private Double sermaye;
	@Column
	private Double sermayeDuzeltmeFark;
	@Column
	private Double hisseSenediIhracPrim;
	@Column
	private Double kardanAyrilanKisitYedek;
	@Column
	private Double yabanciParaCevrimFarki;
	@Column
	private Double finansalRisktenKorunmaFon;
	@Column
	private Double duranVarlikDegerFonu;
	@Column
	private Double finansalVarlikDegerFonu;
	@Column
	private Double gecmisYillarKarZarar;
	@Column
	private Double kontrolGucuOlmayan;
	

	

	@Override
	public Long entityId() {
		// TODO Auto-generated method stub
		return getKaynakId();
	}

	public Double getFinansalBorclar() {
		return finansalBorclar;
	}

	public void setFinansalBorclar(Double finansalBorclar) {
		this.finansalBorclar = finansalBorclar;
	}

	public Double getUzunVadeliKrediKisaKisim() {
		return uzunVadeliKrediKisaKisim;
	}

	public void setUzunVadeliKrediKisaKisim(Double uzunVadeliKrediKisaKisim) {
		this.uzunVadeliKrediKisaKisim = uzunVadeliKrediKisaKisim;
	}

	public Double getFinansalKiralama() {
		return finansalKiralama;
	}

	public void setFinansalKiralama(Double finansalKiralama) {
		this.finansalKiralama = finansalKiralama;
	}

	public Double getTicariBorc() {
		return ticariBorc;
	}

	public void setTicariBorc(Double ticariBorc) {
		this.ticariBorc = ticariBorc;
	}

	public Double getDonemKariVergi() {
		return donemKariVergi;
	}

	public void setDonemKariVergi(Double donemKariVergi) {
		this.donemKariVergi = donemKariVergi;
	}

	public Double getYolcuUcusYukumluluk() {
		return yolcuUcusYukumluluk;
	}

	public void setYolcuUcusYukumluluk(Double yolcuUcusYukumluluk) {
		this.yolcuUcusYukumluluk = yolcuUcusYukumluluk;
	}

	public Double getFaaliyetTipiKiralananUcakBG() {
		return faaliyetTipiKiralananUcakBG;
	}

	public void setFaaliyetTipiKiralananUcakBG(Double faaliyetTipiKiralananUcakBG) {
		this.faaliyetTipiKiralananUcakBG = faaliyetTipiKiralananUcakBG;
	}

	public Double getOdenecekPersonelUcreti() {
		return odenecekPersonelUcreti;
	}

	public void setOdenecekPersonelUcreti(Double odenecekPersonelUcreti) {
		this.odenecekPersonelUcreti = odenecekPersonelUcreti;
	}

	public Double getCalisanlaraSaglananDigerF() {
		return calisanlaraSaglananDigerF;
	}

	public void setCalisanlaraSaglananDigerF(Double calisanlaraSaglananDigerF) {
		this.calisanlaraSaglananDigerF = calisanlaraSaglananDigerF;
	}

	public Double getOdenecekVergiFonlar() {
		return odenecekVergiFonlar;
	}

	public void setOdenecekVergiFonlar(Double odenecekVergiFonlar) {
		this.odenecekVergiFonlar = odenecekVergiFonlar;
	}

	public Double getTurevFinansalAraclar() {
		return turevFinansalAraclar;
	}

	public void setTurevFinansalAraclar(Double turevFinansalAraclar) {
		this.turevFinansalAraclar = turevFinansalAraclar;
	}

	public Double getIliskiliTaraflaraBorclar() {
		return iliskiliTaraflaraBorclar;
	}

	public void setIliskiliTaraflaraBorclar(Double iliskiliTaraflaraBorclar) {
		this.iliskiliTaraflaraBorclar = iliskiliTaraflaraBorclar;
	}

	public Double getBorcKarsiliklari() {
		return borcKarsiliklari;
	}

	public void setBorcKarsiliklari(Double borcKarsiliklari) {
		this.borcKarsiliklari = borcKarsiliklari;
	}

	public Double getDigerKisaVadeliYukumluluk() {
		return digerKisaVadeliYukumluluk;
	}

	public void setDigerKisaVadeliYukumluluk(Double digerKisaVadeliYukumluluk) {
		this.digerKisaVadeliYukumluluk = digerKisaVadeliYukumluluk;
	}

	public Double getFinansalBorcUzun() {
		return finansalBorcUzun;
	}

	public void setFinansalBorcUzun(Double finansalBorcUzun) {
		this.finansalBorcUzun = finansalBorcUzun;
	}

	public Double getFinansalKiralamaUzun() {
		return finansalKiralamaUzun;
	}

	public void setFinansalKiralamaUzun(Double finansalKiralamaUzun) {
		this.finansalKiralamaUzun = finansalKiralamaUzun;
	}

	public Double getTicariBorcUzun() {
		return ticariBorcUzun;
	}

	public void setTicariBorcUzun(Double ticariBorcUzun) {
		this.ticariBorcUzun = ticariBorcUzun;
	}

	public Double getIliskiliTaraflaraBorclarUzun() {
		return iliskiliTaraflaraBorclarUzun;
	}

	public void setIliskiliTaraflaraBorclarUzun(Double iliskiliTaraflaraBorclarUzun) {
		this.iliskiliTaraflaraBorclarUzun = iliskiliTaraflaraBorclarUzun;
	}

	public Double getCalisanlaraSaglananDigerFUzun() {
		return calisanlaraSaglananDigerFUzun;
	}

	public void setCalisanlaraSaglananDigerFUzun(
			Double calisanlaraSaglananDigerFUzun) {
		this.calisanlaraSaglananDigerFUzun = calisanlaraSaglananDigerFUzun;
	}

	public Double getErtelenmisVergiYukumluluk() {
		return ertelenmisVergiYukumluluk;
	}

	public void setErtelenmisVergiYukumluluk(Double ertelenmisVergiYukumluluk) {
		this.ertelenmisVergiYukumluluk = ertelenmisVergiYukumluluk;
	}

	public Double getDigerUzunVadeliYukumluluk() {
		return digerUzunVadeliYukumluluk;
	}

	public void setDigerUzunVadeliYukumluluk(Double digerUzunVadeliYukumluluk) {
		this.digerUzunVadeliYukumluluk = digerUzunVadeliYukumluluk;
	}

	public Double getTurevFinansalAraclarUzun() {
		return turevFinansalAraclarUzun;
	}

	public void setTurevFinansalAraclarUzun(Double turevFinansalAraclarUzun) {
		this.turevFinansalAraclarUzun = turevFinansalAraclarUzun;
	}

	public Double getSermaye() {
		return sermaye;
	}

	public void setSermaye(Double sermaye) {
		this.sermaye = sermaye;
	}

	public Double getSermayeDuzeltmeFark() {
		return sermayeDuzeltmeFark;
	}

	public void setSermayeDuzeltmeFark(Double sermayeDuzeltmeFark) {
		this.sermayeDuzeltmeFark = sermayeDuzeltmeFark;
	}

	public Double getHisseSenediIhracPrim() {
		return hisseSenediIhracPrim;
	}

	public void setHisseSenediIhracPrim(Double hisseSenediIhracPrim) {
		this.hisseSenediIhracPrim = hisseSenediIhracPrim;
	}

	public Double getKardanAyrilanKisitYedek() {
		return kardanAyrilanKisitYedek;
	}

	public void setKardanAyrilanKisitYedek(Double kardanAyrilanKisitYedek) {
		this.kardanAyrilanKisitYedek = kardanAyrilanKisitYedek;
	}

	public Double getYabanciParaCevrimFarki() {
		return yabanciParaCevrimFarki;
	}

	public void setYabanciParaCevrimFarki(Double yabanciParaCevrimFarki) {
		this.yabanciParaCevrimFarki = yabanciParaCevrimFarki;
	}

	public Double getFinansalRisktenKorunmaFon() {
		return finansalRisktenKorunmaFon;
	}

	public void setFinansalRisktenKorunmaFon(Double finansalRisktenKorunmaFon) {
		this.finansalRisktenKorunmaFon = finansalRisktenKorunmaFon;
	}

	public Double getDuranVarlikDegerFonu() {
		return duranVarlikDegerFonu;
	}

	public void setDuranVarlikDegerFonu(Double duranVarlikDegerFonu) {
		this.duranVarlikDegerFonu = duranVarlikDegerFonu;
	}

	public Double getFinansalVarlikDegerFonu() {
		return finansalVarlikDegerFonu;
	}

	public void setFinansalVarlikDegerFonu(Double finansalVarlikDegerFonu) {
		this.finansalVarlikDegerFonu = finansalVarlikDegerFonu;
	}

	public Double getGecmisYillarKarZarar() {
		return gecmisYillarKarZarar;
	}

	public void setGecmisYillarKarZarar(Double gecmisYillarKarZarar) {
		this.gecmisYillarKarZarar = gecmisYillarKarZarar;
	}

	@Override
	public void setEntityId(Long id) {
		setKaynakId(id);
	}


	public Long getKaynakId() {
		return kaynakId;
	}

	public void setKaynakId(Long kaynakId) {
		this.kaynakId = kaynakId;
	}

	public Double getKontrolGucuOlmayan() {
		return kontrolGucuOlmayan;
	}

	public void setKontrolGucuOlmayan(Double kontrolGucuOlmayan) {
		this.kontrolGucuOlmayan = kontrolGucuOlmayan;
	}
	
	public Double getToplamKisaVadeliYukumlulukler(){
		return this.finansalBorclar + this.uzunVadeliKrediKisaKisim + this.finansalKiralama + this.ticariBorc + this.donemKariVergi + this.yolcuUcusYukumluluk +this.faaliyetTipiKiralananUcakBG + this.odenecekPersonelUcreti + this.calisanlaraSaglananDigerF + this.odenecekVergiFonlar + this.turevFinansalAraclar + this.iliskiliTaraflaraBorclar + this.borcKarsiliklari + this.digerKisaVadeliYukumluluk;
	}

}

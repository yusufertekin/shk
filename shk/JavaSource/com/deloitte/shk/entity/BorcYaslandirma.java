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
public class BorcYaslandirma extends GenericEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "borcYaslandirmaSeq")
	@SequenceGenerator(name="borcYaslandirmaSeq", sequenceName="BORC_YASLANDIRMA_SEQ", allocationSize=1, initialValue=1)
	private Long borcYaslandirmaId;
	
	@Column
	private Long columnNumber;
	
	@Column
	private Double akaryakitFirmalarinBorclar;
	@Column
	private Double faaliyetKiralamasiBorclar;
	@Column
	private Double malzemeBakimOnarimBorclar;
	@Column
	private Double konmaHavalimaniBorclar;
	@Column
	private Double pazarlamaReklamBorclar;
	@Column
	private Double ustGecisBorclar;
	@Column
	private Double digerTedarikciBorclar;
	@Column
	private Double personeleBorclar;
	@Column
	private Double kokpitEkibiBorc;
	@Column
	private Double kabinEkibiBorc;
	@Column
	private Double ucakBakimPersoneliBorc;
	@Column
	private Double digerPersonelBorc;
	@Column
	private Double odenecekVergiSskBorc;
	@Column
	private Double gecikenSigortaPrimBorc;
	@Column
	private Double gecikenFinansalBorcTaksit;
	@Column
	private Double gecikenFinansalKiraTaksit;
	@Column	
	private Double gecikenFaaliyetTipiKira;
	@Column
	private Double gecikenBakimRezervOdeme;
	

	public Long getBorcYaslandirmaId() {
		return borcYaslandirmaId;
	}

	public void setBorcYaslandirmaId(Long borcYaslandirmaId) {
		this.borcYaslandirmaId = borcYaslandirmaId;
	}

	@Override
	public Long entityId() {
		// TODO Auto-generated method stub
		return getBorcYaslandirmaId();
	}

	@Override
	public void setEntityId(Long id) {
		setBorcYaslandirmaId(id);
	}


	public Double getAkaryakitFirmalarinBorclar() {
		return akaryakitFirmalarinBorclar;
	}

	public void setAkaryakitFirmalarinBorclar(Double akaryakitFirmalarinBorclar) {
		this.akaryakitFirmalarinBorclar = akaryakitFirmalarinBorclar;
	}

	public Double getFaaliyetKiralamasiBorclar() {
		return faaliyetKiralamasiBorclar;
	}

	public void setFaaliyetKiralamasiBorclar(Double faaliyetKiralamasiBorclar) {
		this.faaliyetKiralamasiBorclar = faaliyetKiralamasiBorclar;
	}

	public Double getMalzemeBakimOnarimBorclar() {
		return malzemeBakimOnarimBorclar;
	}

	public void setMalzemeBakimOnarimBorclar(Double malzemeBakimOnarimBorclar) {
		this.malzemeBakimOnarimBorclar = malzemeBakimOnarimBorclar;
	}

	public Double getKonmaHavalimaniBorclar() {
		return konmaHavalimaniBorclar;
	}

	public void setKonmaHavalimaniBorclar(Double konmaHavalimaniBorclar) {
		this.konmaHavalimaniBorclar = konmaHavalimaniBorclar;
	}

	public Double getPazarlamaReklamBorclar() {
		return pazarlamaReklamBorclar;
	}

	public void setPazarlamaReklamBorclar(Double pazarlamaReklamBorclar) {
		this.pazarlamaReklamBorclar = pazarlamaReklamBorclar;
	}

	public Double getDigerTedarikciBorclar() {
		return digerTedarikciBorclar;
	}

	public void setDigerTedarikciBorclar(Double digerTedarikciBorclar) {
		this.digerTedarikciBorclar = digerTedarikciBorclar;
	}

	public Double getPersoneleBorclar() {
		return personeleBorclar;
	}

	public void setPersoneleBorclar(Double personeleBorclar) {
		this.personeleBorclar = personeleBorclar;
	}

	public Double getKokpitEkibiBorc() {
		return kokpitEkibiBorc;
	}

	public void setKokpitEkibiBorc(Double kokpitEkibiBorc) {
		this.kokpitEkibiBorc = kokpitEkibiBorc;
	}

	public Double getKabinEkibiBorc() {
		return kabinEkibiBorc;
	}

	public void setKabinEkibiBorc(Double kabinEkibiBorc) {
		this.kabinEkibiBorc = kabinEkibiBorc;
	}

	public Double getUcakBakimPersoneliBorc() {
		return ucakBakimPersoneliBorc;
	}

	public void setUcakBakimPersoneliBorc(Double ucakBakimPersoneliBorc) {
		this.ucakBakimPersoneliBorc = ucakBakimPersoneliBorc;
	}

	public Double getDigerPersonelBorc() {
		return digerPersonelBorc;
	}

	public void setDigerPersonelBorc(Double digerPersonelBorc) {
		this.digerPersonelBorc = digerPersonelBorc;
	}

	public Double getOdenecekVergiSskBorc() {
		return odenecekVergiSskBorc;
	}

	public void setOdenecekVergiSskBorc(Double odenecekVergiSskBorc) {
		this.odenecekVergiSskBorc = odenecekVergiSskBorc;
	}

	public Double getGecikenSigortaPrimBorc() {
		return gecikenSigortaPrimBorc;
	}

	public void setGecikenSigortaPrimBorc(Double gecikenSigortaPrimBorc) {
		this.gecikenSigortaPrimBorc = gecikenSigortaPrimBorc;
	}

	public Double getGecikenFinansalBorcTaksit() {
		return gecikenFinansalBorcTaksit;
	}

	public void setGecikenFinansalBorcTaksit(Double gecikenFinansalBorcTaksit) {
		this.gecikenFinansalBorcTaksit = gecikenFinansalBorcTaksit;
	}

	public Double getGecikenBakimRezervOdeme() {
		return gecikenBakimRezervOdeme;
	}

	public void setGecikenBakimRezervOdeme(Double gecikenBakimRezervOdeme) {
		this.gecikenBakimRezervOdeme = gecikenBakimRezervOdeme;
	}

	public Double getGecikenFinansalKiraTaksit() {
		return gecikenFinansalKiraTaksit;
	}

	public void setGecikenFinansalKiraTaksit(Double gecikenFinansalKiraTaksit) {
		this.gecikenFinansalKiraTaksit = gecikenFinansalKiraTaksit;
	}

	public Double getGecikenFaaliyetTipiKira() {
		return gecikenFaaliyetTipiKira;
	}

	public void setGecikenFaaliyetTipiKira(Double gecikenFaaliyetTipiKira) {
		this.gecikenFaaliyetTipiKira = gecikenFaaliyetTipiKira;
	}

	public Long getColumnNumber() {
		return columnNumber;
	}

	public void setColumnNumber(Long columnNumber) {
		this.columnNumber = columnNumber;
	}

	public Double getUstGecisBorclar() {
		return ustGecisBorclar;
	}

	public void setUstGecisBorclar(Double ustGecisBorclar) {
		this.ustGecisBorclar = ustGecisBorclar;
	}
	

}

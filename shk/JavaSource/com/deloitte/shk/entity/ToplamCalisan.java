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
public class ToplamCalisan extends GenericEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "toplamCalisanSeq")
	@SequenceGenerator(name="toplamCalisanSeq", sequenceName="TOPLAM_CALISAN_SEQ", allocationSize=1, initialValue=1)
	private Long toplamCalisanId;
	
	@Column
	private Double genelMudurVeYardimcilari;
	@Column
	private Double pilotVeYardimciPilot;
	@Column
	private Double ucusIsletmePersonel;
	@Column
	private Double yolcuHizmetPersonel;
	@Column
	private Double bakimPersonel;
	@Column
	private Double ucakVeTrafikYonlendirmePers;
	@Column
	private Double ucakKontrolPersonel;
	@Column
	private Double yolcuHandlingPersonel;
	@Column
	private Double kargoHandlingPersonel;
	@Column
	private Double stajyerVeEgitmenler;
	@Column
	private Double istatistikBirimPersonel;
	@Column
	private Double digerPersonel;

	public Long getToplamCalisanId() {
		return toplamCalisanId;
	}

	public void setToplamCalisanId(Long toplamCalisanId) {
		this.toplamCalisanId = toplamCalisanId;
	}


	@Override
	public Long entityId() {
		// TODO Auto-generated method stub
		return getToplamCalisanId();
	}

	@Override
	public void setEntityId(Long id) {
		setToplamCalisanId(id);
	}


	public Double getGenelMudurVeYardimcilari() {
		return genelMudurVeYardimcilari;
	}

	public void setGenelMudurVeYardimcilari(Double genelMudurVeYardimcilari) {
		this.genelMudurVeYardimcilari = genelMudurVeYardimcilari;
	}

	public Double getPilotVeYardimciPilot() {
		return pilotVeYardimciPilot;
	}

	public void setPilotVeYardimciPilot(Double pilotVeYardimciPilot) {
		this.pilotVeYardimciPilot = pilotVeYardimciPilot;
	}

	public Double getUcusIsletmePersonel() {
		return ucusIsletmePersonel;
	}

	public void setUcusIsletmePersonel(Double ucusIsletmePersonel) {
		this.ucusIsletmePersonel = ucusIsletmePersonel;
	}

	public Double getYolcuHizmetPersonel() {
		return yolcuHizmetPersonel;
	}

	public void setYolcuHizmetPersonel(Double yolcuHizmetPersonel) {
		this.yolcuHizmetPersonel = yolcuHizmetPersonel;
	}

	public Double getBakimPersonel() {
		return bakimPersonel;
	}

	public void setBakimPersonel(Double bakimPersonel) {
		this.bakimPersonel = bakimPersonel;
	}

	public Double getUcakVeTrafikYonlendirmePers() {
		return ucakVeTrafikYonlendirmePers;
	}

	public void setUcakVeTrafikYonlendirmePers(Double ucakVeTrafikYonlendirmePers) {
		this.ucakVeTrafikYonlendirmePers = ucakVeTrafikYonlendirmePers;
	}

	public Double getUcakKontrolPersonel() {
		return ucakKontrolPersonel;
	}

	public void setUcakKontrolPersonel(Double ucakKontrolPersonel) {
		this.ucakKontrolPersonel = ucakKontrolPersonel;
	}

	public Double getKargoHandlingPersonel() {
		return kargoHandlingPersonel;
	}

	public void setKargoHandlingPersonel(Double kargoHandlingPersonel) {
		this.kargoHandlingPersonel = kargoHandlingPersonel;
	}

	public Double getStajyerVeEgitmenler() {
		return stajyerVeEgitmenler;
	}

	public void setStajyerVeEgitmenler(Double stajyerVeEgitmenler) {
		this.stajyerVeEgitmenler = stajyerVeEgitmenler;
	}

	public Double getIstatistikBirimPersonel() {
		return istatistikBirimPersonel;
	}

	public void setIstatistikBirimPersonel(Double istatistikBirimPersonel) {
		this.istatistikBirimPersonel = istatistikBirimPersonel;
	}

	public Double getDigerPersonel() {
		return digerPersonel;
	}

	public void setDigerPersonel(Double digerPersonel) {
		this.digerPersonel = digerPersonel;
	}

	public Double getYolcuHandlingPersonel() {
		return yolcuHandlingPersonel;
	}

	public void setYolcuHandlingPersonel(Double yolcuHandlingPersonel) {
		this.yolcuHandlingPersonel = yolcuHandlingPersonel;
	}
	

}

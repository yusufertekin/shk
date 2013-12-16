package com.deloitte.shk.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.deloitte.shk.generic.GenericEntity;
/**
 * @author yusufertekin
 *
 */
@Entity
public class UcakFilo extends GenericEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "ucakFiloSeq")
	@SequenceGenerator(name="ucakFiloSeq", sequenceName="UCAK_FILO_SEQ", allocationSize=1, initialValue=1)
	private Long ucakFiloId;
	
	@Column
	private Long adet;
	
	@Column
	private Long tip;
	
	@Temporal(TemporalType.DATE)
	@Column(updatable= false)
	private Date filoyaGirisTarih;
	
	@Temporal(TemporalType.DATE)
	@Column(updatable= false)
	private Date filodanCikisTarih;
	
	@Column
	private Long ucakLisansNo;
	
	@Column
	private String ucakTipiModeli;
	
	@Column
	private Long maxKapasite;
	
	@Column
	private String edinimYontemi;
	
	@Column
	private String filodanCikisSebep;
	

	public Long getUcakFiloId() {
		return ucakFiloId;
	}

	public void setUcakFiloId(Long ucakFiloId) {
		this.ucakFiloId = ucakFiloId;
	}

	public Long getAdet() {
		return adet;
	}

	public void setAdet(Long adet) {
		this.adet = adet;
	}

	public Date getFiloyaGirisTarih() {
		return filoyaGirisTarih;
	}

	public void setFiloyaGirisTarih(Date filoyaGirisTarih) {
		this.filoyaGirisTarih = filoyaGirisTarih;
	}

	public Date getFilodanCikisTarih() {
		return filodanCikisTarih;
	}

	public void setFilodanCikisTarih(Date filodanCikisTarih) {
		this.filodanCikisTarih = filodanCikisTarih;
	}

	public Long getUcakLisansNo() {
		return ucakLisansNo;
	}

	public void setUcakLisansNo(Long ucakLisansNo) {
		this.ucakLisansNo = ucakLisansNo;
	}

	public String getUcakTipiModeli() {
		return ucakTipiModeli;
	}

	public void setUcakTipiModeli(String ucakTipiModeli) {
		this.ucakTipiModeli = ucakTipiModeli;
	}

	public Long getMaxKapasite() {
		return maxKapasite;
	}

	public void setMaxKapasite(Long maxKapasite) {
		this.maxKapasite = maxKapasite;
	}

	public String getEdinimYontemi() {
		return edinimYontemi;
	}

	public void setEdinimYontemi(String edinimYontemi) {
		this.edinimYontemi = edinimYontemi;
	}

	public String getFilodanCikisSebep() {
		return filodanCikisSebep;
	}

	public void setFilodanCikisSebep(String filodanCikisSebep) {
		this.filodanCikisSebep = filodanCikisSebep;
	}

	@Override
	public Long entityId() {
		return getUcakFiloId();
	}

	@Override
	public void setEntityId(Long id) {
		setUcakFiloId(id);
	}

	public Long getTip() {
		return tip;
	}

	public void setTip(Long tip) {
		this.tip = tip;
	}

	
}

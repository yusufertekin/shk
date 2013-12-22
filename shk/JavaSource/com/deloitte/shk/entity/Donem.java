package com.deloitte.shk.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.deloitte.shk.generic.GenericEntity;
/**
 * @author yusufertekin
 *
 */
@Entity
public class Donem implements Serializable, Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "donemSeq")
	@SequenceGenerator(name="donemSeq", sequenceName="DONEM_SEQ", allocationSize=1, initialValue=1)
	private Long donemId;
	
	@Temporal(TemporalType.DATE)
	@Column(unique=true)
	private Date donem;
	
	@Column
	private Long durum;
	
	@Temporal(TemporalType.DATE)
	private Date kapanisTarih;
	
	@ManyToOne
	private Company company;

	public Long getDonemId() {
		return donemId;
	}

	public void setDonemId(Long donemId) {
		this.donemId = donemId;
	}


	public Long getDurum() {
		return durum;
	}

	public void setDurum(Long durum) {
		this.durum = durum;
	}

	public Date getDonem() {
		return donem;
	}

	public void setDonem(Date donem) {
		this.donem = donem;
	}
	@Override
	public Donem clone() throws CloneNotSupportedException{
		Donem ge = (Donem)super.clone();
    	return ge;
    }

	public Date getKapanisTarih() {
		return kapanisTarih;
	}

	public void setKapanisTarih(Date kapanisTarih) {
		this.kapanisTarih = kapanisTarih;
	}


	public Company getCompany() {
		return company;
	}


	public void setCompany(Company company) {
		this.company = company;
	}

}

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
public class IliskiliTarafIslem extends GenericEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "iliskiliTarafIslemSeq")
	@SequenceGenerator(name="iliskiliTarafIslemSeq", sequenceName="ILISKILI_TARAF_ISLEM_SEQ", allocationSize=1, initialValue=1)
	private Long iliskiliTarafIslemId;
	
	@Column
	private Long tip;
	
	@Column
	private String name;
	@Column
	private Double malHizmetAlim;
	@Column
	private Double malHizmetSatis;
	@Column
	private Double faizGelir;
	@Column
	private Double faizGider;
	@Column
	private Double kiraGelir;
	@Column
	private Double kiraGider;
	@Column
	private Double sabitKiymetSatis;
	@Column
	private Double komisyonGider;
	
	public Long getIliskiliTarafIslemId() {
		return iliskiliTarafIslemId;
	}

	public void setIliskiliTarafIslemId(Long iliskiliTarafIslemId) {
		this.iliskiliTarafIslemId = iliskiliTarafIslemId;
	}


	@Override
	public Long entityId() {
		return getIliskiliTarafIslemId();
	}

	@Override
	public void setEntityId(Long id) {
		setIliskiliTarafIslemId(id);
	}

	public Long getTip() {
		return tip;
	}

	public void setTip(Long tip) {
		this.tip = tip;
	}

	public Double getMalHizmetAlim() {
		return malHizmetAlim;
	}

	public void setMalHizmetAlim(Double malHizmetAlim) {
		this.malHizmetAlim = malHizmetAlim;
	}

	public Double getMalHizmetSatis() {
		return malHizmetSatis;
	}

	public void setMalHizmetSatis(Double malHizmetSatis) {
		this.malHizmetSatis = malHizmetSatis;
	}

	public Double getFaizGelir() {
		return faizGelir;
	}

	public void setFaizGelir(Double faizGelir) {
		this.faizGelir = faizGelir;
	}

	public Double getFaizGider() {
		return faizGider;
	}

	public void setFaizGider(Double faizGider) {
		this.faizGider = faizGider;
	}

	public Double getKiraGelir() {
		return kiraGelir;
	}

	public void setKiraGelir(Double kiraGelir) {
		this.kiraGelir = kiraGelir;
	}

	public Double getKiraGider() {
		return kiraGider;
	}

	public void setKiraGider(Double kiraGider) {
		this.kiraGider = kiraGider;
	}

	public Double getSabitKiymetSatis() {
		return sabitKiymetSatis;
	}

	public void setSabitKiymetSatis(Double sabitKiymetSatis) {
		this.sabitKiymetSatis = sabitKiymetSatis;
	}

	public Double getKomisyonGider() {
		return komisyonGider;
	}

	public void setKomisyonGider(Double komisyonGider) {
		this.komisyonGider = komisyonGider;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

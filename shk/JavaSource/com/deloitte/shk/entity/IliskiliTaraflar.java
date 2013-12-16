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
public class IliskiliTaraflar extends GenericEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "iliskiliTaraflarSeq")
	@SequenceGenerator(name="iliskiliTaraflarSeq", sequenceName="ILISKILI_TARAF_TO_SEQ", allocationSize=1, initialValue=1)
	private Long iliskiliTaraflarId;
	
	@Column
	private Long tip;
	
	@Column
	private String name;
	
	@Column
	private String aciklama;
	
	public Long getIliskiliTaraflarId() {
		return iliskiliTaraflarId;
	}

	public void setIliskiliTaraflarId(Long iliskiliTaraflarId) {
		this.iliskiliTaraflarId = iliskiliTaraflarId;
	}


	@Override
	public Long entityId() {
		return getIliskiliTaraflarId();
	}

	@Override
	public void setEntityId(Long id) {
		setIliskiliTaraflarId(id);
	}

	public Long getTip() {
		return tip;
	}

	public void setTip(Long tip) {
		this.tip = tip;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}

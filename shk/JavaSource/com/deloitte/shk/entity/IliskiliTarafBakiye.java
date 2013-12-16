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
public class IliskiliTarafBakiye extends GenericEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "iliskiliTarafBakiyeSeq")
	@SequenceGenerator(name="iliskiliTarafBakiyeSeq", sequenceName="ILISKILI_TARAF_BAKIYE_SEQ", allocationSize=1, initialValue=1)
	private Long iliskiliTarafBakiyeId;
	
	@Column
	private Long tip;
	
	@Column
	private String name;
	@Column
	private Double ticariKisaAlacak;
	@Column
	private Double ticariOlmayanKisaAlacak;
	@Column
	private Double ticariUzunAlacak;
	@Column
	private Double ticariOlmayanUzunAlacak;
	@Column
	private Double ticariKisaBorc;
	@Column
	private Double ticariOlmayanKisaBorc;
	@Column
	private Double ticariUzunBorc;
	@Column
	private Double ticariOlmayanUzunBorc;
	
	public Long getIliskiliTarafBakiyeId() {
		return iliskiliTarafBakiyeId;
	}

	public void setIliskiliTarafBakiyeId(Long iliskiliTarafBakiyeId) {
		this.iliskiliTarafBakiyeId = iliskiliTarafBakiyeId;
	}

	@Override
	public Long entityId() {
		return getIliskiliTarafBakiyeId();
	}

	@Override
	public void setEntityId(Long id) {
		setIliskiliTarafBakiyeId(id);
	}

	public Long getTip() {
		return tip;
	}

	public void setTip(Long tip) {
		this.tip = tip;
	}

	public Double getTicariKisaAlacak() {
		return ticariKisaAlacak;
	}

	public void setTicariKisaAlacak(Double ticariKisaAlacak) {
		this.ticariKisaAlacak = ticariKisaAlacak;
	}

	public Double getTicariOlmayanKisaAlacak() {
		return ticariOlmayanKisaAlacak;
	}

	public void setTicariOlmayanKisaAlacak(Double ticariOlmayanKisaAlacak) {
		this.ticariOlmayanKisaAlacak = ticariOlmayanKisaAlacak;
	}

	public Double getTicariUzunAlacak() {
		return ticariUzunAlacak;
	}

	public void setTicariUzunAlacak(Double ticariUzunAlacak) {
		this.ticariUzunAlacak = ticariUzunAlacak;
	}

	public Double getTicariOlmayanUzunAlacak() {
		return ticariOlmayanUzunAlacak;
	}

	public void setTicariOlmayanUzunAlacak(Double ticariOlmayanUzunAlacak) {
		this.ticariOlmayanUzunAlacak = ticariOlmayanUzunAlacak;
	}

	public Double getTicariKisaBorc() {
		return ticariKisaBorc;
	}

	public void setTicariKisaBorc(Double ticariKisaBorc) {
		this.ticariKisaBorc = ticariKisaBorc;
	}

	public Double getTicariOlmayanKisaBorc() {
		return ticariOlmayanKisaBorc;
	}

	public void setTicariOlmayanKisaBorc(Double ticariOlmayanKisaBorc) {
		this.ticariOlmayanKisaBorc = ticariOlmayanKisaBorc;
	}

	public Double getTicariUzunBorc() {
		return ticariUzunBorc;
	}

	public void setTicariUzunBorc(Double ticariUzunBorc) {
		this.ticariUzunBorc = ticariUzunBorc;
	}

	public Double getTicariOlmayanUzunBorc() {
		return ticariOlmayanUzunBorc;
	}

	public void setTicariOlmayanUzunBorc(Double ticariOlmayanUzunBorc) {
		this.ticariOlmayanUzunBorc = ticariOlmayanUzunBorc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

		
}

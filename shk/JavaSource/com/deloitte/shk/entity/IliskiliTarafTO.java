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
public class IliskiliTarafTO extends GenericEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "iliskiliTarafTOSeq")
	@SequenceGenerator(name="iliskiliTarafTOSeq", sequenceName="ILISKILI_TARAF_TO_SEQ", allocationSize=1, initialValue=1)
	private Long iliskiliTarafTOId;
	
	@Column
	private String name;
	@Column
	private Long tip;
	
	@Column
	private String orjinalParaBirimi;
	
	@Column
	private Double vade;
	@Column
	private Double faizOrani;
	@Column
	private Double kisaVadeliAlacak;
	@Column
	private Double uzunVadeliAlacak;
	
	public Long getIliskiliTarafTOId() {
		return iliskiliTarafTOId;
	}

	public void setIliskiliTarafTOId(Long iliskiliTarafTOId) {
		this.iliskiliTarafTOId = iliskiliTarafTOId;
	}

	@Override
	public Long entityId() {
		return getIliskiliTarafTOId();
	}

	@Override
	public void setEntityId(Long id) {
		setIliskiliTarafTOId(id);
	}

	public Long getTip() {
		return tip;
	}

	public void setTip(Long tip) {
		this.tip = tip;
	}

	public String getOrjinalParaBirimi() {
		return orjinalParaBirimi;
	}

	public void setOrjinalParaBirimi(String orjinalParaBirimi) {
		this.orjinalParaBirimi = orjinalParaBirimi;
	}

	public Double getVade() {
		return vade;
	}

	public void setVade(Double vade) {
		this.vade = vade;
	}

	public Double getFaizOrani() {
		return faizOrani;
	}

	public void setFaizOrani(Double faizOrani) {
		this.faizOrani = faizOrani;
	}

	public Double getKisaVadeliAlacak() {
		return kisaVadeliAlacak;
	}

	public void setKisaVadeliAlacak(Double kisaVadeliAlacak) {
		this.kisaVadeliAlacak = kisaVadeliAlacak;
	}

	public Double getUzunVadeliAlacak() {
		return uzunVadeliAlacak;
	}

	public void setUzunVadeliAlacak(Double uzunVadeliAlacak) {
		this.uzunVadeliAlacak = uzunVadeliAlacak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

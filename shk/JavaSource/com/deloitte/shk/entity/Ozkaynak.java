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
public class Ozkaynak extends GenericEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "ozkaynakSeq")
	@SequenceGenerator(name="ozkaynakSeq", sequenceName="OZKAYNAK_SEQ", allocationSize=1, initialValue=1)
	private Long ozkaynakId;
	
	@Column
	private Long columnNumber;
	
	@Column
	private Double ilkBakiye;
	@Column
	private Double donemKarZarar;
	@Column
	private Double digerKapsamliGelir;
	@Column
	private Double toplamKapsamliGelirGider;
	@Column
	private Double sermayeArtisi;
	@Column
	private Double odenenTemettuler;
	@Column
	private Double bagliOrtaklikAlimiKaynakli;
	@Column
	private Double kismiBagliOrtaklikSatis;
	@Column
	private Double transfer;
	@Column
	private Double diger;
	

	public Long getOzkaynakId() {
		return ozkaynakId;
	}

	public void setOzkaynakId(Long ozkaynakId) {
		this.ozkaynakId = ozkaynakId;
	}

	@Override
	public Long entityId() {
		// TODO Auto-generated method stub
		return getOzkaynakId();
	}

	@Override
	public void setEntityId(Long id) {
		setOzkaynakId(id);
	}

	public Long getColumnNumber() {
		return columnNumber;
	}

	public void setColumnNumber(Long columnNumber) {
		this.columnNumber = columnNumber;
	}

	public Double getDonemKarZarar() {
		return donemKarZarar;
	}

	public void setDonemKarZarar(Double donemKarZarar) {
		this.donemKarZarar = donemKarZarar;
	}

	public Double getDigerKapsamliGelir() {
		return digerKapsamliGelir;
	}

	public void setDigerKapsamliGelir(Double digerKapsamliGelir) {
		this.digerKapsamliGelir = digerKapsamliGelir;
	}

	public Double getToplamKapsamliGelirGider() {
		return toplamKapsamliGelirGider;
	}

	public void setToplamKapsamliGelirGider(Double toplamKapsamliGelirGider) {
		this.toplamKapsamliGelirGider = toplamKapsamliGelirGider;
	}

	public Double getSermayeArtisi() {
		return sermayeArtisi;
	}

	public void setSermayeArtisi(Double sermayeArtisi) {
		this.sermayeArtisi = sermayeArtisi;
	}

	public Double getOdenenTemettuler() {
		return odenenTemettuler;
	}

	public void setOdenenTemettuler(Double odenenTemettuler) {
		this.odenenTemettuler = odenenTemettuler;
	}

	public Double getBagliOrtaklikAlimiKaynakli() {
		return bagliOrtaklikAlimiKaynakli;
	}

	public void setBagliOrtaklikAlimiKaynakli(Double bagliOrtaklikAlimiKaynakli) {
		this.bagliOrtaklikAlimiKaynakli = bagliOrtaklikAlimiKaynakli;
	}

	public Double getKismiBagliOrtaklikSatis() {
		return kismiBagliOrtaklikSatis;
	}

	public void setKismiBagliOrtaklikSatis(Double kismiBagliOrtaklikSatis) {
		this.kismiBagliOrtaklikSatis = kismiBagliOrtaklikSatis;
	}

	public Double getTransfer() {
		return transfer;
	}

	public void setTransfer(Double transfer) {
		this.transfer = transfer;
	}

	public Double getDiger() {
		return diger;
	}

	public void setDiger(Double diger) {
		this.diger = diger;
	}

	public Double getIlkBakiye() {
		return ilkBakiye;
	}

	public void setIlkBakiye(Double ilkBakiye) {
		this.ilkBakiye = ilkBakiye;
	}
	

}

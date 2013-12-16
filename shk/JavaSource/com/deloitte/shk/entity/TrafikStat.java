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
public class TrafikStat extends GenericEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "trafikStatSeq")
	@SequenceGenerator(name="trafikStatSeq", sequenceName="TRAFIK_STAT_SEQ", allocationSize=1, initialValue=1)
	private Long trafikStatId;
	
	@Column
	private Double arzKoltuk;
	@Column
	private Double ucretliYolcu;
	@Column
	private Double ucretliYolcuKm;
	@Column
	private Double arzKoltukKm;
	@Column
	private Double uculanKm;
	@Column
	private Double ortalamaMenzil;
	@Column
	private Double ucusSaati;
	@Column
	private Double blokSaati;
	@Column
	private Double konmaSayisi;
	@Column
	private Double hasilatYaratanUcuslar;
	@Column
	private Double disHatYolcuSayisi;
	@Column
	private Double transferYolcuSayisi;
	@Column
	private Double transferYolcuSayisiYuzde;
	@Column
	private Double hizmetteUcakSayiDonemSon;
	@Column
	private Double hizmetteUcakSayiDonemOrt;
	@Column
	private Double ucakUtilizasyonu;
	@Column
	private Double arzTon;
	@Column	
	private Double ucretliTon;
	@Column
	private Double arzKargoTonKm;
	@Column
	private Double ucretliKargoTonKm;
	@Column
	private Double hizmetteUcakSayiDonemSonKar;
	@Column
	private Double hizmetteUcakSayiDonemOrtKar;
	@Column
	private Double konmaSayisiKar;
	@Column
	private Double arzTonKar;
	@Column
	private Double ucretliTonKar;
	@Column
	private Double arzKargoTonKmKar;
	@Column
	private Double ucretliKargoTonKmKar;
	@Column
	private Double ortalamaMenzilKar;
	@Column
	private Double blokSaatKar;
	@Column
	private Double kargoUcakUtilizasyonuKar;
	
	

	public Long getTrafikStatId() {
		return trafikStatId;
	}

	public void setTrafikStatId(Long trafikStatId) {
		this.trafikStatId = trafikStatId;
	}

	@Override
	public Long entityId() {
		// TODO Auto-generated method stub
		return getTrafikStatId();
	}

	@Override
	public void setEntityId(Long id) {
		setTrafikStatId(id);
	}


	public Double getArzKoltuk() {
		return arzKoltuk;
	}

	public void setArzKoltuk(Double arzKoltuk) {
		this.arzKoltuk = arzKoltuk;
	}

	public Double getUcretliYolcu() {
		return ucretliYolcu;
	}

	public void setUcretliYolcu(Double ucretliYolcu) {
		this.ucretliYolcu = ucretliYolcu;
	}

	public Double getUcretliYolcuKm() {
		return ucretliYolcuKm;
	}

	public void setUcretliYolcuKm(Double ucretliYolcuKm) {
		this.ucretliYolcuKm = ucretliYolcuKm;
	}

	public Double getArzKoltukKm() {
		return arzKoltukKm;
	}

	public void setArzKoltukKm(Double arzKoltukKm) {
		this.arzKoltukKm = arzKoltukKm;
	}

	public Double getUculanKm() {
		return uculanKm;
	}

	public void setUculanKm(Double uculanKm) {
		this.uculanKm = uculanKm;
	}

	public Double getOrtalamaMenzil() {
		return ortalamaMenzil;
	}

	public void setOrtalamaMenzil(Double ortalamaMenzil) {
		this.ortalamaMenzil = ortalamaMenzil;
	}

	public Double getUcusSaati() {
		return ucusSaati;
	}

	public void setUcusSaati(Double ucusSaati) {
		this.ucusSaati = ucusSaati;
	}

	public Double getBlokSaati() {
		return blokSaati;
	}

	public void setBlokSaati(Double blokSaati) {
		this.blokSaati = blokSaati;
	}

	public Double getKonmaSayisi() {
		return konmaSayisi;
	}

	public void setKonmaSayisi(Double konmaSayisi) {
		this.konmaSayisi = konmaSayisi;
	}

	public Double getHasilatYaratanUcuslar() {
		return hasilatYaratanUcuslar;
	}

	public void setHasilatYaratanUcuslar(Double hasilatYaratanUcuslar) {
		this.hasilatYaratanUcuslar = hasilatYaratanUcuslar;
	}

	public Double getDisHatYolcuSayisi() {
		return disHatYolcuSayisi;
	}

	public void setDisHatYolcuSayisi(Double disHatYolcuSayisi) {
		this.disHatYolcuSayisi = disHatYolcuSayisi;
	}

	public Double getTransferYolcuSayisi() {
		return transferYolcuSayisi;
	}

	public void setTransferYolcuSayisi(Double transferYolcuSayisi) {
		this.transferYolcuSayisi = transferYolcuSayisi;
	}

	public Double getHizmetteUcakSayiDonemSon() {
		return hizmetteUcakSayiDonemSon;
	}

	public void setHizmetteUcakSayiDonemSon(Double hizmetteUcakSayiDonemSon) {
		this.hizmetteUcakSayiDonemSon = hizmetteUcakSayiDonemSon;
	}

	public Double getHizmetteUcakSayiDonemOrt() {
		return hizmetteUcakSayiDonemOrt;
	}

	public void setHizmetteUcakSayiDonemOrt(Double hizmetteUcakSayiDonemOrt) {
		this.hizmetteUcakSayiDonemOrt = hizmetteUcakSayiDonemOrt;
	}

	public Double getUcakUtilizasyonu() {
		return ucakUtilizasyonu;
	}

	public void setUcakUtilizasyonu(Double ucakUtilizasyonu) {
		this.ucakUtilizasyonu = ucakUtilizasyonu;
	}

	public Double getArzTon() {
		return arzTon;
	}

	public void setArzTon(Double arzTon) {
		this.arzTon = arzTon;
	}

	public Double getUcretliTon() {
		return ucretliTon;
	}

	public void setUcretliTon(Double ucretliTon) {
		this.ucretliTon = ucretliTon;
	}

	public Double getArzKargoTonKm() {
		return arzKargoTonKm;
	}

	public void setArzKargoTonKm(Double arzKargoTonKm) {
		this.arzKargoTonKm = arzKargoTonKm;
	}

	public Double getUcretliKargoTonKm() {
		return ucretliKargoTonKm;
	}

	public void setUcretliKargoTonKm(Double ucretliKargoTonKm) {
		this.ucretliKargoTonKm = ucretliKargoTonKm;
	}

	public Double getHizmetteUcakSayiDonemSonKar() {
		return hizmetteUcakSayiDonemSonKar;
	}

	public void setHizmetteUcakSayiDonemSonKar(Double hizmetteUcakSayiDonemSonKar) {
		this.hizmetteUcakSayiDonemSonKar = hizmetteUcakSayiDonemSonKar;
	}

	public Double getHizmetteUcakSayiDonemOrtKar() {
		return hizmetteUcakSayiDonemOrtKar;
	}

	public void setHizmetteUcakSayiDonemOrtKar(Double hizmetteUcakSayiDonemOrtKar) {
		this.hizmetteUcakSayiDonemOrtKar = hizmetteUcakSayiDonemOrtKar;
	}

	public Double getKonmaSayisiKar() {
		return konmaSayisiKar;
	}

	public void setKonmaSayisiKar(Double konmaSayisiKar) {
		this.konmaSayisiKar = konmaSayisiKar;
	}

	public Double getArzTonKar() {
		return arzTonKar;
	}

	public void setArzTonKar(Double arzTonKar) {
		this.arzTonKar = arzTonKar;
	}

	public Double getUcretliTonKar() {
		return ucretliTonKar;
	}

	public void setUcretliTonKar(Double ucretliTonKar) {
		this.ucretliTonKar = ucretliTonKar;
	}

	public Double getArzKargoTonKmKar() {
		return arzKargoTonKmKar;
	}

	public void setArzKargoTonKmKar(Double arzKargoTonKmKar) {
		this.arzKargoTonKmKar = arzKargoTonKmKar;
	}

	public Double getUcretliKargoTonKmKar() {
		return ucretliKargoTonKmKar;
	}

	public void setUcretliKargoTonKmKar(Double ucretliKargoTonKmKar) {
		this.ucretliKargoTonKmKar = ucretliKargoTonKmKar;
	}

	public Double getOrtalamaMenzilKar() {
		return ortalamaMenzilKar;
	}

	public void setOrtalamaMenzilKar(Double ortalamaMenzilKar) {
		this.ortalamaMenzilKar = ortalamaMenzilKar;
	}

	public Double getBlokSaatKar() {
		return blokSaatKar;
	}

	public void setBlokSaatKar(Double blokSaatKar) {
		this.blokSaatKar = blokSaatKar;
	}

	public Double getKargoUcakUtilizasyonuKar() {
		return kargoUcakUtilizasyonuKar;
	}

	public void setKargoUcakUtilizasyonuKar(Double kargoUcakUtilizasyonuKar) {
		this.kargoUcakUtilizasyonuKar = kargoUcakUtilizasyonuKar;
	}

	public Double getTransferYolcuSayisiYuzde() {
		return transferYolcuSayisiYuzde;
	}

	public void setTransferYolcuSayisiYuzde(Double transferYolcuSayisiYuzde) {
		this.transferYolcuSayisiYuzde = transferYolcuSayisiYuzde;
	}
	

}

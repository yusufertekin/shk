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
public class Karne {

	private Double cariOran;
	private Double likiditeOran;
	private Double nakitOran;
	private Double alacakTahsilSure;
	private Double varlikDevirHizSure;
	private Double ticariBorcOdeme;
	private Double toplamBorcOzkaynak;
	private Double uzunVadeliBorcToplam;
	private Double toplamBorcVarlik;
	private Double finansmanGiderKarsilama;
	private Double borcServisKarsilama;
	
	
	
	public Karne(Double cariOran,
			Double likiditeOran, Double nakitOran, Double alacakTahsilSure,
			Double varlikDevirHizSure, Double ticariBorcOdeme,
			Double toplamBorcOzkaynak, Double uzunVadeliBorcToplam,
			Double toplamBorcVarlik, Double finansmanGiderKarsilama,
			Double borcServisKarsilama) {
		super();
		this.cariOran = cariOran;
		this.likiditeOran = likiditeOran;
		this.nakitOran = nakitOran;
		this.alacakTahsilSure = alacakTahsilSure;
		this.varlikDevirHizSure = varlikDevirHizSure;
		this.ticariBorcOdeme = ticariBorcOdeme;
		this.toplamBorcOzkaynak = toplamBorcOzkaynak;
		this.uzunVadeliBorcToplam = uzunVadeliBorcToplam;
		this.toplamBorcVarlik = toplamBorcVarlik;
		this.finansmanGiderKarsilama = finansmanGiderKarsilama;
		this.borcServisKarsilama = borcServisKarsilama;
	}
	
	public Karne() {
		super();
		this.cariOran = new Double(0);
		this.likiditeOran = new Double(0);
		this.nakitOran = new Double(0);
		this.alacakTahsilSure = new Double(0);
		this.varlikDevirHizSure = new Double(0);
		this.ticariBorcOdeme = new Double(0);
		this.toplamBorcOzkaynak = new Double(0);
		this.uzunVadeliBorcToplam = new Double(0);
		this.toplamBorcVarlik = new Double(0);
		this.finansmanGiderKarsilama = new Double(0);
		this.borcServisKarsilama = new Double(0);
	}
	
	public Double getCariOran() {
		return cariOran;
	}
	public void setCariOran(Double cariOran) {
		this.cariOran = cariOran;
	}
	public Double getLikiditeOran() {
		return likiditeOran;
	}
	public void setLikiditeOran(Double likiditeOran) {
		this.likiditeOran = likiditeOran;
	}
	public Double getNakitOran() {
		return nakitOran;
	}
	public void setNakitOran(Double nakitOran) {
		this.nakitOran = nakitOran;
	}
	public Double getAlacakTahsilSure() {
		return alacakTahsilSure;
	}
	public void setAlacakTahsilSure(Double alacakTahsilSure) {
		this.alacakTahsilSure = alacakTahsilSure;
	}
	public Double getVarlikDevirHizSure() {
		return varlikDevirHizSure;
	}
	public void setVarlikDevirHizSure(Double varlikDevirHizSure) {
		this.varlikDevirHizSure = varlikDevirHizSure;
	}
	public Double getTicariBorcOdeme() {
		return ticariBorcOdeme;
	}
	public void setTicariBorcOdeme(Double ticariBorcOdeme) {
		this.ticariBorcOdeme = ticariBorcOdeme;
	}
	public Double getToplamBorcOzkaynak() {
		return toplamBorcOzkaynak;
	}
	public void setToplamBorcOzkaynak(Double toplamBorcOzkaynak) {
		this.toplamBorcOzkaynak = toplamBorcOzkaynak;
	}
	public Double getUzunVadeliBorcToplam() {
		return uzunVadeliBorcToplam;
	}
	public void setUzunVadeliBorcToplam(Double uzunVadeliBorcToplam) {
		this.uzunVadeliBorcToplam = uzunVadeliBorcToplam;
	}
	public Double getToplamBorcVarlik() {
		return toplamBorcVarlik;
	}
	public void setToplamBorcVarlik(Double toplamBorcVarlik) {
		this.toplamBorcVarlik = toplamBorcVarlik;
	}
	public Double getFinansmanGiderKarsilama() {
		return finansmanGiderKarsilama;
	}
	public void setFinansmanGiderKarsilama(Double finansmanGiderKarsilama) {
		this.finansmanGiderKarsilama = finansmanGiderKarsilama;
	}
	public Double getBorcServisKarsilama() {
		return borcServisKarsilama;
	}
	public void setBorcServisKarsilama(Double borcServisKarsilama) {
		this.borcServisKarsilama = borcServisKarsilama;
	}

}

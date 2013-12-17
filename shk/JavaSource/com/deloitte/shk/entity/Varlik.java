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
public class Varlik extends GenericEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "varlikSeq")
	@SequenceGenerator(name="varlikSeq", sequenceName="VARLIK_SEQ", allocationSize=1, initialValue=1)
	private Long varlikId;
	
	@Column
	private Double nakit;
	@Column
	private Double finansalYatirim;
	@Column
	private Double ticariAlacak;
	@Column
	private Double supheliAlacakKarsilik;
	@Column
	private Double teknikMalzemeStok;
	@Column
	private Double ucakAlimOnOdeme;
	@Column
	private Double turevFinansalAraclar;
	@Column
	private Double iliskiliTaraflardanAlacaklar;
	@Column
	private Double digerAlacak;
	@Column
	private Double satisAmaciylaeldeTutulanVarlik;
	@Column
	private Double ozkaynakDegerlenenYatirim;
	@Column
	private Double uzunVadeliFinansalYatirim;
	@Column
	private Double ucaklarMotorlar;
	@Column
	private Double digerUcusEkipman;
	@Column
	private Double yerEkipman;
	@Column
	private Double birikmisAmortisman;
	@Column	
	private Double arsaArazi;
	@Column
	private Double ucakAlimOnOdemeDuranVarlik;
	@Column
	private Double yapilmaktaOlanYatirim;
	@Column
	private Double serefiye;
	@Column
	private Double slotHakki;
	@Column
	private Double digerMaddiOlmayanDuranVarlik;
	@Column
	private Double birikmisAmortismanMaddiOlmayan;
	@Column
	private Double yatirimAmacliGayrimenkuller;
	@Column
	private Double uzunVadeliDigerAlacaklar;
	@Column
	private Double iliskiliTaraflarAlacaklarDiger;
	@Column
	private Double ertelenmisVergiVarliklar;
	@Column
	private Double digerDuranVarliklar;
	@Column
	private Double turevFinansalAraclarDiger;
	
	

	public Long getVarlikId() {
		return varlikId;
	}

	public void setVarlikId(Long varlikId) {
		this.varlikId = varlikId;
	}

	public Double getNakit() {
		return nakit;
	}

	public void setNakit(Double nakit) {
		this.nakit = nakit;
	}

	public Double getFinansalYatirim() {
		return finansalYatirim;
	}

	public void setFinansalYatirim(Double finansalYatirim) {
		this.finansalYatirim = finansalYatirim;
	}

	public Double getTicariAlacak() {
		return ticariAlacak;
	}

	public void setTicariAlacak(Double ticariAlacak) {
		this.ticariAlacak = ticariAlacak;
	}

	public Double getSupheliAlacakKarsilik() {
		return supheliAlacakKarsilik;
	}

	public void setSupheliAlacakKarsilik(Double supheliAlacakKarsilik) {
		this.supheliAlacakKarsilik = supheliAlacakKarsilik;
	}

	public Double getTeknikMalzemeStok() {
		return teknikMalzemeStok;
	}

	public void setTeknikMalzemeStok(Double teknikMalzemeStok) {
		this.teknikMalzemeStok = teknikMalzemeStok;
	}

	public Double getUcakAlimOnOdeme() {
		return ucakAlimOnOdeme;
	}

	public void setUcakAlimOnOdeme(Double ucakAlimOnOdeme) {
		this.ucakAlimOnOdeme = ucakAlimOnOdeme;
	}


	public Double getDigerAlacak() {
		return digerAlacak;
	}

	public void setDigerAlacak(Double digerAlacak) {
		this.digerAlacak = digerAlacak;
	}

	public Double getSatisAmaciylaeldeTutulanVarlik() {
		return satisAmaciylaeldeTutulanVarlik;
	}

	public void setSatisAmaciylaeldeTutulanVarlik(
			Double satisAmaciylaeldeTutulanVarlik) {
		this.satisAmaciylaeldeTutulanVarlik = satisAmaciylaeldeTutulanVarlik;
	}

	public Double getOzkaynakDegerlenenYatirim() {
		return ozkaynakDegerlenenYatirim;
	}

	public void setOzkaynakDegerlenenYatirim(Double ozkaynakDegerlenenYatirim) {
		this.ozkaynakDegerlenenYatirim = ozkaynakDegerlenenYatirim;
	}

	public Double getUzunVadeliFinansalYatirim() {
		return uzunVadeliFinansalYatirim;
	}

	public void setUzunVadeliFinansalYatirim(Double uzunVadeliFinansalYatirim) {
		this.uzunVadeliFinansalYatirim = uzunVadeliFinansalYatirim;
	}

	public Double getUcaklarMotorlar() {
		return ucaklarMotorlar;
	}

	public void setUcaklarMotorlar(Double ucaklarMotorlar) {
		this.ucaklarMotorlar = ucaklarMotorlar;
	}

	public Double getDigerUcusEkipman() {
		return digerUcusEkipman;
	}

	public void setDigerUcusEkipman(Double digerUcusEkipman) {
		this.digerUcusEkipman = digerUcusEkipman;
	}

	public Double getYerEkipman() {
		return yerEkipman;
	}

	public void setYerEkipman(Double yerEkipman) {
		this.yerEkipman = yerEkipman;
	}

	public Double getBirikmisAmortisman() {
		return birikmisAmortisman;
	}

	public void setBirikmisAmortisman(Double birikmisAmortisman) {
		this.birikmisAmortisman = birikmisAmortisman;
	}

	public Double getArsaArazi() {
		return arsaArazi;
	}

	public void setArsaArazi(Double arsaArazi) {
		this.arsaArazi = arsaArazi;
	}

	public Double getUcakAlimOnOdemeDuranVarlik() {
		return ucakAlimOnOdemeDuranVarlik;
	}

	public void setUcakAlimOnOdemeDuranVarlik(Double ucakAlimOnOdemeDuranVarlik) {
		this.ucakAlimOnOdemeDuranVarlik = ucakAlimOnOdemeDuranVarlik;
	}

	public Double getYapilmaktaOlanYatirim() {
		return yapilmaktaOlanYatirim;
	}

	public void setYapilmaktaOlanYatirim(Double yapilmaktaOlanYatirim) {
		this.yapilmaktaOlanYatirim = yapilmaktaOlanYatirim;
	}

	public Double getSerefiye() {
		return serefiye;
	}

	public void setSerefiye(Double serefiye) {
		this.serefiye = serefiye;
	}

	public Double getSlotHakki() {
		return slotHakki;
	}

	public void setSlotHakki(Double slotHakki) {
		this.slotHakki = slotHakki;
	}

	public Double getBirikmisAmortismanMaddiOlmayan() {
		return birikmisAmortismanMaddiOlmayan;
	}

	public void setBirikmisAmortismanMaddiOlmayan(
			Double birikmisAmortismanMaddiOlmayan) {
		this.birikmisAmortismanMaddiOlmayan = birikmisAmortismanMaddiOlmayan;
	}

	public Double getUzunVadeliDigerAlacaklar() {
		return uzunVadeliDigerAlacaklar;
	}

	public void setUzunVadeliDigerAlacaklar(Double uzunVadeliDigerAlacaklar) {
		this.uzunVadeliDigerAlacaklar = uzunVadeliDigerAlacaklar;
	}

	public Double getIliskiliTaraflardanAlacaklar() {
		return iliskiliTaraflardanAlacaklar;
	}

	public void setIliskiliTaraflardanAlacaklar(Double iliskiliTaraflardanAlacaklar) {
		this.iliskiliTaraflardanAlacaklar = iliskiliTaraflardanAlacaklar;
	}

	public Double getErtelenmisVergiVarliklar() {
		return ertelenmisVergiVarliklar;
	}

	public void setErtelenmisVergiVarliklar(Double ertelenmisVergiVarliklar) {
		this.ertelenmisVergiVarliklar = ertelenmisVergiVarliklar;
	}

	public Double getDigerDuranVarliklar() {
		return digerDuranVarliklar;
	}

	public void setDigerDuranVarliklar(Double digerDuranVarliklar) {
		this.digerDuranVarliklar = digerDuranVarliklar;
	}

	public Double getTurevFinansalAraclar() {
		return turevFinansalAraclar;
	}

	public void setTurevFinansalAraclar(Double turevFinansalAraclar) {
		this.turevFinansalAraclar = turevFinansalAraclar;
	}

	@Override
	public Long entityId() {
		// TODO Auto-generated method stub
		return getVarlikId();
	}

	@Override
	public void setEntityId(Long id) {
		setVarlikId(id);
	}


	public Double getYatirimAmacliGayrimenkuller() {
		return yatirimAmacliGayrimenkuller;
	}

	public void setYatirimAmacliGayrimenkuller(
			Double yatirimAmacliGayrimenkuller) {
		this.yatirimAmacliGayrimenkuller = yatirimAmacliGayrimenkuller;
	}

	public Double getTurevFinansalAraclarDiger() {
		return turevFinansalAraclarDiger;
	}

	public void setTurevFinansalAraclarDiger(Double turevFinansalAraclarDiger) {
		this.turevFinansalAraclarDiger = turevFinansalAraclarDiger;
	}


	public Double getDigerMaddiOlmayanDuranVarlik() {
		return digerMaddiOlmayanDuranVarlik;
	}

	public void setDigerMaddiOlmayanDuranVarlik(
			Double digerMaddiOlmayanDuranVarlik) {
		this.digerMaddiOlmayanDuranVarlik = digerMaddiOlmayanDuranVarlik;
	}

	public Double getIliskiliTaraflarAlacaklarDiger() {
		return iliskiliTaraflarAlacaklarDiger;
	}

	public void setIliskiliTaraflarAlacaklarDiger(
			Double iliskiliTaraflarAlacaklarDiger) {
		this.iliskiliTaraflarAlacaklarDiger = iliskiliTaraflarAlacaklarDiger;
	}
	
	public Double getToplamDonenVarliklar(){
		return getNakit() + this.getFinansalYatirim() + this.getTicariAlacak() + this.getSupheliAlacakKarsilik() + this.getTeknikMalzemeStok() + this.getUcakAlimOnOdeme() + this.getTurevFinansalAraclar() + this.getIliskiliTaraflardanAlacaklar() + this.getDigerAlacak() + this.getSatisAmaciylaeldeTutulanVarlik();
	}

	public Double getLikiditeOranPay(){
		return getNakit() + this.getFinansalYatirim() + this.getTicariAlacak() + this.getIliskiliTaraflardanAlacaklar() + this.getDigerAlacak();
	}

	public Double getNakitOranPay(){
		return getNakit() + this.getFinansalYatirim();
	}

}

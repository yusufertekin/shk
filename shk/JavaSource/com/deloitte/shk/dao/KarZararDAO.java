package com.deloitte.shk.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.KarZarar;
import com.deloitte.shk.generic.GenericDAO;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class KarZararDAO extends GenericDAO<KarZarar,Long> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private final String HQL_FIND_DONEM_NET_KAR_ZARAR = "select t.anaOrtaklikNetKar from KarZarar t where t.donem = :donem "
			+ " and t.company = :company";
	
	private final String HQL_FIND_DONEM_KARNE_SO = "select t.anaOrtaklikNetKar, t.finansalKiralamaFaizGider,  t.finansalGider, " +
			" t.netKarZarar - (t.vergiGiderGelir + t.ertelenmisVergiGiderGelir + t.ozkaynakYontemiyleKarZarar" +
			" + t.finansalKiralamaFaizGider + t.finansalGelir + t.finansalGider" +
			" + t.kurFarkiKarZarar + t.turevFinansalAracKarZarar + t.yerEkipmanAmortismanGider " +
			" + t.yerEkipmanDegerDusukGider " +
			" + t.ucusEkipmanAmortismanGider + t.ucusEkipmanDegerDusukGider + t.ucusEkipmanBakimGider + t.aktiflesenBakimGider) ebitda, " +
			" (t.disHatHasilat + t.icHatHasilat + t.kargoUcaklariKargoGelir + t.bellyKargoGelir +t.yurticiCharter + t.yurtdisiCharter + t.wetleaseGelir + t.digerGelirlerHasilat) toplamHasilat, " +
			" (t.vergiGiderGelir + t.ertelenmisVergiGiderGelir + t.turevFinansalAracKarZarar + t.kurFarkiKarZarar + t.finansalGider + t.finansalGelir + t.finansalKiralamaFaizGider + t.ozkaynakYontemiyleKarZarar + t.digerGelirler + t.digerGiderler + t.supheliAlacakKarsilikGider + t.sabitKiymetSatisKarZarar + t.yerEkipmanAmortismanGider + t.yerEkipmanDegerDusukGider + t.ucusIsletmeGider + t.digerGenelIdariGider + t.yolcuKomisyon + t.kargoKomisyon + t.reklamGider + t.personelGider + t.digerSatisReklamGider + t.ucusEkipmanAmortismanGider + t.ucusEkipmanDegerDusukGider + t.ucusEkipmanBakimGider + t.aktiflesenBakimGider + t.ucusEkipmanKiraGider + t.ucakKiraGider + t.koltukKiraGider + t.ucusEkipmanSigortaGider + t.maliMesuliyetSigortaGider + t.kokpitEkipGider + t.kabinEkipGider + t.kokpitEkipEgitimGider + t.havaalaniVergiGuvenlik + t.konmaYerIstasyonGider + t.akaryakitGider + t.ustgecisGider + t.ikramGider + t.disHatHasilat + t.icHatHasilat + t.kargoUcaklariKargoGelir + t.bellyKargoGelir +t.yurticiCharter + t.yurtdisiCharter + t.wetleaseGelir + t.digerGelirlerHasilat) netKarZarar, " +
			" (t.yerEkipmanAmortismanGider + t.yerEkipmanDegerDusukGider + t.ucusIsletmeGider + t.digerGenelIdariGider + t.yolcuKomisyon + t.kargoKomisyon + t.reklamGider + t.personelGider + t.digerSatisReklamGider + t.ucusEkipmanAmortismanGider + t.ucusEkipmanDegerDusukGider + t.ucusEkipmanBakimGider + t.aktiflesenBakimGider + t.ucusEkipmanKiraGider + t.ucakKiraGider + t.koltukKiraGider + t.ucusEkipmanSigortaGider + t.maliMesuliyetSigortaGider + t.kokpitEkipGider + t.kabinEkipGider + t.kokpitEkipEgitimGider + t.havaalaniVergiGuvenlik + t.konmaYerIstasyonGider + t.akaryakitGider + t.ustgecisGider + t.ikramGider) toplamFaaliyetGiderleri " +
			" from KarZarar t where t.donem = :donem  ";
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public Double findDonemNetKarZarar(Donem donem, Company company)
	{
		List list = em.createQuery(HQL_FIND_DONEM_NET_KAR_ZARAR)
				.setParameter("donem", donem)
				.setParameter("company", company)
				.getResultList();
		if(list != null && list.size() > 0)
		{
			return (Double)list.get(0);
		}
		else
		{
			return null;
		}
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public Double findKarneSektorOrt(Donem donem)
	{
		List list = em.createQuery(HQL_FIND_DONEM_KARNE_SO)
				.setParameter("donem", donem)
				.getResultList();
		if(list != null && list.size() > 0)
		{
			return (Double)list.get(0);
		}
		else
		{
			return null;
		}
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public KarZarar findByDonemAndCompany(Donem donem, Company company) {
		// TODO Auto-generated method stub
		return super.findByDonemAndCompany(donem, company);
	}
}

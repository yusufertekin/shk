package com.deloitte.shk.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.Kaynak;
import com.deloitte.shk.generic.GenericDAO;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class KaynakDAO extends GenericDAO<Kaynak,Long> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private final String HQL_FIND_DONEM_KARNE_SO = "select t.finansalBorclar, t.uzunVadeliKrediKisaKisim, t.finansalKiralama, t.ticariBorc," +
			" (t.finansalBorclar + t.uzunVadeliKrediKisaKisim + t.finansalKiralama + t.ticariBorc + t.donemKariVergi + t.yolcuUcusYukumluluk +t.faaliyetTipiKiralananUcakBG + t.odenecekPersonelUcreti + t.calisanlaraSaglananDigerF + t.odenecekVergiFonlar + t.turevFinansalAraclar + t.iliskiliTaraflaraBorclar + t.borcKarsiliklari + t.digerKisaVadeliYukumluluk) toplamKisaVadeliYukumlulukler, " +
			" (t.finansalBorcUzun + t.finansalKiralamaUzun + t.ticariBorcUzun + t.iliskiliTaraflaraBorclarUzun + t.calisanlaraSaglananDigerFUzun + t.ertelenmisVergiYukumluluk + t.digerUzunVadeliYukumluluk + t.turevFinansalAraclarUzun) toplamUzunVadeliYukumlulukler, " +
			" (t.sermaye + t.sermayeDuzeltmeFark + t.hisseSenediIhracPrim + t.kardanAyrilanKisitYedek + t.yabanciParaCevrimFarki + t.finansalRisktenKorunmaFon + t.duranVarlikDegerFonu  +t.finansalVarlikDegerFonu + t.gecmisYillarKarZarar) anaOrtakligaAitOzkaynaklarToplamiNetKarZararHaric " +
			" from Kaynak t where t.donem = :donem ";
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	@Override
	public Kaynak findByDonemAndCompany(Donem donem, Company company) {
		// TODO Auto-generated method stub
		return super.findByDonemAndCompany(donem, company);
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

}

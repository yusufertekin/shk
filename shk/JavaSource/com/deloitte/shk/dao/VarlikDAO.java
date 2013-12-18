package com.deloitte.shk.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.Varlik;
import com.deloitte.shk.generic.GenericDAO;
/**
 * @author yusufertekin
 *
 */
@Stateless
public class VarlikDAO extends GenericDAO<Varlik,Long> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private final String HQL_FIND_DONEM_KARNE_SO = "select t.ticarialacak, (t.nakit + t.finansalYatirim) nakitOranPay, " +
			" (t.nakit + t.finansalYatirim + t.ticariAlacak + t.supheliAlacakKarsilik + t.teknikMalzemeStok + t.ucakAlimOnOdeme + t.turevFinansalAraclar + t.iliskiliTaraflardanAlacaklar + t.digerAlacak + t.satisAmaciylaeldeTutulanVarlik) toplamDonenVarliklar, " +
			" (t.turevFinansalAraclarDiger + t.digerDuranVarliklar + t.ertelenmisVergiVarliklar + t.iliskiliTaraflarAlacaklarDiger + t.uzunVadeliDigerAlacaklar + t.yatirimAmacliGayrimenkuller + t.birikmisAmortismanMaddiOlmayan + t.digerMaddiOlmayanDuranVarlik + t.slotHakki + t.serefiye + t.yapilmaktaOlanYatirim +t.ucakAlimOnOdeme + t.arsaArazi + t.birikmisAmortisman + t.yerEkipman + t.digerUcusEkipman + t.ucaklarMotorlar + t.nakit + t.finansalYatirim + t.ticariAlacak + t.supheliAlacakKarsilik + t.teknikMalzemeStok + t.ucakAlimOnOdeme + t.turevFinansalAraclar + t.iliskiliTaraflardanAlacaklar + t.digerAlacak + t.satisAmaciylaeldeTutulanVarlik) toplamVarliklar, " +
			" (t.nakit + t.finansalYatirim + t.ticariAlacak + t.iliskiliTaraflardanAlacaklar + t.digerAlacak) likiditeOranPay " +
			" from Kaynak t where t.donem = :donem ";
	
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

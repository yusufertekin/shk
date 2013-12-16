package com.deloitte.shk.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Dipnot;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.generic.GenericBean;
import com.deloitte.shk.generic.GenericService;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.services.DipnotService;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class DipnotBean extends GenericBean<Dipnot,Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject DipnotService dipnotService;
	@Inject @CurrentUser Kullanici currentUser;
	
	
	@Override
	public GenericService<Dipnot,Long> getEntityService() {
		// TODO Auto-generated method stub
		return dipnotService;
	}
	public void save(Dipnot instance, Long sayfaNo, Company company, Donem donem) throws Exception {
		
		try {
			instance.setSayfaNo(sayfaNo);
			instance.setCompany(company);
			instance.setDonem(donem);
			getEntityService().update(instance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			addMessage("common.saveError");
			return;
		}
		addMessage("common.saveSuccessful");
	}
	

}

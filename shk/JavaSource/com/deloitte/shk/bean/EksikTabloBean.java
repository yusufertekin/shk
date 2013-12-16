package com.deloitte.shk.bean;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.qualifier.CurrentUser;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class EksikTabloBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject @CurrentUser Kullanici currentUser;
	
	private List list;
	
	private Company company;
	private Date donem;
	
	
	public static String formatDate(Date date, String pattern) {
	    if (date == null) {
	        return null;
	    }

	    if (pattern == null) {
	        throw new NullPointerException("pattern");
	    }

	    Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
	    return new SimpleDateFormat(pattern, locale).format(date);
	}
	public void sorgula()
	{
		if(currentUser.getCompany() != null && currentUser.getCompany().getCompanyId() != null)
		{
			
		}
	}
	public void initValues()
	{
		
	}
	public String initPage() {
		// TODO Auto-generated method stub
		sorgula();
		initValues();
		return "/xhtml/admin/eksikTablo.xhtml?faces-redirect=true";
	}
	public Kullanici getCurrentUser() {
		return currentUser;
	}
	public void setCurrentUser(Kullanici currentUser) {
		this.currentUser = currentUser;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Date getDonem() {
		return donem;
	}
	public void setDonem(Date donem) {
		this.donem = donem;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	

}

package com.deloitte.shk.bean;


import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Kullanici;
import com.deloitte.shk.qualifier.CurrentUser;
import com.deloitte.shk.services.CompanyService;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class CompanyBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject CompanyService companyService;
	@Inject @CurrentUser Kullanici currentUser;
	private Company instance;
	private ResourceBundle msg;
	private List<Company> list;
	
	@PostConstruct
	public void init() {
		loadList();
		newInstance();
		setMsg(ResourceBundle.getBundle("com.deloitte.shk.resources.messages"));
	}
	public void newInstance()
	{
		instance = new Company();
	}
	public void loadList()
	{
		list = companyService.list();
	}
	public void makeAdmin()
	{
		currentUser.setCompany(null);
	}
	public void update() {

		try {
			companyService.update(instance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			addMessage("common.updateError");
			return;
		}
		newInstance();
		loadList();
		addMessage("common.updateSuccessful");
	}
	
	public void update(Company instance) {

		try {
			companyService.update(instance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			addMessage("common.updateError");
			return;
		}
		newInstance();
		loadList();
		addMessage("common.updateSuccessful");
	}
	public void selectCompany()
	{
		try {
			currentUser.setCompany((Company) getInstance().clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void save() throws Exception {
		
		try {
			companyService.save(instance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			addMessage("common.saveError");
			return;
		}
		newInstance();
		loadList();
		addMessage("common.saveSuccessful");
	}

	public void remove(Company instance) {
		
		try {
			companyService.remove(instance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			addMessage("common.removeError");
			return;
		}
		newInstance();
		loadList();
		addMessage("common.removeSuccessful");
	}
	public void addMessage(String msg)
	{
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(getMsg().getString(msg)));
	}
	public Company getInstance() {
		return instance;
	}

	public void setInstance(Company instance) {
		this.instance = instance;
	}

	public List<Company> getList() {
		return list;
	}

	public void setList(List<Company> list) {
		this.list = list;
	}
	public ResourceBundle getMsg() {
		return msg;
	}
	public void setMsg(ResourceBundle msg) {
		this.msg = msg;
	}
	

}

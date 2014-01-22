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

import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.generic.GenericBean;
import com.deloitte.shk.generic.GenericService;
import com.deloitte.shk.qualifier.DonemList;
import com.deloitte.shk.services.DonemService;
/**
 * @author yusufertekin
 *
 */
@Named
@SessionScoped
public class DonemBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject DonemService donemService;
	private ResourceBundle msg;
	@Inject @DonemList List<Donem> donemList;
	private Donem instance;
	private List<Donem> list;

	public void newInstance()
	{
		instance = new Donem();
	}
	
	public void save() throws Exception {
		
		try {
			donemService.save(getInstance());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			if(e.getCause().getCause().getMessage().contains("ORA-00001"))
			{
				addMessage("donem.donemBulunmakta");
				return;
			}
			else
			{
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(getMsg().getString("common.error")));
			}
		}
		instance = new Donem();
		this.setList(donemService.list());		
		addMessage("common.saveSuccessful");
		donemList = donemService.list();
	}

	public String initPage() {
		// TODO Auto-generated method stub
		newInstance();
		return "/xhtml/user/donem.xhtml?faces-redirect=true";
	}
	
	@PostConstruct
	public void init() {
		loadList();
		newInstance();
		setMsg(ResourceBundle.getBundle("com.deloitte.shk.resources.messages"));
	}

	public void remove(Donem instance) {
		
		try {
			donemService.remove(instance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			addMessage("common.removeError");
			return;
		}
		newInstance();
		donemList = donemService.list();
		loadList();
		addMessage("common.removeSuccessful");
	}
	public void loadList()
	{
		this.setList(donemService.list());
	}
	public void addMessage(String msg)
	{
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(getMsg().getString(msg)));
	}

	public void update() {

		try {
			donemService.update(instance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			addMessage("common.updateError");
			return;
		}
		newInstance();
		loadList();
		donemList = donemService.list();
		addMessage("common.updateSuccessful");
	}
	
	public void update(Donem instance) {

		try {
			donemService.update(instance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			addMessage("common.updateError");
			return;
		}
		newInstance();
		loadList();
		donemList = donemService.list();
		addMessage("common.updateSuccessful");
	}

	public Donem getInstance() {
		return instance;
	}

	public void setInstance(Donem instance) {
		this.instance = instance;
	}
	

	public List<Donem> getList() {
		return list;
	}

	public void setList(List<Donem> list) {
		this.list = list;
	}

	public ResourceBundle getMsg() {
		return msg;
	}

	public void setMsg(ResourceBundle msg) {
		this.msg = msg;
	}


}

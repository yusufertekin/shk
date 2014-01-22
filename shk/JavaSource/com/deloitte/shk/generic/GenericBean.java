package com.deloitte.shk.generic;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Dipnot;
import com.deloitte.shk.entity.Donem;
import com.deloitte.shk.qualifier.DonemList;
/**
 * @author yusufertekin
 *
 */
public abstract class GenericBean<E extends GenericEntity, A> implements Serializable{

	Class<E> cls;
	
	private ResourceBundle msg;
	private @Inject @DonemList List<Donem> donemList;
	private Dipnot dipnot;
	

	
	@SuppressWarnings("unchecked")
	public GenericBean(){
		Type genericSuperclass = getClass().getGenericSuperclass();
		if(genericSuperclass instanceof ParameterizedType){
			this.cls = (Class<E>) ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
		}
       
	}
	
	private Donem selectedDonem;
	private Company company;
	private E instance;
	private List<E> list;

	
	public abstract GenericService<E, A> getEntityService();
	public abstract void sorgula();
	
	public void newInstance() {
		try {
			this.setInstance(cls.newInstance());
			newInstanceInit();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
			this.setInstance(null);
		}
	}
	public void newInstanceInit()
	{
		if(company != null)
		{
			try {
				instance.setCompany((Company) company.clone());
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(selectedDonem != null)
		{
			instance.setDonem(selectedDonem);
		}
	}
	public void save() throws Exception {
		
		try {
			getEntityService().save(instance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			addMessage("common.saveError");
			return;
		}
		newInstance();
		loadList();
		addMessage("common.saveSuccessful");
		sorgula();
	}
	public void remove()
	{
		if(getEntityService().findByDonemAndCompany(instance.getDonem(), instance.getCompany()) != null)
		{
			try {
				getEntityService().remove(instance);
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
		else
		{
			addMessage("common.removeHata");
		}
	}
	public void remove(E instance) {
		
		if(getEntityService().findByDonemAndCompany(instance.getDonem(), instance.getCompany()) != null)
		{
			try {
				getEntityService().remove(instance);
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
		else
		{
			addMessage("common.removeHata");
		}
	}

	public void select(E instance) {
		this.instance = instance;
	}
	
	public void addMessage(String msg)
	{
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(getMsg().getString(msg)));
	}

	public void update() {

		try {
			getEntityService().update(instance);
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
	
	public void update(E instance) {

		try {
			getEntityService().update(instance);
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
	
	public E clone(E instance) throws CloneNotSupportedException
	{
		return getEntityService().clone(instance);
	}

	@PostConstruct
	public void init() {
		loadList();
		newInstance();
		dipnot = new Dipnot();
		setMsg(ResourceBundle.getBundle("com.deloitte.shk.resources.messages"));
	}
	

	private void loadList() {
		this.list = getEntityService().list();
	}
	
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

	public E getInstance() {
		return instance;
	}
	
	public void setInstance(E instance) {
		this.instance = instance;
	}

	public List<E> getList() {
		return list;
	}
	
	public void setList(List<E> list) {
		this.list = list;
	}

	public ResourceBundle getMsg() {
		return msg;
	}

	public void setMsg(ResourceBundle msg) {
		this.msg = msg;
	}

	public Boolean getUpdateable() {
		if(company == null)
			return false;
		return (selectedDonem.getDurum().intValue() == 0 && selectedDonem.getCompany() == null) 
				|| (selectedDonem.getDurum().intValue() == 0 && selectedDonem.getCompany() != null && selectedDonem.getCompany().getCompanyId().intValue() == company.getCompanyId().intValue());
	}

	public void setUpdateable(Boolean a) {
		
	}

	public Boolean getDisable() {
		if(company == null || selectedDonem.getDurum().intValue() == 1)
			return true;
		return (selectedDonem.getCompany() != null && selectedDonem.getCompany().getCompanyId().intValue() != company.getCompanyId().intValue());
	}

	public void setDisable(Boolean a) {
		
	}

	public Donem getSelectedDonem() {
		return selectedDonem;
	}

	public void setSelectedDonem(Donem selectedDonem) {
		this.selectedDonem = selectedDonem;
	}

	public List<Donem> getDonemList() {
		return donemList;
	}

	public void setDonemList(List<Donem> donemList) {
		this.donemList = donemList;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Dipnot getDipnot() {
		return dipnot;
	}

	public void setDipnot(Dipnot dipnot) {
		this.dipnot = dipnot;
	}

}

package com.deloitte.shk.generic;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.deloitte.shk.entity.Company;
import com.deloitte.shk.entity.Donem;

/**
 * @author yusufertekin
 *
 */
@MappedSuperclass
public abstract class GenericEntity implements Cloneable{
	
	public abstract Long entityId();
	
	public abstract void setEntityId(Long id);
	
	@ManyToOne
	private Company company;
	
	@ManyToOne
	@JoinColumn(updatable = false)
	private Donem donem;
	
	private String dipnot;
	
	public boolean equals(Object obj) {
		if (null == obj) {
			return false;
		}
		if (!(obj.getClass().equals(this.getClass()))) {
			return false;
		} else {
			GenericEntity mObj = (GenericEntity) obj;
			if (null == mObj || null == this || null == this.entityId()) {
				return false;
			} else {
				boolean flag = this.entityId().equals(mObj.entityId());
				return flag;
			}
		}
	}


	@Override
	public GenericEntity clone() throws CloneNotSupportedException{
		GenericEntity ge = (GenericEntity)super.clone();
    	return ge;
    }

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Donem getDonem() {
		return donem;
	}

	public void setDonem(Donem donem) {
		this.donem = donem;
	}

	public String getDipnot() {
		return dipnot;
	}

	public void setDipnot(String dipnot) {
		this.dipnot = dipnot;
	}
	


	

}

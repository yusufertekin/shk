package com.deloitte.shk.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
/**
 * @author yusufertekin
 *
 */
@Entity
public class Company implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "companySeq")
	@SequenceGenerator(name="companySeq", sequenceName="COMPANY_SEQ", allocationSize=1, initialValue=1)
	private Long companyId;
	
	@Column(length=300)
	private String name;
	

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Company clone() throws CloneNotSupportedException{
		Company ge = (Company)super.clone();
    	return ge;
    }

}

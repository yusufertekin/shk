package com.deloitte.shk.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.deloitte.shk.generic.GenericEntity;
/**
 * @author yusufertekin
 *
 */
@Entity
public class Dipnot extends GenericEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "dipnotSeq")
	@SequenceGenerator(name="dipnotSeq", sequenceName="DIPNOT_SEQ", allocationSize=1, initialValue=1)
	private Long dipnotId;
	
	private Long sayfaNo;
	
	private String dipnotText;

	public Long getDipnotId() {
		return dipnotId;
	}

	public void setDipnotId(Long dipnotId) {
		this.dipnotId = dipnotId;
	}
	

	@Override
	public Long entityId() {
		// TODO Auto-generated method stub
		return getDipnotId();
	}

	@Override
	public void setEntityId(Long id) {
		setDipnotId(id);
	}

	public Long getSayfaNo() {
		return sayfaNo;
	}

	public void setSayfaNo(Long sayfaNo) {
		this.sayfaNo = sayfaNo;
	}

	public String getDipnotText() {
		return dipnotText;
	}

	public void setDipnotText(String dipnotText) {
		this.dipnotText = dipnotText;
	}

}

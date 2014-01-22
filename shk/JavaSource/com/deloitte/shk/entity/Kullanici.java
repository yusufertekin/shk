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
public class Kullanici extends GenericEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="kullaniciSeq")
	@SequenceGenerator(name="kullaniciSeq", sequenceName="USERS_SEQ", initialValue=2, allocationSize=1)
	private Long userId;
	
	@Column(length=300, unique=true)
	private String username;
	
	@Column(length=300)
	private String userRealName;
	
	@Column(length=300)
	private String password;
	
	@Column(nullable = false)
	private Integer durum;
	
	@Override
	public Long entityId() {
		// TODO Auto-generated method stub
		return getUserId();
	}
	
	@Override
	public void setEntityId(Long id) {
		setUserId(id);
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getDurum() {
		return durum;
	}

	public void setDurum(Integer durum) {
		this.durum = durum;
	}

	public String getUserRealName() {
		return userRealName;
	}

	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}

}

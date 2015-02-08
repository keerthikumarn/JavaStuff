package com.hibernate.samples.basic;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.AUTO;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import static org.hibernate.annotations.CacheConcurrencyStrategy.READ_ONLY;

@Entity
@Cacheable
@Cache(usage = READ_ONLY)
public class UserDetails implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int userId;
	private String name;
	private String address;
	
	public UserDetails(){
		
	}
	
	public UserDetails(String name, String address){
		this.name = name;
		this.address = address;
	}

	@Id
	@GeneratedValue(strategy = AUTO)
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

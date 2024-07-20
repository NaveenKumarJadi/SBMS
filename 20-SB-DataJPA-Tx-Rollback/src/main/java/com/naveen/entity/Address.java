package com.naveen.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMP_ADDR_TBL")
public class Address {
	
	@Id
	@Column(name = "ADDR_ID")
	private Integer addrId;
	
	private String city;
	
	private String state;
	
	private String country;
	
	@Column(name = "EMP_ID")
	private Integer empId;

	
	public Integer getAddrId() {
		return addrId;
	}

	public void setAddrId(Integer addrId) {
		this.addrId = addrId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Address(Integer addrId, String city, String state, String country, Integer empId) {
		this.addrId = addrId;
		this.city = city;
		this.state = state;
		this.country = country;
		this.empId = empId;
	}

	public Address() {

	}

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", city=" + city + ", state=" + state + ", country=" + country + ", empId="
				+ empId + "]";
	}
	
	
	

}

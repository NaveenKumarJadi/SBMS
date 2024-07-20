package com.naveen.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AccountPK implements Serializable{

	 private Integer accId; 
	 private String accType; 
	 private String holderName;
	 
	 
	public Integer getAccId() {
		return accId;
	}
	public void setAccId(Integer accId) {
		this.accId = accId;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	
	public AccountPK(Integer accId, String accType, String holderName) {
		this.accId = accId;
		this.accType = accType;
		this.holderName = holderName;
	}
	
	public AccountPK() {

	}
	@Override
	public String toString() {
		return "AccountPK [accId=" + accId + ", accType=" + accType + ", holderName=" + holderName + "]";
	} 
	 
	
	 
	 

}

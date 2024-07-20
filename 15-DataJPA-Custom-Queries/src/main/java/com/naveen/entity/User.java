package com.naveen.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USER_MASTER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@Column(name="USER_ID")
	private Integer userid;
	
	@Column(name="USER_NAME")
	private String username;
	
	@Column(name="USER_GENDER")
	private String gender;
	
	@Column(name="USER_AGE")
	private Integer age;
	
	@Column(name="USER_COUNTRY")
	private String country;

//	@AllArgsConstructor by using lombok annotaion no need of argument constructor but it is not working in my machine so im using it
//	public User(Integer userid, String username, String gender, Integer age, String country) {
//		this.userid = userid;
//		this.username = username;
//		this.gender = gender;
//		this.age = age;
//		this.country = country;
//	}
//
//	public User() {
//
//	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", gender=" + gender + ", age=" + age
				+ ", country=" + country + "]";
	}
	
}

	
	
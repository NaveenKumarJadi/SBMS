package com.naveen.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emp_tbl")
public class Emp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;

	private String ename;

	private Double esal;

	@OneToMany(mappedBy = "emp", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Address> addrList;

}
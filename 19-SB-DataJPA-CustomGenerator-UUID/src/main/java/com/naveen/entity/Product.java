package com.naveen.entity;

import org.hibernate.annotations.GenericGenerator;

import com.naveen.generator.ProductIdGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "PRODUCT_GENERATOR")
public class Product {

	@Id
	@GeneratedValue(generator = "customer_uuid")
	@GenericGenerator(name = "customer_uuid", type = ProductIdGenerator.class)
	private String productId;
	
	private String name;
	
	private String description;
}

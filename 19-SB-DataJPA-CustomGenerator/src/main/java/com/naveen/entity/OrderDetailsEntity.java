package com.naveen.entity;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "ORDR_DTLS")
public class OrderDetailsEntity {

	@SuppressWarnings("deprecation")
	@Id
	@Column(name = "ORDER_ID")
	@GeneratedValue(generator = "custom-id-generator")
    @GenericGenerator(name = "custom-id-generator", strategy = "com.naveen.generator.OrderIdGenerator")
	private String orderId;

	@Column(name = "ORDER_BY")
	private String orderBy;
	
	@Column(name = "ORDER_PLACED_DT")
	@Temporal(TemporalType.DATE)
	private Date orderPlacedDate;
	
}

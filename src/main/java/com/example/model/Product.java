package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private int productId;
	@Column(name = "product_type")
	//@Enumerated(EnumType.STRING)
	private String productType;
	@Column(name = "product_price")
	private double productPrice;
	
	public Product(String productType, double productPrice) {
		super();
		this.productType = productType;
		this.productPrice = productPrice;
	}

}

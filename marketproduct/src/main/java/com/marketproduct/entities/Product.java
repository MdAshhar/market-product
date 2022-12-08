package com.marketproduct.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="p_name", length=50, nullable=false)
	private String p_name;
	
	@Column(name="p_quantity", length=10, nullable=false)
	private String p_quantity;
	
	@Column(name="p_price", length=10, nullable=false)
	private String p_price;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_quantity() {
		return p_quantity;
	}
	public void setP_quantity(String p_quantity) {
		this.p_quantity = p_quantity;
	}
	public String getP_price() {
		return p_price;
	}
	public void setP_price(String p_price) {
		this.p_price = p_price;
	}
}

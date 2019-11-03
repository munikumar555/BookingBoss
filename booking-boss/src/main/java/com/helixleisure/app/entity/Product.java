package com.helixleisure.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class Product.
 *
 * @author munikumarchallagulla
 */
@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@Column(name="ID")
	private Long id;
	
	/** The name. */
	@Column(name="NAME")
	private String name;
	
	/** The quantity. */
	@Column(name="QUANTITY")
	private Integer quantity;
	
	/** The sale amount. */
	@JsonProperty(value = "sale_amount")
	@Column(name="SALE_AMOUNT")
	private Double saleAmount;

	/** The product details. */
	@ManyToOne
    @JoinColumn(name="PID")
	@JsonIgnore
	private ProductDetails productDetails;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * Sets the quantity.
	 *
	 * @param quantity the new quantity
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * Gets the sale amount.
	 *
	 * @return the sale amount
	 */
	public Double getSaleAmount() {
		return saleAmount;
	}

	/**
	 * Sets the sale amount.
	 *
	 * @param saleAmount the new sale amount
	 */
	public void setSaleAmount(Double saleAmount) {
		this.saleAmount = saleAmount;
	}

	/**
	 * Gets the product details.
	 *
	 * @return the product details
	 */
	public ProductDetails getProductDetails() {
		return productDetails;
	}

	/**
	 * Sets the product details.
	 *
	 * @param productDetails the new product details
	 */
	public void setProductDetails(ProductDetails productDetails) {
		this.productDetails = productDetails;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Product [name=" + name + ", quantity=" + quantity + ", saleAmount=" + saleAmount + ", productDetails="
				+ productDetails + "]";
	}

	
}

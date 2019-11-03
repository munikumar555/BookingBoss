package com.helixleisure.app.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductDetails.
 * 
 * @author munikumarchallagulla
 */
@Entity
@Table(name = "PRODUCT_DETAILS")
public class ProductDetails implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@Column(name="PID")
	private Long id;
	
	/** The timestamp. */
	@Column(name="TIME_STAMP")
	private Timestamp timestamp;
	
	/** The products. */
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "productDetails", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Product> products;
	
	/**
	 * Instantiates a new product details.
	 */
	public ProductDetails() {
		
	}
	
	/**
	 * Instantiates a new product details.
	 *
	 * @param timestamp the timestamp
	 */
	public ProductDetails(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

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
	 * Gets the timestamp.
	 *
	 * @return the timestamp
	 */
	public Timestamp getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the timestamp.
	 *
	 * @param timestamp the new timestamp
	 */
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * Gets the products.
	 *
	 * @return the products
	 */
	public Set<Product> getProducts() {
		return products;
	}

	/**
	 * Sets the products.
	 *
	 * @param products the new products
	 */
	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", timestamp=" + timestamp + ", products=" + products + "]";
	}
	
	
}

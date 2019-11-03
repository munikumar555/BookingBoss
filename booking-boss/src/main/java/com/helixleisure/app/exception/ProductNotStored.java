package com.helixleisure.app.exception;

/**
 * The Class ProductNotStored.
 * 
 * @author munikumarchallagulla
 */
public class ProductNotStored extends RuntimeException{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new product not stored.
	 *
	 * @param id the id
	 */
	public ProductNotStored(Long id) {
		super("Product not stored : " + id);
	}
}

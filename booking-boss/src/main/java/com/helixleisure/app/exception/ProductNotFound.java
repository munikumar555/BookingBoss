package com.helixleisure.app.exception;

/**
 * The Class ProductNotFound.
 * 
 * @author munikumarchallagulla
 */
public class ProductNotFound extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new product not found.
	 *
	 * @param id the id
	 */
	public ProductNotFound(Long id) {
		super("Product not found : " + id);
	}
}

package com.helixleisure.app.service;

import com.helixleisure.app.dto.ProductResponse;
import com.helixleisure.app.entity.ProductDetails;

/**
 * The Interface BookingBossService.
 * 
 * @author munikumarchallagulla
 */
public interface ProductDetailService {

	/**
	 * Store products.
	 *
	 * @param productDetails the product details
	 * @return the details
	 */
	ProductResponse storeProducts(ProductDetails productDetails);
	
	/**
	 * Gets the details.
	 *
	 * @param id the id
	 * @return the details
	 */
	ProductDetails getDetails(Long id);
}

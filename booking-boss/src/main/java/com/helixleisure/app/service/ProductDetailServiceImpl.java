package com.helixleisure.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helixleisure.app.entity.ProductDetails;
import com.helixleisure.app.exception.ProductNotFound;
import com.helixleisure.app.exception.ProductNotStored;
import com.helixleisure.app.repository.ProductDetailsRepository;
import com.helixleisure.app.util.ProductConstant;

/**
 * The Class BookingBossServiceImpl.
 * 
 * @author munikumarchallagulla
 */
@Service
public class ProductDetailServiceImpl implements ProductDetailService{
	
	/** The product details repository. */
	@Autowired
	private ProductDetailsRepository productDetailsRepository;
	
	/**
	 * Store products.
	 *
	 * @param productDetails the product details
	 * @return the string
	 */
	@Override
	public String storeProducts(ProductDetails productDetails) {
		productDetails.getProducts().forEach(x->x.setProductDetails(productDetails));
		ProductDetails saveResponse = productDetailsRepository.save(productDetails);
		if(saveResponse!=null) return ProductConstant.STORED_SUCCESS;
		else
			throw new ProductNotStored(productDetails.getId());
	}
	
	/**
	 * Gets the details.
	 *
	 * @param id the id
	 * @return the details
	 */
	@Override
	public ProductDetails getDetails(Long id) {
		ProductDetails response = productDetailsRepository.findById(id);
		if(response!=null) return response;
		else
			throw new ProductNotFound(id);
	}
}

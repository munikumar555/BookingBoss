package com.helixleisure.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helixleisure.app.entity.ProductDetails;

/**
 * The Interface ProductDetailsRepository.
 * 
 * @author munikumarchallagulla
 */
@Repository
public interface ProductDetailsRepository extends JpaRepository<ProductDetails, String> {

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the product details
	 */
	ProductDetails findById(Long id);
	
}
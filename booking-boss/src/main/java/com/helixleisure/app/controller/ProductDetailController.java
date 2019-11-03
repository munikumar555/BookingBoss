package com.helixleisure.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.helixleisure.app.entity.ProductDetails;
import com.helixleisure.app.service.ProductDetailService;

/**
 * The Class BookingBossController.
 *
 * @author munikumarchallagulla
 */
@RestController
public class ProductDetailController {

	/** The booking boss service. */
	@Autowired
	ProductDetailService bookingBossService;

	/**
	 * Process product details.
	 *
	 * @param productDetails the product details
	 * @return the response entity
	 */
	@PostMapping(path = "/store-products", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<String> processProductDetails(@RequestBody ProductDetails productDetails) {
		return new ResponseEntity<String>(bookingBossService.storeProducts(productDetails), HttpStatus.OK);
	}

	/**
	 * Gets the products.
	 *
	 * @param id the id
	 * @return the products
	 */
	@GetMapping(path = "/get-products/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ProductDetails> getProducts(@PathVariable Long id) {
		return new ResponseEntity<ProductDetails>(bookingBossService.getDetails(id), HttpStatus.OK);

	}
}

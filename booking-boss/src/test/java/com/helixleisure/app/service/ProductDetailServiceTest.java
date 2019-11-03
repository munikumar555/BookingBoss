package com.helixleisure.app.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.helixleisure.app.entity.Product;
import com.helixleisure.app.entity.ProductDetails;
import com.helixleisure.app.exception.ProductNotFound;
import com.helixleisure.app.util.ProductConstant;

/**
 * The Class ProductDetailServiceTest.
 * 
 * @author munikumarchallagulla
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureMockMvc
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductDetailServiceTest {

	/** The booking boss service. */
	@Autowired
	private ProductDetailService bookingBossService;
	
	/**
	 * Adds the products test.
	 */
	@Test
	public void addProductsTest() {
		assertEquals(ProductConstant.STORED_SUCCESS, bookingBossService.storeProducts(setProductDetails()).getMessage());
	}
	
	/**
	 * Gets the products test.
	 */
	@Test
	public void getProductsTest() {
		ProductDetails productDetails = bookingBossService.getDetails(123l);
		assertThat(productDetails.getId()==123l);
	}
	
	/**
	 * Adds the products test fail.
	 */
	@Test(expected = Exception.class)
	public void addProductsTestFail() {
		ProductDetails details = new ProductDetails();
		details.setId(123l);
		details.setTimestamp(null);
		bookingBossService.storeProducts(details);
	}
	
	/**
	 * Gets the products test fail.
	 */
	@Test(expected = ProductNotFound.class)
	public void getProductsTestFail() {
		bookingBossService.getDetails(12l);
		
	}
	
	/**
	 * Sets the product details.
	 */
	public ProductDetails setProductDetails() {
		
		ProductDetails details = new ProductDetails();
		details.setTimestamp(new Timestamp(new Date().getTime()));
		details.setId(123l);
		Set<Product> products = new HashSet<Product>();
		Product product = new Product();
		product.setId(1l);
		product.setName("abcd");
		product.setQuantity(2);
		product.setSaleAmount(25d);
		product.setProductDetails(details);
		products.add(product);
		details.setProducts(products);
		
		return details;
	}
}

package com.helixleisure.app.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.helixleisure.app.entity.Product;
import com.helixleisure.app.entity.ProductDetails;
import com.helixleisure.app.repository.ProductDetailsRepository;

/**
 * The Class ProductDetailControllerTest.
 * 
 * @author munikumarchallagulla
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureMockMvc
public class ProductDetailControllerTest {

	/** The mvc. */
	@Autowired
	private MockMvc mvc;

	/** The product details repository. */
	@Autowired
	private ProductDetailsRepository productDetailsRepository;

	/**
	 * Store product API.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void storeProductAPI() throws Exception {

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

		mvc.perform(MockMvcRequestBuilders.post("/store-products").content(asJsonString(details))
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().is2xxSuccessful());
	}

	/**
	 * Gets the product by id API.
	 */
	@Test
	public void getProductByIdAPI() throws Exception {

		productDetailsRepository.save(setProductDetails());
		mvc.perform(MockMvcRequestBuilders.get("/get-products/{id}", 123).accept(MediaType.APPLICATION_JSON))
				.andDo(print()).andExpect(status().is2xxSuccessful());
	}

	/**
	 * As json string.
	 */
	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
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

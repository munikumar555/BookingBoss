package com.helixleisure.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helixleisure.app.entity.Product;

/**
 * The Interface ProductRepository.
 * 
 * @author munikumarchallagulla
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

}
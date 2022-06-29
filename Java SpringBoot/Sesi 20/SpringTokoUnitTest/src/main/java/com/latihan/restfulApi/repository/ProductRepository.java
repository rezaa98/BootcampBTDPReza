package com.latihan.restfulApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.latihan.restfulApi.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
//	List<Product>findAllbyName(String nama);
	
//	Product findProductById(int id);
	
}


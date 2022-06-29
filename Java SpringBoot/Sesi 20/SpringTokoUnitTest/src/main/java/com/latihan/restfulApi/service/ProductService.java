package com.latihan.restfulApi.service;

import java.util.List;

import com.latihan.restfulApi.model.Product;

public interface ProductService {
	
	List<Product> listAllProduct();
	
	Product saveProduct (Product product);
	
	void deleteProduct(int id);
	
	Product findProductById(int id);

}

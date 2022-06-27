package com.latihan.restfulApi.service;

import java.util.List;

import com.latihan.restfulApi.model.Product;

public interface ProductService {
	
	public List<Product> listAllProduct();
	
	public void saveProduct (Product product);
	
	public void deleteProduct(Integer id);
	
	public Product findProductById(Integer id);

}

package com.latihan.restfulApi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latihan.restfulApi.model.Product;
import com.latihan.restfulApi.repository.ProductRepository;
import com.latihan.restfulApi.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> listAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(int id) {
		Product product = productRepository.findById(id).orElse(new Product());
		  productRepository.delete(product);
	}

	@Override
	public Product findProductById(int id) {
		Product product = productRepository.findById(id).orElse(new Product());
		return product;
	}
}

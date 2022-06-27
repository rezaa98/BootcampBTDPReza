package com.demo.rest;

import java.util.Random;

import com.demo.rest.entity.Product;

public class TestObjectFactory {

}
public static Product createProduct() {
	  final Product product = new Product();
	  product.setId(new Random().nextLong());
	  product.setName(RandomStringUtils.randomAlphabetic(10));
	  product.setHargaBeli(new Random().nextLong());
	  product.setHargaJual(new Random().nextLong());

	  return product;
	}

	public static List<Product> createProductList(final int size){
	  final List<Product> result = new ArrayList<>();
	  for(int i=0; i<size; i++) {
	    result.add(createProduct());
	  }
	  return result;
	}
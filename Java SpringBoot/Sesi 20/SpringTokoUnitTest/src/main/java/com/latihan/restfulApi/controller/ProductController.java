package com.latihan.restfulApi.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.latihan.restfulApi.model.Product;
import com.latihan.restfulApi.service.ProductService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping(value = "/api/v1")
public class ProductController {
	
	@Autowired
	ProductService productService;

	@GetMapping(value = "/product")
	public List<Product> getAllProduct() {
		return productService.listAllProduct();
	}

	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Integer id) {
		try {
			Product product = productService.findProductById(id);
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/product")
	public void saveProduct(@RequestBody Product product) {
		productService.saveProduct(product);
	}

	@PutMapping("/product/{id}")
	public ResponseEntity<?> updateProductById(@RequestBody Product product, @PathVariable Integer id) {
		try {
			Product checkProduct = productService.findProductById(id);
			if (checkProduct.getId() != id) {
				return new ResponseEntity<>("ID Data produk tidak sesuai", HttpStatus.OK);
			}
			product.setId(id);
			productService.saveProduct(product);
			return new ResponseEntity<>("Produk Baru Sudah Tersimpan", HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("Terjadi kesalahan" + e.getMessage(), HttpStatus.OK);
		}
	}

	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable Integer id) {
		productService.deleteProduct(id);
	}

}

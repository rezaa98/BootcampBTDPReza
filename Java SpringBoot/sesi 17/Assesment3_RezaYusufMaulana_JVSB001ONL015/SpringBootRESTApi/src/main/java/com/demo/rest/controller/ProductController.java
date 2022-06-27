package com.demo.rest.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.demo.rest.entity.Product;
import com.demo.rest.repository.ProductRepository;
import com.demo.rest.service.ProductService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/home")
public class ProductController {

	@Autowired
	private ProductRepository produkRepository;

	@Autowired
	private ProductService produkService;

	@GetMapping("/productsReza")
	public List<Product> findAllProducts() {
		return produkRepository.findAll();
	}

	@PostMapping("/productsReza")
	public Product saveProducts(@RequestBody Product product) {
		return produkService.saveProduct(product);
	}

	@GetMapping("/productsReza/name/{name}")
	public List<Product> findAllProductsByName(@PathVariable String name) {
		return produkService.findAllProductsByName(name);
	}

	@DeleteMapping("/productsReza/id/{id}")
	public void deleteById(@PathVariable Long id) {
		produkService.deleteProductById(id);
	}

	@CrossOrigin
	@PutMapping("/productsReza")
	public ResponseEntity<?> updateProductById(@RequestBody Product product, @RequestParam Long id) {

		try {
			Product checkProduct = produkService.findProductById(id);
			if (checkProduct.getId() != id) {
				return new ResponseEntity<>("ID Data Produk Belum Sesuai", HttpStatus.OK);
			}
			product.setId(id);
			produkService.saveProduct(product);


			return new ResponseEntity<>("Berhasil simpan produk", HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("Terjadi kesalahan" + e.getMessage(), HttpStatus.OK);
		}
	}

}


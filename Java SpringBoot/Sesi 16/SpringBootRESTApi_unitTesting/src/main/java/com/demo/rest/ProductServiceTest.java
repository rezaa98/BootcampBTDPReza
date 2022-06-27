package com.demo.rest;

import org.junit.Before;
import org.junit.runner.RunWith;

import com.demo.rest.repository.ProductRepository;
import com.demo.rest.service.ProductService;

@RunWith(SpringRunner.class)
public class ProductServiceTest {

	@InjectMocks
	private ProductService productService = new ProductServiceImpl();

	@Mock
	private ProductRepository productRepository;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		ReflectionTestUtils.setField(productService, "productRepository", productRepository);
	}
}
package com.hbi.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hbi.product.entity.Product;
import com.hbi.product.service.ProductService;

@RestController
public class ProductController {

	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private ProductService productService;

	@RequestMapping("/products")
	public List<Product> getAllProducts() {
		logger.debug("Executing getAllProducts()..");
		return productService.getAllProducts();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/products")
	public void addProducts(@RequestBody Product product) {
		logger.debug("Executing addProducts()..");
		productService.addProducts(product);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/products/{id}")
	public void updateProduct(@RequestBody Product product) {
		logger.debug("Executing updateProduct()..");
		productService.addProducts(product);
	}

}

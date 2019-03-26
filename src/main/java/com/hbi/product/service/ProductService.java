package com.hbi.product.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbi.product.entity.Product;
import com.hbi.product.repository.ProductRepository;

@Service
public class ProductService {

	private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		logger.debug("Executing getAllProducts service..");
		return productRepository.findAll();
	}

	public void addProducts(Product topic) {
		logger.debug("Executing addProducts service..");
		productRepository.save(topic);
	}
}

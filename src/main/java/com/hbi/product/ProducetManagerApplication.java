package com.hbi.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProducetManagerApplication {

	private static final Logger logger = LoggerFactory.getLogger(ProducetManagerApplication.class);

	public static void main(String[] args) {
		logger.info("Executing springboot main function...");
		SpringApplication.run(ProducetManagerApplication.class, args);
	}
}

package com.charly.productmanagement;

import com.charly.productmanagement.entity.Product;
import com.charly.productmanagement.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagementApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRepository productRepository) {
		return args -> {
			productRepository.save(
					Product.builder()
							.name("computer")
							.price(7000.00)
							.quantity(156L)
							.build()
			);

			productRepository.save(
					Product.builder()
							.name("Printer")
							.price(15000.00)
							.quantity(15L)
							.build()
			);

			productRepository.save(
					Product.builder()
							.name("Smartphone")
							.price(6000.00)
							.quantity(170L)
							.build()
			);

			productRepository.findAll().forEach(product -> System.out.println(product.toString()));
		};
	}

}

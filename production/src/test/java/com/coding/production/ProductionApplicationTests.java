package com.coding.production;

import com.coding.production.entity.Product;
import com.coding.production.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class ProductionApplicationTests {

	@Autowired
	private ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testRepository() {
		Product product = Product.builder()
				.sku("nestle")
				.price(BigDecimal.valueOf(123.45))
				.title("Nestle Dark Chocolate")
				.quantity(12)
				.build();

		System.out.println(productRepository.save(product));
	}

	@Test
	void testRepository2() {
		//List<Product> products = productRepository.findAll();
		//List<Product> products = productRepository.findByTitle("Dairy Milk");
		//List<Product> products = productRepository.findFirst3ByQuantity(12); // we can use first or top keyword
		//List<Product> products = productRepository.findFirst2DistinctByQuantity(12);
		//int products = productRepository.countByQuantity(12);
		//int products = productRepository.countByCreatedAtAfter(LocalDateTime.of(2026,7,20,1,1,1));
		List<Product> products = productRepository.findByTitleLike("%Choco%");   //or we can use the containing subject predicate instead of Like operator.

		System.out.println(products);
	}

	@Test
	void testRepository3() {
		Optional<Product> optional = productRepository.findByTitleAndPrice("Amull Butter",BigDecimal.valueOf(99.99));
		System.out.println(optional.isPresent());
	}

}

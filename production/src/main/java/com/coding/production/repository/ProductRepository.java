package com.coding.production.repository;


import com.coding.production.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findByTitle(String title);

    List<Product> findFirst3ByQuantity(int quantity);

    List<Product> findFirst2DistinctByQuantity(int quantity);

    int countByQuantity(int quantity);

    int countByCreatedAtAfter(LocalDateTime date);

    List<Product> findByTitleLike(String title);


    @Query("select e from Product e where e.title=:title and e.price=:price")
    Optional<Product> findByTitleAndPrice(String title, BigDecimal price);


    List<Product> findByTitleContainingIgnoreCase(String title, Pageable pageable);
}

package com.coding.production.controller;


import com.coding.production.entity.Product;
import com.coding.production.repository.ProductRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.*;


import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping(path="/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @GetMapping
    public List<Product> getAllProducts(@RequestParam(defaultValue = "id") String sortBy,
                                        @RequestParam(defaultValue = "0") Integer pageNumber){
        //return productRepository.findAll(Sort.by(Sort.Direction.DESC,sortBy));
//        return productRepository.findAll(Sort.by(Sort.Order.asc(sortBy)
//        ,Sort.Order.desc("price")));

        return productRepository.findAll(PageRequest.of(pageNumber, 3,Sort.by(sortBy).descending())).getContent();
    }

    @GetMapping("/getTitle")
    public List<Product> getAllProducts(@RequestParam(defaultValue = "") String title,
                                        @RequestParam(defaultValue = "id") String sortBy,
                                        @RequestParam(defaultValue = "0") int pageNumber){

        return productRepository.findByTitleContainingIgnoreCase(title,PageRequest.of(pageNumber,5,Sort.by(sortBy).descending()));

    }
}

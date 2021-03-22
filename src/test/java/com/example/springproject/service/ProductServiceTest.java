package com.example.springproject.service;

import com.example.springproject.entity.Product;
import com.example.springproject.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    ProductRepository productRepository;

    @Test
    void saveProduct(){
        Product product = new Product();
        product.setPrice(1000);
        product.setName("이것은");
        product.setCount(100);

        productRepository.save(product);
    }

    @Test
    void findProduct(){
        productRepository.findAll();
    }
}

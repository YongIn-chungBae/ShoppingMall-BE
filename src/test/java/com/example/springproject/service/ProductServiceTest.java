package com.example.springproject.service;

import com.example.springproject.entity.ProductEntity;
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
        ProductEntity productEntity = new ProductEntity();
        productEntity.setPrice(1000);
        productEntity.setName("이것은");
        productEntity.setCount(100);

        productRepository.save(productEntity);
    }
}

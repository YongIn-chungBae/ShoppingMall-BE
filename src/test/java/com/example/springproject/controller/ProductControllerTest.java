package com.example.springproject.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ProductControllerTest {

    @Autowired
    ProductController productController;
    @Test
    void findAllProduct() {
        System.out.println(productController.findAllProduct());
    }

    @Test
    void findCategoryMain(){
        assertThat(productController.findProductMain().getStatusCodeValue()).isEqualTo(200);
    }

}
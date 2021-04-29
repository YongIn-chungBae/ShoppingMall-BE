package com.example.springproject.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductDetailControllerTest {

    @Autowired
    ProductDetailController productDetailController;

    @Test
    void getProductDetail() {
        productDetailController.getProductDetail(1L);
    }
}
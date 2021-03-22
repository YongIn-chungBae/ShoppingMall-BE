package com.example.springproject.service;

import com.example.springproject.repository.ProductEvaluationRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductEvaluationServiceTest {

    @Autowired
    ProductEvaluationRepository productEvaluationRepository;

    @Test
    void test(){
        productEvaluationRepository.findAll();
    }

}
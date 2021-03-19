package com.example.springproject.service;

import com.example.springproject.entity.OrderEntity;
import com.example.springproject.repository.OrderRepository;
import com.example.springproject.repository.ProductRepository;
import com.example.springproject.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class OrderServiceTest {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    UserRepository userRepository;

    @Test
    void test(){
        OrderEntity orderEntity = new OrderEntity();

        LocalDate currentDate = LocalDate.now();

        orderEntity.setProductIdx(1L);
        orderEntity.setUserIdx(1L);
        orderEntity.setCreatedTime(currentDate);

        orderRepository.save(orderEntity);
    }

}
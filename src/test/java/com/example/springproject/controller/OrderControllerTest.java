package com.example.springproject.controller;

import com.example.springproject.dto.OrderDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class OrderControllerTest {

    @Autowired
    OrderController orderController;

    @Test
    void productOrder() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setCreatedTime(LocalDate.now());
        orderDTO.setProductIdx(1L);
        orderDTO.setUserIdx(1L);
        orderDTO.setState("배송중");

        System.out.println(orderController.productOrder(orderDTO));
    }
}
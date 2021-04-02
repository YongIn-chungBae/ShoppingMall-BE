package com.example.springproject.service;

import com.example.springproject.dto.OrderDTO;
import com.example.springproject.entity.Order;
import com.example.springproject.entity.Product;
import com.example.springproject.entity.User;
import com.example.springproject.repository.OrderRepository;
import com.example.springproject.repository.ProductRepository;
import com.example.springproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    UserRepository userRepository;
    public Long productOrder(OrderDTO orderDTO) {
        Product product = productRepository.findByIdx(orderDTO.getProductIdx());
        User user = userRepository.findByIdx(orderDTO.getUserIdx());

        Order order = Order.builder()
                .createdTime(orderDTO.getCreatedTime())
                .state(orderDTO.getState())
                .productIdx(product)
                .userIdx(user)
                .build();

        return orderRepository.save(order).getIdx();
    }
}

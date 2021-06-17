package com.example.springproject.service;

import com.example.springproject.dto.OrderDTO;
import com.example.springproject.dto.OrderListDTO;
import com.example.springproject.entity.Order;
import com.example.springproject.entity.Product;
import com.example.springproject.entity.User;
import com.example.springproject.repository.OrderRepository;
import com.example.springproject.repository.ProductRepository;
import com.example.springproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

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

        productRepository.updateCount(orderDTO.getCount(), orderDTO.getProductIdx());
        Order order = Order.builder()
                .createdTime(LocalDate.now())
                .state("배송중")
                .productIdx(product)
                .userIdx(user)
                .build();

        return orderRepository.save(order).getIdx();
    }

    @Transactional
    public List<OrderListDTO> findOrderList(OrderDTO orderDTO) {
        User user = userRepository.findByIdx(orderDTO.getUserIdx());
        List<Order> orders = orderRepository.findByUserIdx(user);
        return orders.stream().map(OrderListDTO::toDTO).collect(Collectors.toList());
    }
}

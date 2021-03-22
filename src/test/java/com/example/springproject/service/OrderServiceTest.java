package com.example.springproject.service;

import com.example.springproject.entity.Order;
import com.example.springproject.entity.Product;
import com.example.springproject.entity.User;
import com.example.springproject.repository.OrderRepository;
import com.example.springproject.repository.ProductRepository;
import com.example.springproject.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

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
        Order order = new Order();

        LocalDate currentDate = LocalDate.now();
        List<User> userList = userRepository.findAll();
        List<Product> proList = productRepository.findAll();
        order.setProductIdx(proList.get(0));
        order.setUserIdx(userList.get(0));
        order.setCreatedTime(currentDate);

        orderRepository.save(order);
    }


    @Test
    void test2(){
        List<User>  userList = orderRepository.findUser();

        for (User user : userList) {
            System.out.println("testTest" + user.getName());
        }

    }

}
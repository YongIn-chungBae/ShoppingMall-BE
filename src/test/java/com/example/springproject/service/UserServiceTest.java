package com.example.springproject.service;

import com.example.springproject.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserRepository userRepository;
    @Test
    void registerUser() {
    }

    @Test
    void signUp() {
        userRepository.findAll();
    }
}
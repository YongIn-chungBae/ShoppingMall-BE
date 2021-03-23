package com.example.springproject.controller;

import com.example.springproject.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserControllerTest {

    @Autowired
    UserController userController;
    @Test
    void signUp() {
        User user2 = new User();
        user2.setId("test");
        user2.setName("test");
        user2.setPassword("test");
        user2.setEmail("test");
        try{
            userController.signUp(user2);
            System.out.println();
        }catch (Exception e){
            System.out.println("asdf"+e);
        }


    }
}
package com.example.springproject.controller;

import com.example.springproject.dto.UserDTO;
import com.example.springproject.entity.User;
import com.example.springproject.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserControllerTest {

    @Autowired
    UserController userController;

    @Autowired
    UserRepository userRepository;

    @Test
    void signUp() {
        UserDTO user2 = new UserDTO();
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

    @Test
    void signIn() throws Exception {

        User user = userRepository.findByIdx(1L);
        System.out.println(user.getName());
//        System.out.println(userController.signIn(user));
    }

}
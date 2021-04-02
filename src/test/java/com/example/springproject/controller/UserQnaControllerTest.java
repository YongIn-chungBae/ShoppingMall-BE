package com.example.springproject.controller;

import com.example.springproject.dto.UserQnaDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserQnaControllerTest {

    @Autowired
    UserQnaController userQnaController;
    @Test
    void saveQna() {
        UserQnaDTO userQnaDTO = new UserQnaDTO();
        userQnaDTO.setContent("test");
        userQnaDTO.setTitle("asdfa");
        userQnaDTO.setUserIdx(1L);


        System.out.println(userQnaController.saveQna(userQnaDTO));
    }
}
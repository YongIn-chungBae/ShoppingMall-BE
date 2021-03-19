package com.example.springproject.controller;


import com.example.springproject.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class UserController {

    @Autowired
    UserService userService;

//    private UserService userService;
//    @PostMapping("/sign-up")
//    public String write(UserDto userDto) {
//        userService.signUp(userDto);
//
//        return "성공";
//    }
}

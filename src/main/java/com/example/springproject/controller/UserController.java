package com.example.springproject.controller;


import com.example.springproject.entity.User;
import com.example.springproject.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/sign-up")
    public void signUp(User user) throws Exception {
        try{
            userService.signUp(user);
        }catch (Exception e){
            System.out.println("error test"+e);
        }

    }

    @GetMapping("/test")
    public String test(){
        System.out.println("Hi!");
        return "home/login.html";
    }
}

package com.example.springproject.controller;


import com.example.springproject.entity.User;
import com.example.springproject.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/sign-up")
    public void signUp(@RequestBody User user) throws Exception {
        try{
            userService.signUp(user);
        }catch (Exception e){
            System.out.println("error test"+e);
        }
    }

//    @PostMapping("/sign-in")
//    public boolean signIn(@RequestBody User user) throws Exception{
//        try{
//
//        }catch (Exception e){
//
//        }
//
//    }

    @GetMapping("/test")
    public String test(){
        System.out.println("Hi!");
        return "home/login.html";
    }
}

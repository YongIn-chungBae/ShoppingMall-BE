package com.example.springproject.controller;


import com.example.springproject.entity.User;
import com.example.springproject.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
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

    @PostMapping("/sign-in")
    public boolean signIn(@RequestBody User user) throws Exception{
        try{
            return userService.signIn(user);
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    @GetMapping("/test")
    public String test(){
        System.out.println("Hi!");
        return "dhdhdhdh";
    }
}

package com.example.springproject.controller;


import com.example.springproject.dto.UserDTO;
import com.example.springproject.service.UserService;
import com.example.springproject.util.message.Message;
import com.example.springproject.util.message.StatusEnum;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/sign-up")
    public ResponseEntity signUp(@RequestBody UserDTO userDTO) throws Exception {
            return new ResponseEntity(new Message(userService.signUp(userDTO), StatusEnum.OK) , HttpStatus.OK);
    }

    @PostMapping("/sign-in")
    public boolean signIn(@RequestBody UserDTO userDTO) throws Exception{
        try{
            return userService.signIn(userDTO);
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

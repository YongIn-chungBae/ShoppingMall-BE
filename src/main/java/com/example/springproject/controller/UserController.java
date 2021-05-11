package com.example.springproject.controller;


import com.example.springproject.dto.UserDTO;
import com.example.springproject.service.UserService;
import com.example.springproject.util.message.Message;
import com.example.springproject.util.message.StatusEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@Api(tags = "유저", description = "회원가입 | 로그인")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "회원가입")
    @PostMapping("/sign-up")
    public ResponseEntity signUp(@RequestBody UserDTO userDTO) throws Exception {
            return new ResponseEntity(new Message(userService.signUp(userDTO), StatusEnum.OK) , HttpStatus.OK);
    }

    @ApiOperation(value = "로그인")
    @PostMapping("/sign-in")
    public boolean signIn(@RequestBody UserDTO userDTO) throws Exception{
        try{
            return userService.signIn(userDTO);
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
}

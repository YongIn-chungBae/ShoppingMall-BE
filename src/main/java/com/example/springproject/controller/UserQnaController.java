package com.example.springproject.controller;

import com.example.springproject.dto.UserQnaDTO;
import com.example.springproject.service.UserQnaService;
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
public class UserQnaController {

    @Autowired
    UserQnaService userQnaService;

    @PostMapping("/qna/register")
    public ResponseEntity saveQna(@RequestBody UserQnaDTO userQnaDTO){
        return new ResponseEntity(new Message(userQnaService.saveQna(userQnaDTO), StatusEnum.OK), HttpStatus.OK);
    }

    @GetMapping("/qna/findAll")
    public ResponseEntity findQnaAll(){
        return new ResponseEntity(new Message(userQnaService.findAllQna(), StatusEnum.OK), HttpStatus.OK);
    }

}

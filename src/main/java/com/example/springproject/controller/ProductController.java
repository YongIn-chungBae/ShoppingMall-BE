package com.example.springproject.controller;

import com.example.springproject.service.ProductService;
import com.example.springproject.util.message.Message;
import com.example.springproject.util.message.StatusEnum;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/productList")
    public ResponseEntity findAllProduct() {
        return new ResponseEntity(new Message(productService.findAllProduct(), StatusEnum.OK) , HttpStatus.OK);
    }
}

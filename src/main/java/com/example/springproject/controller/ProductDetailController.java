package com.example.springproject.controller;

import com.example.springproject.service.ProductDetailService;
import com.example.springproject.util.message.Message;
import com.example.springproject.util.message.StatusEnum;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class ProductDetailController {

    @Autowired
    ProductDetailService productDetailService;

    @GetMapping("/productDetail")
    public ResponseEntity getProductDetail(@RequestParam("productIdx") Long productIdx){
        return new ResponseEntity(new Message(productDetailService.getProductDetail(productIdx), StatusEnum.OK), HttpStatus.OK);

    }
}

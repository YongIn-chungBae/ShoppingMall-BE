package com.example.springproject.controller;

import com.example.springproject.service.ProductService;
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
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/productList")
    public ResponseEntity findAllProduct() {
        return new ResponseEntity(new Message(productService.findAllProduct(), StatusEnum.OK) , HttpStatus.OK);
    }

    @GetMapping("/product/category/main")
    public ResponseEntity findProductMain(){
        return new ResponseEntity(new Message(productService.findProductMain(), StatusEnum.OK), HttpStatus.OK);
    }

    @GetMapping("/product/category")
    public ResponseEntity findProductCategory(@RequestParam("category") String category){
        return new ResponseEntity(new Message(productService.findProductCategory(category), StatusEnum.OK), HttpStatus.OK);
    }


}

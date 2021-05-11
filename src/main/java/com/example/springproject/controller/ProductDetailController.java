package com.example.springproject.controller;

import com.example.springproject.service.ProductDetailService;
import com.example.springproject.util.message.Message;
import com.example.springproject.util.message.StatusEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "제품 상세", description = "제품 상세보기")
public class ProductDetailController {

    @Autowired
    ProductDetailService productDetailService;

    @ApiOperation(value = "제품 상세보기")
    @GetMapping("/productDetail")
    public ResponseEntity getProductDetail(@RequestParam("productIdx") Long productIdx){
        return new ResponseEntity(new Message(productDetailService.getProductDetail(productIdx), StatusEnum.OK), HttpStatus.OK);

    }
}

package com.example.springproject.controller;

import com.example.springproject.repository.ShoppingCartRepository;
import com.example.springproject.service.ShoppingCartService;
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
@Api(tags = "장바구니", description = "장바구니 담기 | 장바구니 리스트 가져오기")
public class ShoppingCartController {
    @Autowired
    ShoppingCartService shoppingCartService;

    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    @ApiOperation(value = "장바구니 리스트 가져오기")
    @GetMapping("/shoppingCartList")
    public ResponseEntity findAllProduct(@RequestParam("userIdx") Long userIdx) {
        System.out.println(userIdx);
        return new ResponseEntity(new Message(shoppingCartService.findShoppingCartList(userIdx), StatusEnum.OK) , HttpStatus.OK);
    }

}

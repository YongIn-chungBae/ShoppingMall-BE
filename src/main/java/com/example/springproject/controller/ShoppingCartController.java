package com.example.springproject.controller;

import com.example.springproject.entity.Product;
import com.example.springproject.entity.User;
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
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity findAllShoppingCart(@RequestParam("userIdx") User user) {
        return new ResponseEntity(new Message(shoppingCartService.findShoppingCartList(user), StatusEnum.OK) , HttpStatus.OK);
    }

    @ApiOperation(value = "장바구니 담기")
    @PostMapping("/shoppingCart/save")
    public ResponseEntity saveShoppingCart(@RequestParam("userIdx") User user, @RequestParam("productIdx") Product product) {
        return new ResponseEntity(new Message(shoppingCartService.saveShoppingCart(user, product), StatusEnum.OK) , HttpStatus.OK);
    }

    @ApiOperation(value = "장바구니 제품 삭제")
    @PostMapping("/shoppingCart/delete")
    public ResponseEntity deleteShoppingCart(@RequestParam("shopping_cart_idx") Long shoppingCartIdx) {
        return new ResponseEntity(new Message(shoppingCartService.deleteShoppingCart(shoppingCartIdx), StatusEnum.OK) , HttpStatus.OK);
    }

}

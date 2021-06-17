package com.example.springproject.controller;

import com.example.springproject.dto.OrderDTO;
import com.example.springproject.service.OrderService;
import com.example.springproject.util.message.Message;
import com.example.springproject.util.message.StatusEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Api(tags = "주문", description = "주문하기")
public class OrderController {

    @Autowired
    OrderService orderService;

    @ApiOperation(value = "주문하기")
    @PostMapping("order/buy")
    public ResponseEntity productOrder(@RequestBody OrderDTO orderDTO){
        return new ResponseEntity(new Message(orderService.productOrder(orderDTO), StatusEnum.OK), HttpStatus.OK);
    }

    @ApiOperation(value = "주문내역 리스트 가져오기")
    @GetMapping("order/List")
    public ResponseEntity findOrderList(@RequestBody OrderDTO orderDTO){
        return new ResponseEntity(new Message(orderService.findOrderList(orderDTO), StatusEnum.OK), HttpStatus.OK);
    }
}

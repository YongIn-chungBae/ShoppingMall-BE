package com.example.springproject.controller;

import com.example.springproject.dto.OrderDTO;
import com.example.springproject.service.OrderService;
import com.example.springproject.util.message.Message;
import com.example.springproject.util.message.StatusEnum;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@AllArgsConstructor
public class OrderController {

    @Autowired
    OrderService orderService;
    @PostMapping("order/buy")
    public ResponseEntity productOrder(@RequestBody OrderDTO orderDTO){
        return new ResponseEntity(new Message(orderService.productOrder(orderDTO), StatusEnum.OK), HttpStatus.OK);
    }
}

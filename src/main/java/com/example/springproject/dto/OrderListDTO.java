package com.example.springproject.dto;

import com.example.springproject.entity.Order;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class OrderListDTO {
    private Long idx;
    private LocalDate createdTime;
    private String productName;
    private String productImage;
    private int productPrice;
    private int productCount;

    public static OrderListDTO toDTO(Order order){
        OrderListDTO orderListDTO = new OrderListDTO();
        orderListDTO.setIdx(order.getIdx());
        orderListDTO.setCreatedTime(order.getCreatedTime());
        orderListDTO.setProductName(order.getProductIdx().getName());
        orderListDTO.setProductImage(order.getProductIdx().getImage());
        orderListDTO.setProductPrice(order.getProductIdx().getPrice());
        orderListDTO.setProductCount(order.getProductIdx().getCount());

        return orderListDTO;
    }
}

package com.example.springproject.dto;

import com.example.springproject.entity.ShoppingCart;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class ShoppingCartDTO {
    private Long idx;
    private LocalDate createdTime;
    private Long productIdx;
    private Long userIdx;


    public static ShoppingCartDTO toDTO(ShoppingCart shoppingCart){
        ShoppingCartDTO shoppingCartDTO = new ShoppingCartDTO();
        shoppingCartDTO.setCreatedTime(shoppingCart.getCreatedTime());
        shoppingCartDTO.setIdx(shoppingCart.getIdx());
        shoppingCartDTO.setProductIdx(shoppingCart.getProductIdx().getIdx());
        shoppingCartDTO.setUserIdx(shoppingCart.getUserIdx().getIdx());


        return shoppingCartDTO;
    }
}

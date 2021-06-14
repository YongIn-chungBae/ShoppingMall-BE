package com.example.springproject.dto;

import com.example.springproject.entity.ShoppingCart;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class ShoppingCartDTO {
    private Long idx;
    private LocalDate createdTime;
    private ProductDTO productDTO;
    private Long userIdx;


    public static ShoppingCartDTO toDTO(ShoppingCart shoppingCart, ProductDTO productDTO){
        ShoppingCartDTO shoppingCartDTO = new ShoppingCartDTO();
        shoppingCartDTO.setCreatedTime(shoppingCart.getCreatedTime());
        shoppingCartDTO.setIdx(shoppingCart.getIdx());
        shoppingCartDTO.setProductDTO(productDTO);
        shoppingCartDTO.setUserIdx(shoppingCart.getUserIdx().getIdx());


        return shoppingCartDTO;
    }
}

package com.example.springproject.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductDTO {
    private Long idx;
    private String name;
    private int count;
    private int price;
    private String image;
}

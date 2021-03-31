package com.example.springproject.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class ShoppingCartDTO {
    private Long idx;
    private LocalDate createdTime;
    private Long productIdx;
    private Long userIdx;
}

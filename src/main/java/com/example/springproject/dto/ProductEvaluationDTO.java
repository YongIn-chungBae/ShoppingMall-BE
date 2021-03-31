package com.example.springproject.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class ProductEvaluationDTO {
    private Long idx;
    private LocalDate createdTime;
    private int rate;
    private Long productIdx;
    private Long userIdx;
}

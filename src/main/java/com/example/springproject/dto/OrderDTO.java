package com.example.springproject.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class OrderDTO {
    private Long idx;
    private LocalDate createdTime;
    private String state;
    private int count;
    private Long productIdx;
    private Long userIdx;

    @Override
    public String toString() {
        return "OrderDTO{" +
                "idx=" + idx +
                ", createdTime=" + createdTime +
                ", state='" + state + '\'' +
                ", count=" + count +
                ", productIdx=" + productIdx +
                ", userIdx=" + userIdx +
                '}';
    }
}

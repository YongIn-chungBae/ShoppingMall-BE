package com.example.springproject.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserQnaDTO {
    private Long idx;
    private String title;
    private String content;
    private Long userIdx;
}

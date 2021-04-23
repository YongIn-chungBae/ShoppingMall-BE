package com.example.springproject.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class NoticeDTO {
    private Long idx;
    private LocalDate createdTime;
    private String title;
    private String content;
    private int reference;
    private Long userIdx;

}

package com.example.springproject.dto;

import com.example.springproject.entity.UserQna;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class UserQnaDTO {
    private Long idx;
    private String title;
    private String content;
    private Long userIdx;
    private String userName;
    private String reply;
    private LocalDate createTime;

    public static UserQnaDTO toDTO(UserQna userQna){
        UserQnaDTO userQnaDTO = new UserQnaDTO();
        userQnaDTO.setIdx(userQna.getIdx());
        userQnaDTO.setTitle(userQna.getTitle());
        userQnaDTO.setContent(userQna.getContent());
        userQnaDTO.setUserName(userQna.getUserIdx().getName());
        userQnaDTO.setReply(userQna.getReply());
        userQnaDTO.setCreateTime(userQna.getCreatedTime());
        userQnaDTO.setUserIdx(userQna.getUserIdx().getIdx());
        return userQnaDTO;
    }
}

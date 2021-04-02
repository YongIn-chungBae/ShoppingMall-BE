package com.example.springproject.dto;

import com.example.springproject.entity.UserQna;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserQnaDTO {
    private Long idx;
    private String title;
    private String content;
    private Long userIdx;

    public static UserQnaDTO toDTO(UserQna userQna){
        UserQnaDTO userQnaDTO = new UserQnaDTO();
        userQnaDTO.setIdx(userQna.getIdx());
        userQnaDTO.setTitle(userQna.getTitle());
        userQnaDTO.setContent(userQna.getContent());
        userQnaDTO.setUserIdx(userQna.getUserIdx().getIdx());

        return userQnaDTO;
    }
}

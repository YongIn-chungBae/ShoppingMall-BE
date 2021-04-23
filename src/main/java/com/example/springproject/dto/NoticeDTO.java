package com.example.springproject.dto;

import com.example.springproject.entity.Notice;
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

    public static NoticeDTO toDTO(Notice notice){
        NoticeDTO noticeDTO = new NoticeDTO();
        noticeDTO.setIdx(notice.getIdx());
        noticeDTO.setContent(notice.getContent());
        noticeDTO.setCreatedTime(notice.getCreatedTime());
        noticeDTO.setReference(notice.getReference());
        noticeDTO.setTitle(notice.getTitle());
        noticeDTO.setUserIdx(notice.getUserIdx().getIdx());

        return noticeDTO;
    }
}

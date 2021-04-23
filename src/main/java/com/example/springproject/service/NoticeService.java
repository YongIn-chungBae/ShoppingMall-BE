package com.example.springproject.service;

import com.example.springproject.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {
    @Autowired
    NoticeRepository noticeRepository;

//    public List<NoticeDTO> findNoticeList() {
//        List<Notice> notices = noticeRepository.findAll();
//        List<NoticeDTO> noticeDTOs;
//        for(Notice notice : notices){
//            NoticeDTO noticeDTO = new NoticeDTO();
//            noticeDTO.setUserIdx(notice.getUserIdx().getIdx());
//
//
//        }
//        return notices.stream().map(NoticeDTO::toDTO).collect(Collectors.toList());
//    }
}

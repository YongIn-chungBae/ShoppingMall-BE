package com.example.springproject.service;

import com.example.springproject.dto.NoticeDTO;
import com.example.springproject.dto.UserDTO;
import com.example.springproject.entity.Notice;
import com.example.springproject.entity.User;
import com.example.springproject.repository.NoticeRepository;
import com.example.springproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoticeService {
    @Autowired
    NoticeRepository noticeRepository;

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    public ArrayList<NoticeDTO> findNoticeList() {
        List<Notice> notices = noticeRepository.findAll();
        ArrayList<NoticeDTO> noticeDTOs = new ArrayList<>();
        for(Notice notice : notices){
            NoticeDTO noticeDTO = new NoticeDTO();
            noticeDTO.setUserIdx(notice.getUserIdx().getIdx());
            noticeDTO.setTitle(notice.getTitle());
            noticeDTO.setReference(notice.getReference());
            noticeDTO.setCreatedTime(notice.getCreatedTime());
            noticeDTO.setContent(notice.getContent());
            noticeDTO.setIdx(notice.getIdx());

            UserDTO userDTO = userService.getUserInfo(notice.getUserIdx().getIdx());
            noticeDTO.setUserName(userDTO.getName());
            noticeDTOs.add(noticeDTO);
        }
        return noticeDTOs;
    }

    public Long saveNotice(NoticeDTO noticeDTO) {
        User user = userRepository.findByIdx(noticeDTO.getUserIdx());

        Notice notice = Notice.builder()
                .content(noticeDTO.getContent())
                .title(noticeDTO.getTitle())
                .userIdx(user)
                .build();

        return noticeRepository.save(notice).getIdx();
    }
}

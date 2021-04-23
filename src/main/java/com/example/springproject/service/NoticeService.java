package com.example.springproject.service;

import com.example.springproject.dto.NoticeDTO;
import com.example.springproject.entity.Notice;
import com.example.springproject.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NoticeService {
    @Autowired
    NoticeRepository noticeRepository;

    public List<NoticeDTO> findNoticeList() {
        List<Notice> notices = noticeRepository.findAll();
        return notices.stream().map(NoticeDTO::toDTO).collect(Collectors.toList());
    }
}

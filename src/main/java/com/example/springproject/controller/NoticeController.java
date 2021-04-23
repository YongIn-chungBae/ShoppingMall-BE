package com.example.springproject.controller;

import com.example.springproject.service.NoticeService;
import com.example.springproject.util.message.Message;
import com.example.springproject.util.message.StatusEnum;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class NoticeController {
    @Autowired
    NoticeService noticeService;

    @GetMapping("/noticeList")
    public ResponseEntity findNoticeList(){
        return new ResponseEntity(new Message(noticeService.findNoticeList(), StatusEnum.OK), HttpStatus.OK);
    }

}

package com.example.springproject.controller;

import com.example.springproject.dto.NoticeDTO;
import com.example.springproject.service.NoticeService;
import com.example.springproject.util.message.Message;
import com.example.springproject.util.message.StatusEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Api(tags = "공지사항", description = "공지사항 가져오기")
@CrossOrigin(origins = "*")
public class NoticeController {
    @Autowired
    NoticeService noticeService;

    @GetMapping("/noticeList")
    @ApiOperation(value = "공지사항 가져오기")
    public ResponseEntity findNoticeList(){
        return new ResponseEntity(new Message(noticeService.findNoticeList(), StatusEnum.OK), HttpStatus.OK);
    }

    @PostMapping("/notice/save")
    @ApiOperation(value = "공지사항 등록하기")
    public ResponseEntity saveNotice(@RequestBody NoticeDTO noticeDTO){
        return new ResponseEntity(new Message(noticeService.saveNotice(noticeDTO), StatusEnum.OK), HttpStatus.OK);
    }

}

package com.example.springproject.controller;

import com.example.springproject.dto.UserQnaDTO;
import com.example.springproject.service.UserQnaService;
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
@CrossOrigin(origins = "*")
@Api(tags = "유저 Q&A", description = "Q&A 등록하기 | Q&A 리스트 가져오기")
public class UserQnaController {

    @Autowired
    UserQnaService userQnaService;

    @ApiOperation(value = "Q&A 등록하기")
    @PostMapping("/qna/register")
    public ResponseEntity saveQna(@RequestBody UserQnaDTO userQnaDTO){
        return new ResponseEntity(new Message(userQnaService.saveQna(userQnaDTO), StatusEnum.OK), HttpStatus.OK);
    }

    @ApiOperation(value = "Q&A 리스트 가져오기")
    @GetMapping("/qna/findAll")
    public ResponseEntity findQnaAll(){
        return new ResponseEntity(new Message(userQnaService.findAllQna(), StatusEnum.OK), HttpStatus.OK);
    }
    @ApiOperation(value = "Q&A 댓글 달기")
    @PostMapping("/qna/reply")
    public ResponseEntity replyQna(@RequestParam String replyContent, @RequestParam Long qnaIdx){
        return new ResponseEntity(new Message(userQnaService.replyQna(replyContent, qnaIdx), StatusEnum.OK), HttpStatus.OK);
    }

    @ApiOperation(value = "Q&A 상세보기")
    @GetMapping("/qna/detail")
    public ResponseEntity qnaDetail(@RequestParam Long qnaIdx){
        return new ResponseEntity(new Message(userQnaService.qnaDetail(qnaIdx), StatusEnum.OK), HttpStatus.OK);
    }

}

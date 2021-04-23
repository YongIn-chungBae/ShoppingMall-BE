package com.example.springproject.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class NoticeControllerTest {

    @Autowired
    NoticeController noticeController;

    @Test
    void findNoticeList() {
        System.out.println(noticeController.findNoticeList());
    }
}
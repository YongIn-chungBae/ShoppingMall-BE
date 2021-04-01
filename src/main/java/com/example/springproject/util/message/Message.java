package com.example.springproject.util.message;

import lombok.Data;

@Data
public class Message {
    private StatusEnum status;
    private String message;
    private Object data;

    public Message(){
        this.status = StatusEnum.BAD_REQUEST;
        this.data = null;
        this.message = null;
    }
    public Message(Object result, StatusEnum status){
        this.data = result;
        this.message = "잘됩니다.";
        this.status = status;
    }
}

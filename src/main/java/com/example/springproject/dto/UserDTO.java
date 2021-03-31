package com.example.springproject.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDTO {
    private Long idx;
    private String id;
    private String password;
    private String name;
    private String email;
}

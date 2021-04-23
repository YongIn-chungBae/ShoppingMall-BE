package com.example.springproject.dto;

import com.example.springproject.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDTO {
    private Long idx;
    private String id;
    private String password;
    private String name;
    private String email;

    public static UserDTO toDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setEmail(user.getEmail());
        userDTO.setIdx(user.getIdx());
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setPassword(user.getPassword());

        return userDTO;
    }
}

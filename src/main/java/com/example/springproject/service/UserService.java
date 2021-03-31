package com.example.springproject.service;

import com.example.springproject.dto.UserDTO;
import com.example.springproject.entity.User;
import com.example.springproject.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    OrderService orderService;


    @Transactional
    public Long signUp(UserDTO userDTO) {
        User user = User.builder()
                .email(userDTO.getEmail())
                .password(userDTO.getPassword())
                .name(userDTO.getName())
                .id(userDTO.getId())
                .build();

        return userRepository.save(user).getIdx();
    }


    @Transactional
    public Boolean signIn(UserDTO user){
        User signInUser = userRepository.findByIdAndPassword(user.getId(), user.getPassword());
        return signInUser != null;
    }

//    @Transactional
//    public Long signUp(UserDto userDto){
//        return userRepository.save(userDto.toEntity()).getIdx();
//    }

}

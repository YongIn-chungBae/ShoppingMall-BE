package com.example.springproject.service;

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
    public Long signUp(User user) {
        return userRepository.save(user).getIdx();
    }


//    @Transactional
//    public UserDto signIn(){
//        UserEntity userEntity
//    }

//    @Transactional
//    public Long signUp(UserDto userDto){
//        return userRepository.save(userDto.toEntity()).getIdx();
//    }

}

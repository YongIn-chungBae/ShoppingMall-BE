package com.example.springproject.service;

import com.example.springproject.dto.UserQnaDTO;
import com.example.springproject.entity.User;
import com.example.springproject.entity.UserQna;
import com.example.springproject.repository.UserQnaRepository;
import com.example.springproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserQnaService {

    @Autowired
    UserQnaRepository userQnaRepository;

    @Autowired
    UserRepository userRepository;

    public Long saveQna(UserQnaDTO userQnaDTO) {
        User user = userRepository.findByIdx(userQnaDTO.getUserIdx());

        UserQna userQna = UserQna.builder()
                .Idx(userQnaDTO.getIdx())
                .content(userQnaDTO.getContent())
                .title(userQnaDTO.getTitle())
                .user(user)
                .build();

        return userQnaRepository.save(userQna).getIdx();
    }

    @Transactional
    public List<UserQnaDTO> findAllQna() {
        return userQnaRepository.findAll().stream().map(UserQnaDTO::toDTO).collect(Collectors.toList());
    }

    public int replyQna(String replyContent, Long qnaIdx) {
        System.out.println(replyContent+qnaIdx);
        return userQnaRepository.updateReply(replyContent, qnaIdx);
    }

    public UserQnaDTO qnaDetail(Long qnaIdx) {
        return UserQnaDTO.toDTO(userQnaRepository.findByIdx(qnaIdx));
    }
}

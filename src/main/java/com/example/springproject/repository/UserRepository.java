package com.example.springproject.repository;

import com.example.springproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByIdAndPassword(String id, String password);

    User findByIdx(Long idx);
}

package com.example.springproject.repository;

import com.example.springproject.entity.UserQna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserQnaRepository extends JpaRepository<UserQna, Long> {
}

package com.example.springproject.repository;

import com.example.springproject.entity.UserQna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface UserQnaRepository extends JpaRepository<UserQna, Long> {

    @Transactional
    @Modifying
    @Query("UPDATE UserQna qna SET qna.reply = :reply WHERE qna.idx = :idx")
    int updateReply(@RequestParam("reply") String reply,@RequestParam("idx") Long idx);
}

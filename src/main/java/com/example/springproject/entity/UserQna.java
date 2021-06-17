package com.example.springproject.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user_qna")
public class UserQna {
    @Id
    @Column(name = "user_qna_idx") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "user_qna_title")
    private String title;

    @Column(name = "user_qna_content")
    private String content;

    @Column(name = "user_qna_reply")
    private String reply;

    @Column(name = "user_qna_date")
    private LocalDate createdTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_idx")
    private User userIdx;

    @Builder
    public UserQna(Long Idx, String title, String content, User user, String reply){
        this.idx = Idx;
        this.title = title;
        this.content = content;
        this.userIdx = user;
        this.reply = reply;
        this.createdTime = LocalDate.now();
    }
}

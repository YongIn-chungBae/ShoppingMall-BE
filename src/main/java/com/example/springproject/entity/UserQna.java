package com.example.springproject.entity;

import lombok.*;

import javax.persistence.*;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_idx")
    private User userIdx;

    @Builder
    public UserQna(Long Idx, String title, String content, User user){
        this.idx = Idx;
        this.title = title;
        this.content = content;
        this.userIdx = user;
    }
}

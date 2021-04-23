package com.example.springproject.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter @Setter
@NoArgsConstructor
@Table(name = "notice")
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notice_idx")
    private Long idx;

    @Column(name = "notice_time")
    private LocalDate createdTime;

    @Column(name = "notice_title")
    private String title;

    @Column(name = "notice_content")
    private String content;

    @Column(name = "notice_reference")
    private int reference;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_idx")
    private User userIdx;

    @Builder
    public Notice(Long idx, LocalDate createdTime, String title, String content, int reference, User userIdx){
        this.idx = idx;
        this.createdTime = createdTime;
        this.title = title;
        this.content = content;
        this.reference = reference;
        this.userIdx = userIdx;
    }
}

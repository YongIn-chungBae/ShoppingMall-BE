package com.example.springproject.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name = "order_")
public class Order {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_idx")
    private Long idx;

    @Column(name = "order_time")
    private LocalDate createdTime;

    @Column(name = "order_state")
    private String state;

    @Column(name = "order_count")
    private int count;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_idx")
    private Product productIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_idx")
    private User userIdx;

    @Builder
    public Order(Long idx, LocalDate createdTime, String state, int count, Product productIdx, User userIdx){
        this.idx = idx;
        this.createdTime = createdTime;
        this.state = state;
        this.productIdx = productIdx;
        this.userIdx = userIdx;
        this.count = count;
    }
}

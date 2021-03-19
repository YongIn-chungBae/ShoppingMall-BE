package com.example.springproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Table(name = "order_")
public class OrderEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_idx")
    private Long idx;

    @Column(name = "order_time")
    private LocalDate createdTime;

    @ManyToOne
    @JoinColumn(name = "product_idx")
    private Long productIdx;

    @ManyToOne
    @JoinColumn(name = "user_idx")
    private Long userIdx;
}

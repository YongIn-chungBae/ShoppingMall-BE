package com.example.springproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_evaluation")
public class ProductEvaluation {

    @Id
    @Column(name = "product_evaluation_idx") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "product_evaluation_content")
    private LocalDate createdTime;

    @Column(name = "product_evaluation_rate")
    private int rate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_idx")
    private Product productIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_idx")
    private User userIdx;
}

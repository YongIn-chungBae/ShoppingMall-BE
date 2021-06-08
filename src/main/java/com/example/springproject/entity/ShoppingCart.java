package com.example.springproject.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "shopping_cart")
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shopping_cart_idx")
    private Long idx;

    @Column(name = "shopping_cart_time")
    private LocalDate createdTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_idx")
    private Product productIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_idx")
    private User userIdx;

    @Builder
    public ShoppingCart(User user, Product product){
        this.productIdx = product;
        this.userIdx = user;
        this.createdTime = LocalDate.now();
    }
}

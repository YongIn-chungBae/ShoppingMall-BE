package com.example.springproject.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_idx")
    private Long idx;

    @Column(name = "user_id")
    private String id;

    @Column(name = "user_pwd")
    private String password;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_email")
    private String email;

    @OneToMany(mappedBy = "userIdx")
    List<Order> orders = new ArrayList<>();

    @OneToMany(mappedBy = "userIdx")
    List<ShoppingCart> shoppingCarts = new ArrayList<>();

    @OneToMany(mappedBy = "userIdx")
    List<ProductEvaluation> productEvaluations = new ArrayList<>();
}

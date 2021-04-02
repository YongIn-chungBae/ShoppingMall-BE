package com.example.springproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "product_idx") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_count")
    private int count;

    @Column(name = "product_price")
    private int price;

    @Column(name = "product_image")
    private String image;

    @Column(name = "product_category")
    private String category;

    @OneToMany(mappedBy = "productIdx")
    private List<Order> orders = new ArrayList<>();

    @OneToMany(mappedBy = "productIdx")
    private List<ShoppingCart> shoppingCarts = new ArrayList<>();

    @OneToMany(mappedBy = "productIdx")
    private List<ProductEvaluation> productEvaluations = new ArrayList<>();
}

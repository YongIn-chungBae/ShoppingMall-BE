package com.example.springproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class ProductEntity {
    @Id
    @Column(name = "product_idx") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_count")
    private int count;

    @Column(name = "product_price")
    private int price;


}

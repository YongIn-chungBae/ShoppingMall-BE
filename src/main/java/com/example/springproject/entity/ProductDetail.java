package com.example.springproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_detail")
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_detail_idx")
    private Long idx;

    @Column(name = "product_detail_style")
    private String style;

    @Column(name = "product_detail_color")
    private String color;

    @Column(name = "product_detail_material")
    private String material;

    @Column(name = "product_detail_size")
    private String size;

    @Column(name = "product_detail_country")
    private String country;

    @Column(name = "product_detail_md")
    private String md;

    @Column(name = "product_detail_period")
    private String period;

    @Column(name = "product_detail_explanation_title")
    private String title;

    @Column(name = "product_detail_explanation_content")
    private String content;

    @Column(name = "product_detail_image")
    private String image;

    @JoinColumn(name = "product_idx")
    private Long productIdx;


    @Override
    public String toString() {
        return "ProductDetail{" +
                "idx=" + idx +
                ", style='" + style + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", country='" + country + '\'' +
                ", md='" + md + '\'' +
                ", period='" + period + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", productIdx=" + productIdx +
                '}';
    }
}

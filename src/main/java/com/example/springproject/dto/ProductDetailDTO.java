package com.example.springproject.dto;

import com.example.springproject.entity.Product;
import com.example.springproject.entity.ProductDetail;
import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
public class ProductDetailDTO {
    private Long idx;
    private String style;
    private String color;
    private String material;
    private String size;
    private String country;
    private String md;
    private String period;
    private String title;
    private String content;
    private Long productIdx;
    private String productName;

    public static ProductDetailDTO toDTO(ProductDetail productDetail, Product product){
        ProductDetailDTO productDetailDTO = new ProductDetailDTO();
        productDetailDTO.setIdx(productDetail.getIdx());
        productDetailDTO.setStyle(productDetail.getStyle());
        productDetailDTO.setColor(productDetail.getColor());
        productDetailDTO.setMaterial(productDetail.getMaterial());
        productDetailDTO.setSize(productDetail.getSize());
        productDetailDTO.setCountry(productDetail.getCountry());
        productDetailDTO.setMd(productDetail.getMd());
        productDetailDTO.setPeriod(productDetail.getPeriod());
        productDetailDTO.setTitle(productDetail.getTitle());
        productDetailDTO.setContent(productDetail.getContent());
        productDetailDTO.setProductIdx(product.getIdx());
        productDetailDTO.setProductName(product.getName());

        return productDetailDTO;
    }
}

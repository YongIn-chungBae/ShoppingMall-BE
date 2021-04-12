package com.example.springproject.dto;

import com.example.springproject.entity.Product;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductDTO {
    private Long idx;
    private String name;
    private int count;
    private int price;
    private String image;
    private String category;
    private String bpCategory;

    public static ProductDTO toDTO(Product product){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setIdx(product.getIdx());
        productDTO.setCount(product.getCount());
        productDTO.setImage(product.getImage());
        productDTO.setName(product.getName());
        productDTO.setPrice(product.getPrice());
        productDTO.setCategory(product.getCategory());
        productDTO.setBpCategory(product.getBpCategory());

        return productDTO;
    }
}

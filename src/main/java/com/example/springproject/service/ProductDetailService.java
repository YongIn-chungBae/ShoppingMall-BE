package com.example.springproject.service;

import com.example.springproject.dto.ProductDetailDTO;
import com.example.springproject.entity.Product;
import com.example.springproject.entity.ProductDetail;
import com.example.springproject.repository.ProductDetailRepository;
import com.example.springproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailService {

    @Autowired
    ProductDetailRepository productDetailRepository;

    @Autowired
    ProductRepository productRepository;

    public ProductDetailDTO getProductDetail(Long productIdx) {
        Product product = productRepository.findByIdx(productIdx);
        ProductDetail productDetail  = productDetailRepository.findByProductIdx(productIdx);
        ProductDetailDTO productDTO;
        productDTO = ProductDetailDTO.toDTO(productDetail, product);

        return productDTO;
    }

}

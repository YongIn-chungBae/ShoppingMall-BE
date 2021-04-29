package com.example.springproject.repository;

import com.example.springproject.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {
    ProductDetail findByProductIdx(Long productIdx);
}

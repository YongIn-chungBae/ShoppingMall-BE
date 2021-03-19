package com.example.springproject.service;

import com.example.springproject.entity.ProductEntity;
import com.example.springproject.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Transactional
    public void registerProduct(ProductEntity productEntity) {
        productRepository.save(productEntity);
    }


}

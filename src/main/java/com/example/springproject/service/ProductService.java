package com.example.springproject.service;

import com.example.springproject.entity.Product;
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
    public void registerProduct(Product product) {
        productRepository.save(product);
    }


}

package com.example.springproject.service;

import com.example.springproject.dto.ProductDTO;
import com.example.springproject.entity.Product;
import com.example.springproject.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Transactional
    public void registerProduct(Product product) {
        productRepository.save(product);
    }

    @Transactional
    public List<ProductDTO> findAllProduct(){
        List<Product> products = productRepository.findAll();
        return products.stream().map(ProductDTO::toDTO).collect(Collectors.toList());
    }

}

package com.example.springproject.service;

import com.example.springproject.dto.ProductDTO;
import com.example.springproject.entity.Product;
import com.example.springproject.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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

    public List<ProductDTO> findProductCategory(String category) {
        List<Product> products = productRepository.findByCategory(category);
        return products.stream().map(ProductDTO::toDTO).collect(Collectors.toList());
    }

    public List<ProductDTO> findLowerProduct() {
        List<Product> products = productRepository.findAll(Sort.by(Sort.Direction.ASC, "price"));
        return products.stream().map(ProductDTO::toDTO).collect(Collectors.toList());
    }

    public List<ProductDTO> findUpperProduct() {
        List<Product> products = productRepository.findAll(Sort.by(Sort.Direction.DESC, "price"));
        return products.stream().map(ProductDTO::toDTO).collect(Collectors.toList());
    }

    public List<ProductDTO> findSearchProduct(String name) {
        List<Product> products = productRepository.findByNameContaining(name);
        return products.stream().map(ProductDTO::toDTO).collect(Collectors.toList());
    }
}

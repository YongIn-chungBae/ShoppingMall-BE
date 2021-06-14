package com.example.springproject.service;

import com.example.springproject.dto.ProductDTO;
import com.example.springproject.dto.ShoppingCartDTO;
import com.example.springproject.entity.Product;
import com.example.springproject.entity.ShoppingCart;
import com.example.springproject.entity.User;
import com.example.springproject.repository.ProductRepository;
import com.example.springproject.repository.ShoppingCartRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class ShoppingCartService {
    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    @Autowired
    ProductRepository productRepository;

    @Transactional
    public List<ShoppingCartDTO> findShoppingCartList(User user){
        List<ShoppingCart> shoppingCartList = shoppingCartRepository.findByUserIdx(user);
        List<ShoppingCartDTO> shoppingCartDTOList = new ArrayList<ShoppingCartDTO>();
        for(ShoppingCart shoppingCart : shoppingCartList){
            Product product = productRepository.findByIdx(shoppingCart.getProductIdx().getIdx());
            ProductDTO productDTO = ProductDTO.toDTO(product);
            shoppingCartDTOList.add(ShoppingCartDTO.toDTO(shoppingCart, productDTO));
        }

        return shoppingCartDTOList;
    }

    public Long saveShoppingCart(User user, Product product) {
        ShoppingCart shoppingCart = ShoppingCart.builder()
                .product(product)
                .user(user)
                .build();
        return shoppingCartRepository.save(shoppingCart).getIdx();
    }

    public Boolean deleteShoppingCart(Long shoppingCartIdx) {
        try{
            shoppingCartRepository.deleteById(shoppingCartIdx);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
}

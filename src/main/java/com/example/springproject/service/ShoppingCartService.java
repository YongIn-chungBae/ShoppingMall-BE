package com.example.springproject.service;

import com.example.springproject.dto.ShoppingCartDTO;
import com.example.springproject.entity.ShoppingCart;
import com.example.springproject.entity.User;
import com.example.springproject.repository.ShoppingCartRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ShoppingCartService {
    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    @Transactional
    public List<ShoppingCartDTO> findShoppingCartList(User user){
        List<ShoppingCart> shoppingCartList = shoppingCartRepository.findByUserIdx(user);
        for (ShoppingCart shoppingCart : shoppingCartList){
            System.out.println(shoppingCart.getUserIdx());
            System.out.println(shoppingCart.getCreatedTime());
        }
        return shoppingCartList.stream().map(ShoppingCartDTO::toDTO).collect(Collectors.toList());
    }
}

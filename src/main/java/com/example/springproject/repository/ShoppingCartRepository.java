package com.example.springproject.repository;

import com.example.springproject.entity.ShoppingCart;
import com.example.springproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    List<ShoppingCart> findByUserIdx(User userIdx);
}

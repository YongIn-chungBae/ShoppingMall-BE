package com.example.springproject.repository;

import com.example.springproject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(String category);

    Product findByIdx(Long idx);

    List<Product> findByNameContaining(String name);

    @Transactional
    @Modifying
    @Query("UPDATE Product p SET p.count = p.count - :count WHERE p.idx = :idx")
    int updateCount(@RequestParam("count") Integer count, @RequestParam("idx") Long idx);
}

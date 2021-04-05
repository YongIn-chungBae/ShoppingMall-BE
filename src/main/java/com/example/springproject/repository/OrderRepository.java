package com.example.springproject.repository;

import com.example.springproject.entity.Order;
import com.example.springproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query("select u from User u JOIN Order o ON u.idx = o.userIdx")
    List<User> findUser();

//    @Query("select o.idx, o.state, o.count, p.idx, p.name, p.image, p.price from Order o JOIN Product p ON o.productIdx = p.idx WHERE u.idx = ?idx")
//    List<OrderListDTO> orderList(@Param("idx") int idx);
}

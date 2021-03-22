package com.example.springproject.repository;

import com.example.springproject.entity.ProductEvaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductEvaluationRepository extends JpaRepository<ProductEvaluation, Long> {
}

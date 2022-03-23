package com.springboot.carefirst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.carefirst.model.Discount;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Long> {

}

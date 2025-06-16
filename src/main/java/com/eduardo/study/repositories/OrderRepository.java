package com.eduardo.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.study.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

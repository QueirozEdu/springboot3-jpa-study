package com.eduardo.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.study.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

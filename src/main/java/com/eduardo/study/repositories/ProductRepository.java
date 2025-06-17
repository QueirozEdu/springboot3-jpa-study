package com.eduardo.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.study.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

package com.eduardo.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.study.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

package com.tma.sale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tma.sale.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findByusernameContaining(String s);
}

package com.tma.sale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tma.sale.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	Role findByroleNameContaining(String r);
}
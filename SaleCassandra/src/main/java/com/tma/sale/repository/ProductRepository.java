package com.tma.sale.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.tma.sale.entity.Product;

public interface ProductRepository extends CrudRepository<Product, UUID>{

}

package com.tma.sale.service;

import java.util.List;

import com.tma.sale.entity.Product;

public interface ProductService {
	void saveProduct(Product product);
	
	List<Product> findAllProduct();
}

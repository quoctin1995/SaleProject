package com.tma.sale.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tma.sale.entity.Product;
import com.tma.sale.entityDTO.ProductDTO;
import com.tma.sale.exception.NoHandlerFoundException;
import com.tma.sale.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void saveProduct(@RequestBody Product product) {
		UUID uuid = UUID.randomUUID();
		product.setProductId(uuid);
		productService.saveProduct(product);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<ProductDTO> getAllProducts() {
		List<Product> listProduct = productService.findAllProduct();

		if(listProduct == null) {
			throw new NoHandlerFoundException("NOT FOUND");
		}
		
		List<ProductDTO> listProductDTO = new ArrayList<>();
		for (Product product : listProduct) {
			listProductDTO.add(new ProductDTO(product));
		}
		return listProductDTO;
	}
}

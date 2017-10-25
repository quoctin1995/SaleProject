package com.tma.sale.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ProductDTO>> getAllProducts() {
		List<Product> listProduct = (List<Product>) productService.getAllProduct();
		
		if(listProduct == null) {
			throw new NoHandlerFoundException("NOT FOUND DATA");
		}
		
		List<ProductDTO> listProductDTO = new ArrayList<>();
		for (Product product : listProduct) {
			listProductDTO.add(new ProductDTO(product));
		}
		return new ResponseEntity<>(listProductDTO, HttpStatus.OK);
	}
}

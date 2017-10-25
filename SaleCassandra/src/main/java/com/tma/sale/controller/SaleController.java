package com.tma.sale.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tma.sale.entity.Sale;
import com.tma.sale.entityDTO.SaleDTO;
import com.tma.sale.exception.NoHandlerFoundException;
import com.tma.sale.service.SaleService;

@RestController
@RequestMapping("sale")
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<SaleDTO>> getAllSales(){
		List<Sale> listSales = (List<Sale>) saleService.getAllSale();
		
		if (listSales.size() == 0) {
			throw new NoHandlerFoundException("NOT FOUND DATA");
		}
		
		List<SaleDTO> listSaleDTO = new ArrayList<>();
		for (Sale sale : listSales) {
			listSaleDTO.add(new SaleDTO(sale));
		}
		return new ResponseEntity<>(listSaleDTO,HttpStatus.OK);
	}
}

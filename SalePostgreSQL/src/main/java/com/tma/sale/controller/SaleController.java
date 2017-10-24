package com.tma.sale.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
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

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Sale> add(@RequestBody Sale sales) {
		saleService.addSale(sales.getProduct().getProductId(), sales.getTime().getTimeId(),
				sales.getLocation().getLocationId(), BigDecimal.valueOf(sales.getDollars().val));
		return new ResponseEntity<Sale>(sales, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<SaleDTO> getAllProducts() {
		List<Sale> listSales = saleService.getSale();

		if (listSales.size() == 0) {
			throw new NoHandlerFoundException("NOT FOUND DATA");
		}

		List<SaleDTO> listSalesDTO = new ArrayList<>();
		for (Sale sales : listSales) {
			listSalesDTO.add(new SaleDTO(sales));
		}
		return listSalesDTO;
	}
}

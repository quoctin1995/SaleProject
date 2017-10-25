package com.tma.sale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.sale.entity.Sale;
import com.tma.sale.repository.SaleRepository;

@Service
public class SaleServiceImpl implements SaleService{
	@Autowired
	private SaleRepository saleRepository;
	
	@Override
	public Iterable<Sale> getAllSale() {
		return saleRepository.findAll();
	}
}

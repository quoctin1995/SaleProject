package com.tma.sale.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import com.tma.sale.entity.Sale;

public interface SaleService {

	List<Sale> getSale();

	void saveSale(Sale sale);

	void addSale(UUID productId, UUID timeId, UUID locationId, BigDecimal dollars);
}

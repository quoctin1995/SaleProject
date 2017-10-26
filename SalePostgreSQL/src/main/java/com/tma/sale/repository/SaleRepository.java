package com.tma.sale.repository;

import java.math.BigDecimal;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.tma.sale.entity.Sale;
import com.tma.sale.entity.SaleId;

public interface SaleRepository extends JpaRepository<Sale, SaleId> {

	@Modifying
	@Transactional
	@Query(value = "insert into public.sale(product_id, time_id, location_id, dollars) values (?1, ?2, ?3, ?4)", nativeQuery = true)
	public void addSale(UUID productId, UUID timeId, UUID locationId, BigDecimal dollars);
}

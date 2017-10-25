package com.tma.sale.repository;

import org.springframework.data.repository.CrudRepository;

import com.tma.sale.entity.Sale;
import com.tma.sale.entity.SaleId;

public interface SaleRepository extends CrudRepository<Sale, SaleId>{

}

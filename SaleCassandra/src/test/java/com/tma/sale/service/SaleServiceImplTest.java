package com.tma.sale.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tma.sale.SaleCassandraApplicationTests;
import com.tma.sale.entity.Sale;

public class SaleServiceImplTest extends SaleCassandraApplicationTests {
	@Autowired
	private SaleService service;

	@Test
	public void testFindAll() {

		Iterable<Sale> list = service.getAllSale();
		Assert.assertNotNull("failure - expected not null", list);
	}

}

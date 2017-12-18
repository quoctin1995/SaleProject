package com.tma.sale.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tma.sale.SaleCassandraApplicationTests;
import com.tma.sale.entity.Product;

public class ProductServiceImplTest extends SaleCassandraApplicationTests {
	@Autowired
	private ProductService service;

	@Test
	public void testFindAll() {

		Iterable<Product> list = service.getAllProduct();
		Assert.assertNotNull("failure - expected not null", list);

	}

}

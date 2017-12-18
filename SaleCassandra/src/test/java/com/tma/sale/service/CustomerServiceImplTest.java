package com.tma.sale.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tma.sale.SaleCassandraApplicationTests;
import com.tma.sale.entity.Customer;

public class CustomerServiceImplTest extends SaleCassandraApplicationTests {
	@Autowired
	private CustomerService service;

	@Test
	public void testFindAll() {

		Iterable<Customer> list = service.getAllCustomer();
		Assert.assertNotNull("failure - expected not null", list);

	}

}

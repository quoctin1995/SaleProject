package com.tma.sale.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tma.sale.SaleCassandraApplicationTests;
import com.tma.sale.entity.Time;

public class TimeServiceImplTest extends SaleCassandraApplicationTests {
	@Autowired
	private TimeService service;

	@Test
	public void testFindAll() {

		Iterable<Time> list = service.getAllTime();
		Assert.assertNotNull("failure - expected not null", list);
	}

}

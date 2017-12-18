package com.tma.sale.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tma.sale.SaleCassandraApplicationTests;
import com.tma.sale.entity.Location;

public class LocationServiceImplTest extends SaleCassandraApplicationTests {

	@Autowired
	private LocationService service;

	@Test
	public void testFindAll() {

		Iterable<Location> list = service.getAllLocation();
		Assert.assertNotNull("failure - expected not null", list);
	}

}

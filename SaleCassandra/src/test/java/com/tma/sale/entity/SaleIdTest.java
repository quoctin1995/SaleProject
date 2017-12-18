package com.tma.sale.entity;

import static org.junit.Assert.assertNotNull;

import java.util.UUID;

import org.junit.Test;

public class SaleIdTest {
	@Test
    public void testCreate() {
        SaleId sale = new SaleId();
        UUID uuid=UUID.randomUUID();
		UUID uuid1=UUID.randomUUID();
		UUID uuid2=UUID.randomUUID();
		UUID uuid3=UUID.randomUUID();
        sale.setProductId(uuid);
        sale.setTimeId(uuid1);
        sale.setLocationId(uuid2);
        sale.setCustomerId(uuid3);
 
        assertNotNull(sale.getProductId());
        assertNotNull(sale.getTimeId());
        assertNotNull(sale.getLocationId());
        assertNotNull(sale.getCustomerId());
    }

}

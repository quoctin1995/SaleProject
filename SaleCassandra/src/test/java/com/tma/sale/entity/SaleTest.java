package com.tma.sale.entity;

import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class SaleTest {
	@Test
    public void testCreate() {
        Sale sale = new Sale();
        UUID uuid=UUID.randomUUID();
		UUID uuid1=UUID.randomUUID();
		UUID uuid2=UUID.randomUUID();
		UUID uuid3=UUID.randomUUID();
		BigDecimal dollars = new BigDecimal(1000.0);
        sale.setProductId(uuid);
        sale.setTimeId(uuid1);
        sale.setLocationId(uuid2);
        sale.setCustomerId(uuid3);
        sale.setDollars(dollars);
 
        assertNotNull(sale.getProductId());
        assertNotNull(sale.getTimeId());
        assertNotNull(sale.getLocationId());
        assertNotNull(sale.getCustomerId());
        assertNotNull(sale.getDollars());
    }

}

package com.tma.sale.entity;

import static org.junit.Assert.assertNotNull;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class ProductTest {
	@Test
    public void testCreate() {
        Product product = new Product();
        UUID uuid=UUID.randomUUID();
        product.setProductId(uuid);
        product.setItem(1);
        product.setClass_pr("abc");
        product.setInventory("def");
 
        assertNotNull(product.getProductId());
        assertNotNull(product.getItem());
        assertNotNull(product.getClass_pr());
        assertNotNull(product.getInventory());
    }

}

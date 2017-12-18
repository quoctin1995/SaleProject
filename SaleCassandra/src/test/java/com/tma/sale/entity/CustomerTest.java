package com.tma.sale.entity;

import static org.junit.Assert.assertNotNull;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerTest {
	@Test
    public void testCreate() {
        Customer customer = new Customer();
        UUID uuid=UUID.randomUUID();
        customer.setCustomerId(uuid);
        customer.setCustomerName("customer1");
        customer.setAddress("hcm");
 
        assertNotNull(customer.getCustomerId());
        assertNotNull(customer.getCustomerName());
        assertNotNull(customer.getAddress());
    }

}

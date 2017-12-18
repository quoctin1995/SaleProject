package com.tma.sale.entity;

import static org.junit.Assert.assertNotNull;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class LocationTest {
 
    @Test
    public void testCreate() {
        Location location = new Location();
        UUID uuid=UUID.randomUUID();
        location.setLocationId(uuid);
        location.setCountry("viet nam");
        location.setCity("hcm");
 
        assertNotNull(location.getLocationId());
        assertNotNull(location.getCountry());
        assertNotNull(location.getCity());
    }

}

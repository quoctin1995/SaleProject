package com.tma.sale.entity;

import static org.junit.Assert.assertNotNull;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class TimeTest {
	@Test
    public void testCreate() {
		Time time = new Time();
        UUID uuid=UUID.randomUUID();
        time.setTimeId(uuid);
        time.setMonth(1);
        time.setQuarter(2);
        time.setYear(2017);
 
        assertNotNull(time.getTimeId());
        assertNotNull(time.getMonth());
        assertNotNull(time.getQuarter());
        assertNotNull(time.getYear());
    }

}

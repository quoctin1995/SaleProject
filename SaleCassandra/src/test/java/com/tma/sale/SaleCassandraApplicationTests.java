package com.tma.sale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SaleCassandraApplication.class)
public class SaleCassandraApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
    public void test()
    {
		SaleCassandraApplication.main(new String[]{
                "--spring.main.web-environment=false",
                "--spring.autoconfigure.exclude=false"
        });
    }

}

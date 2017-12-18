package com.tma.sale.service;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tma.sale.entity.Customer;
import com.tma.sale.repository.CustomerRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerServiceTest {
	@Mock
	private CustomerRepository customerRepository;
	
	@InjectMocks
	private CustomerServiceImpl customerService;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetAll(){
		UUID uuid=UUID.randomUUID();
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(new Customer(uuid, "customer1", "hcm"));
		when(customerRepository.findAll()).thenReturn(customerList);
		
		Iterable<Customer> result = customerService.getAllCustomer();
		Assert.assertNotNull("failure - expected not null", result);
		Assert.assertThat(result, is(customerList));
	}

}

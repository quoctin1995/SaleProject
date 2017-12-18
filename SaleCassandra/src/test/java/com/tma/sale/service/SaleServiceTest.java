package com.tma.sale.service;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
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

import com.tma.sale.entity.Sale;
import com.tma.sale.repository.SaleRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class SaleServiceTest {
	@Mock
	private SaleRepository saleRepository;
	
	@InjectMocks
	private SaleServiceImpl saleService;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetAll(){
		UUID uuid=UUID.randomUUID();
		UUID uuid1=UUID.randomUUID();
		UUID uuid2=UUID.randomUUID();
		UUID uuid3=UUID.randomUUID();
		BigDecimal dollars = new BigDecimal(1000.0);
		List<Sale> saleList = new ArrayList<Sale>();
		saleList.add(new Sale(uuid, uuid1, uuid2, uuid3, dollars));
		when(saleRepository.findAll()).thenReturn(saleList);
		
		Iterable<Sale> result = saleService.getAllSale();
		Assert.assertNotNull("failure - expected not null", result);
		Assert.assertThat(result, is(saleList));
	}

}

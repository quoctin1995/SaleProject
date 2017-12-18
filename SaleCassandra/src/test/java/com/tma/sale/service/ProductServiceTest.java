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

import com.tma.sale.entity.Product;
import com.tma.sale.repository.ProductRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class ProductServiceTest {
	@Mock
	private ProductRepository productRepository;
	
	@InjectMocks
	private ProductServiceImpl productService;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetAll(){
		UUID uuid=UUID.randomUUID();
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(uuid, 1, "aa", "bb"));
		when(productRepository.findAll()).thenReturn(productList);
		
		Iterable<Product> result = productService.getAllProduct();
		Assert.assertNotNull("failure - expected not null", result);
		Assert.assertThat(result, is(productList));
	}

}

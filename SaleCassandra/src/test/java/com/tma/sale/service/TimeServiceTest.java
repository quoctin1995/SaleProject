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

import com.tma.sale.entity.Time;
import com.tma.sale.repository.TimeRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class TimeServiceTest {
	@Mock
	private TimeRepository timeRepository;
	
	@InjectMocks
	private TimeServiceImpl timeService;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetAll(){
		UUID uuid=UUID.randomUUID();
		List<Time> timeList = new ArrayList<Time>();
		timeList.add(new Time(uuid, 1, 2, 2107));
		when(timeRepository.findAll()).thenReturn(timeList);
		
		Iterable<Time> result = timeService.getAllTime();
		Assert.assertNotNull("failure - expected not null", result);
		Assert.assertThat(result, is(timeList));
	}

}

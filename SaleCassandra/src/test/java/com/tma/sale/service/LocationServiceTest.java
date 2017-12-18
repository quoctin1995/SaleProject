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

import com.tma.sale.entity.Location;
import com.tma.sale.repository.LocationRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class LocationServiceTest {
	@Mock
	private LocationRepository locationRepository;
	
	@InjectMocks
	private LocationServiceImpl locationService;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetAll(){
		UUID uuid=UUID.randomUUID();
		List<Location> locationList = new ArrayList<Location>();
		locationList.add(new Location(uuid, "viet nam", "hcm"));
		when(locationRepository.findAll()).thenReturn(locationList);
		
		Iterable<Location> result = locationService.getAllLocation();
		Assert.assertNotNull("failure - expected not null", result);
		
		Assert.assertThat(result, is(locationList));
	}

}

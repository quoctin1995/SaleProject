package com.tma.sale.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.sale.entity.Location;
import com.tma.sale.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService{

	@Autowired
	private LocationRepository locationRepository;
	
	@Override
	public void saveLocation(Location location) {
		locationRepository.save(location);
		
	}

	@Override
	public List<Location> getAllLocation() {
		return locationRepository.findAll();
	}

}

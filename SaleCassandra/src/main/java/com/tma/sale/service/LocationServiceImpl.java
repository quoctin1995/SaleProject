package com.tma.sale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.sale.entity.Location;
import com.tma.sale.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService{
	@Autowired
	private LocationRepository locationRepository;
	
	@Override
	public Iterable<Location> getAllLocation() {
		return locationRepository.findAll();
	}
}

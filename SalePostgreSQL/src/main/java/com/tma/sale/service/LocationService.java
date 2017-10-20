package com.tma.sale.service;

import java.util.List;

import com.tma.sale.entity.Location;

public interface LocationService {
	void saveLocation(Location location);
	
	List<Location> getAllLocation();

}

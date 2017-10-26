package com.tma.sale.service;

import java.util.List;

import com.tma.sale.entity.Time;

public interface TimeService {
	List<Time> getAllTime();

	void saveTime(Time time);
}

package com.tma.sale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.sale.entity.Time;
import com.tma.sale.repository.TimeRepository;

@Service
public class TimeServiceImpl implements TimeService{
	@Autowired
	private TimeRepository timeRepository;
	
	@Override
	public Iterable<Time> getAllTime() {
		return timeRepository.findAll();
	}

}

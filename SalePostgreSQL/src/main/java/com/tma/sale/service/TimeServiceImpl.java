package com.tma.sale.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.sale.entity.Time;
import com.tma.sale.repository.TimeRepository;

@Service
public class TimeServiceImpl implements TimeService{

	@Autowired
	private TimeRepository timeRepository;
	
	@Override
	public List<Time> getAllTime() {
		return timeRepository.findAll();
	}

	@Override
	public void saveTime(Time time) {
		timeRepository.save(time);
	}

}

package com.tma.sale.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.tma.sale.entity.Time;

public interface TimeRepository extends CrudRepository<Time, UUID> {

}

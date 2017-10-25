package com.tma.sale.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.tma.sale.entity.Location;

public interface LocationRepository extends CrudRepository<Location, UUID> {

}

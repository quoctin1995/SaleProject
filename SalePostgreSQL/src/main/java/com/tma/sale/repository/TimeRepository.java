package com.tma.sale.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tma.sale.entity.Time;

public interface TimeRepository extends JpaRepository<Time, UUID> {

}

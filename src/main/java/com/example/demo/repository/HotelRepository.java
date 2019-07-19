package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Hotel;

public interface HotelRepository extends CrudRepository<Hotel, Long> {
	Hotel findByName(String name);
}

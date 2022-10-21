package com.api.flights.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.flights.model.FlightModel;

@Repository
public interface FlightRepository extends CrudRepository<FlightModel, Long>{
    
}

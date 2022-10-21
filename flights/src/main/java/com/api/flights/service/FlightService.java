package com.api.flights.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.flights.model.FlightModel;
import com.api.flights.repository.FlightRepository;

@Service
public class FlightService {

    @Autowired
    private FlightRepository fr;

    public Iterable<FlightModel> list(){
        return fr.findAll();
    }
}

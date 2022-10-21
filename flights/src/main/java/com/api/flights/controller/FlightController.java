package com.api.flights.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.flights.model.FlightModel;
import com.api.flights.service.FlightService;

@RestController
@CrossOrigin(origins = "*")
public class FlightController {

    @Autowired
    private FlightService fs; 

    @GetMapping("/list")
    public Iterable<FlightModel> list() {
        return fs.list();
    }

    @GetMapping("/")
    public String rota(){
        return "Api está funcionando";
    }
    
}

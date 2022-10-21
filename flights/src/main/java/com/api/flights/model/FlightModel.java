package com.api.flights.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "flights")
@Getter
@Setter

public class FlightModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private String arriveCity;
    private Float priceGo;
    private Float priceReturn;
    private String minDate;
    private String maxDate;
    
}

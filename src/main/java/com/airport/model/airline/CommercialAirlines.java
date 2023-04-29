package com.airport.model.airline;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class CommercialAirlines extends Airlines{

    UUID id;
    String name;

}

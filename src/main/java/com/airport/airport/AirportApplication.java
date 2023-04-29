package com.airport.airport;

import com.airport.airport.controller.model.airline.GeneralAviation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirportApplication {

	public static void main(String[] args) {
		//SpringApplication.run(AirportApplication.class, args);
		GeneralAviation g = new GeneralAviation();
		g.setCapacity(123);
		System.out.println(g.getCapacity());
	}

}

package com.facadepattern.demo;

import java.util.ArrayList;
import java.util.List;

public class FlightDetails {
	public List<Flight> getFlightsDetails(){
		return getListofFlights();
	}
	
	private static List<Flight> getListofFlights(){
		List<Flight> flightList = new ArrayList<Flight>();
		
		Flight flight1 = new Flight();
		flight1.setFlightNumber("1234");
		flight1.setSource("Bangalore");
		flight1.setDestination("Singapore");
		flightList.add(flight1);
		
		Flight flight2 = new Flight();
		flight2.setFlightNumber("2222");
		flight2.setSource("Bangalore");
		flight2.setDestination("Singapore");
		flightList.add(flight2);
		
		return flightList;
	}
}

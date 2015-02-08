package com.facadepattern.demo;

import java.util.List;


public class TravelFacade {

	private FlightDetails flightDetails = new FlightDetails();
	private HotelDetails hotelDetails =  new HotelDetails();
	
	public void getFlightsAndHotels(){
		List<Hotel> hotels = hotelDetails.getHotelNames();
		List<Flight> flights = flightDetails.getFlightsDetails();
		
		System.out.println("List of Flight Details\n");
		for(int i=0; i < flights.size(); i++){
			System.out.println(flights.get(i).getFlightNumber() +"<-->"+flights.get(i).getSource()+"<-->"+flights.get(i).getDestination());
		}
		
		System.out.println("List of Hotel Details\n");
		for(int i=0; i < hotels.size(); i++){
			System.out.println(hotels.get(i).getHotelName() +"<-->"+hotels.get(i).getHotelPlace());
		}
	}
}

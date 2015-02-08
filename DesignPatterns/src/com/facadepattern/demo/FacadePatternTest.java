package com.facadepattern.demo;

public class FacadePatternTest {

	public static void main(String[] args) {
		TravelFacade facade = new TravelFacade();
		facade.getFlightsAndHotels();
	}

}

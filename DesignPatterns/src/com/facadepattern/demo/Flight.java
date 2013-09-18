package com.facadepattern.demo;

import java.io.Serializable;

public class Flight implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String flightNumber;
	private String source;
	private String destination;
	
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

}

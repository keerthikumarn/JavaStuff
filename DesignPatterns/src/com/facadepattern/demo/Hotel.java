package com.facadepattern.demo;

import java.io.Serializable;

public class Hotel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String hotelName;
	private String hotelPlace;
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelPlace() {
		return hotelPlace;
	}
	public void setHotelPlace(String hotelPlace) {
		this.hotelPlace = hotelPlace;
	}
	
	
}

package com.facadepattern.demo;

import java.util.ArrayList;
import java.util.List;

public class HotelDetails {
	public List<Hotel> getHotelNames(){
		return getListofHotels();
	}
	
	
	private static List<Hotel> getListofHotels(){
		
		List<Hotel> hotelList = new ArrayList<Hotel>();
		
		Hotel hotel1 = new Hotel();
		hotel1.setHotelName("Grand Hotel");
		hotel1.setHotelPlace("Singapore");
		hotelList.add(hotel1);
		
		Hotel hotel2 = new Hotel();
		hotel2.setHotelName("Miracle Grand");
		hotel2.setHotelPlace("Singapore");
		hotelList.add(hotel2);
		
		return hotelList;
	}
}

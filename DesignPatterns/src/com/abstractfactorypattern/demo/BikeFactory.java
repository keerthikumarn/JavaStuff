package com.abstractfactorypattern.demo;

public class BikeFactory implements VehicleFactory {

	public Vehicle makeVehicle() {
		return new Bike();
	}

}

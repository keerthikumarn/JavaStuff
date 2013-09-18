package com.abstractfactorypattern.demo;

public class CarFactory implements VehicleFactory {

	public Vehicle makeVehicle() {
		return new Car();
	}

}

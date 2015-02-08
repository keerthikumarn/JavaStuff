package com.abstractfactorypattern.demo;

public class VehiclePlaza {
	public VehiclePlaza(VehicleFactory factory){
		Vehicle vehicle = factory.makeVehicle();
		vehicle.vehicleType();
	}
}

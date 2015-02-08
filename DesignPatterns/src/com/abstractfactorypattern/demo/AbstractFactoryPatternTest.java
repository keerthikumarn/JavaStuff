package com.abstractfactorypattern.demo;

public class AbstractFactoryPatternTest {

	public static void main(String[] args) {
		new VehiclePlaza(createVehicleFactory("car"));
	}
	
	private static VehicleFactory createVehicleFactory(String type){
		if("car".equals(type)){
			return new CarFactory();
		}else{
			return new BikeFactory();
		}
	}

}

package com.prototypepattern.demo;

public class PrototypePatternTest {
	
	public Car makeZDICar(Car basicModel){
		basicModel.makeAdvancedCar();
		return basicModel;
	}

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("Details of Basic Swift Car");
		System.out.println("**************************");
		System.out.println("Car Name : "+car.getName());
		System.out.println("Car Color : "+car.getColor());
		System.out.println("No. of Gears : "+car.getNoOfGears());
		System.out.println("**************************\n");
		
		Car basicModel = car.clone();
		
		PrototypePatternTest test =  new PrototypePatternTest();
		Car advancedCar = test.makeZDICar(basicModel);
		System.out.println("Details of Basic Swift Car (Cloning)");
		System.out.println("************************************");
		System.out.println("Car Name : "+advancedCar.getName());
		System.out.println("Car Color : "+advancedCar.getColor());
		System.out.println("No. of Gears : "+advancedCar.getNoOfGears());
	}

}

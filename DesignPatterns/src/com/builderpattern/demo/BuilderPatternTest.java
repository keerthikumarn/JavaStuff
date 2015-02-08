package com.builderpattern.demo;

public class BuilderPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HouseBuilder duplexBuilder = new SmallHouseBuilder();
		CivilEngineer engineer = new CivilEngineer(duplexBuilder);
		engineer.constructHouse();
		
		House house = engineer.getHouse();
		System.out.println("Builder Constructed : "+house);
	}

}

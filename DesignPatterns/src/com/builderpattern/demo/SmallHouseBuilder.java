package com.builderpattern.demo;

public class SmallHouseBuilder implements HouseBuilder {

private House house;
	
	public SmallHouseBuilder(){
		this.house = new House();
	}

	public void buildBasement() {
		house.setBasement("Small House -> Setting up the Basement");
	}

	public void buildStructure() {
		house.setStructure("Small House -> Setting up the Structure");
	}

	public void bulidRoof() {
		house.setRoof("Small House -> Setting up the Roof");
	}

	public void buildInterior() {
		house.setInterior("Small House -> Setting up the Interior");
	}

	public House getHouse() {
		return this.house;
	}

}

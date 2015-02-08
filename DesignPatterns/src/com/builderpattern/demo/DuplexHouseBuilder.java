package com.builderpattern.demo;

public class DuplexHouseBuilder implements HouseBuilder {
	
	private House house;
	
	public DuplexHouseBuilder(){
		this.house = new House();
	}

	public void buildBasement() {
		house.setBasement("Duplex House -> Setting up the Basement");
	}

	public void buildStructure() {
		house.setStructure("Duplex House -> Setting up the Structure");
	}

	public void bulidRoof() {
		house.setRoof("Duplex House -> Setting up the Roof");
	}

	public void buildInterior() {
		house.setInterior("Duplex House -> Setting up the Interior");
	}

	public House getHouse() {
		return this.house;
	}

}

package com.prototypepattern.demo;

public class Car implements Cloneable {
	
	private String name;
	private String color;
	private int noOfGears;
	
	public Car(){
		this.name = "Maruti Swift - VDI";
		this.color = "Azure Grey";
		this.noOfGears = 5;
	}
	
	public Car clone(){
		return new Car();
	}
	
	public void makeAdvancedCar(){
		this.name = "Maruti Swift - ZDI";
		this.color = "Sun Light Copper";
		this.noOfGears = 6;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}
}

package com.prototypepattern.demo;

public class Album implements PrototypeCapable {

	private String name = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public PrototypeCapable cloneObject() throws CloneNotSupportedException {
		System.out.println("Cloning the Album Object..");
		return (Album) super.clone();
	}

	@Override
	public String toString() {
		return "Album";
	}

}

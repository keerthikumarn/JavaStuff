/**
 * 
 */
package com.prototypepattern.demo;

/**
 * @author kenarayan
 * 
 */
public class Movie implements PrototypeCapable {

	private String name = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public PrototypeCapable cloneObject() throws CloneNotSupportedException {
		System.out.println("Cloning the Movie Object..");
		return (Movie) super.clone();
	}

	@Override
	public String toString() {
		return "Movie";
	}

}

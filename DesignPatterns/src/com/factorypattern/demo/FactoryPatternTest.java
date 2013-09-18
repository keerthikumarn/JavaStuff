package com.factorypattern.demo;

public class FactoryPatternTest {

	public static void main(String[] args) {
		PetAnimalFactory petFactory = new PetAnimalFactory();
		PetAnimal pet = petFactory.getPetAnimal("quack");
		System.out.println(pet.makeNoise());
	}

}

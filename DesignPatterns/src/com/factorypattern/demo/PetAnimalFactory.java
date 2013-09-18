package com.factorypattern.demo;

public class PetAnimalFactory {
	public PetAnimal getPetAnimal(String noiseType){
		PetAnimal pet = null;
		if("bark".equals(noiseType)){
			pet = new Dog();
		}
		else if("quack".equals(noiseType)){
			pet = new Duck();
		}
		return pet;
	}
}

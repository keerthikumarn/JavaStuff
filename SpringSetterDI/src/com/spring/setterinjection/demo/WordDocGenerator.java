package com.spring.setterinjection.demo;

public class WordDocGenerator implements IOutputGenerator {

	@Override
	public void generateOutput() {
		System.out.println("Used for Word Doc Output Generator");
	}

}

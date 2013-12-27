package com.spring.setterinjection.demo;

public class PdfGenerator implements IOutputGenerator {

	@Override
	public void generateOutput() {
		System.out.println("Used for PDF Output Generator");
	}

}

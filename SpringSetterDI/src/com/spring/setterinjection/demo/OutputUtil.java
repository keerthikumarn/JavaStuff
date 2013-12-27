package com.spring.setterinjection.demo;

/**
 * @author kenarayan
 * 
 * Class which actually uses the setter injection !!
 *
 */
public class OutputUtil {
	private IOutputGenerator outputGenerator;
	
	public void generateOutput(){
		outputGenerator.generateOutput();
	}
	
	//Dependency Injection via setter method !
	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
}

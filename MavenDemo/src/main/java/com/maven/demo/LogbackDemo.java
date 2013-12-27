package com.maven.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackDemo {

	private static final Logger log = LoggerFactory.getLogger(LogbackDemo.class);
	
	public static void main(String[] args) {
		log.trace("Hello");
		String name = "Keerthi Kumar N";
		
		log.debug("Hi, {}", name);
		log.info("Welcome to the HelloWorld example of Logback.");
		log.warn("Dummy warning message.");
		log.error("Dummy error message.");
	}

}

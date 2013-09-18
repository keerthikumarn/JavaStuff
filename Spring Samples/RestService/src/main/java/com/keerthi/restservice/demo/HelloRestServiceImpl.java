package com.keerthi.restservice.demo;

import org.springframework.stereotype.Service;

@Service("helloRestService")
public class HelloRestServiceImpl implements HelloRestService{

	public String sayPlainTextHello() {
		return "Hello Keerthi Kumar !!";
	}

	
	public String sayXMLHello() {
		return "<?xml version=\"1.0\"?>" + "<hello>"+ sayPlainTextHello() + "</hello>";
	}

	public String sayHtmlHello() {
		return "<html> " + "<title>" + "Keerthi Kumar" + "</title>"
				+ "<body><h1>" + "Hello Keerthi Kumar" + "</body></h1>" + "</html> ";
	}

}

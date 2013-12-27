package com.spring.setterinjection.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSetterDITest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		OutputUtil util = (OutputUtil) context.getBean("outputUtil");
		util.generateOutput();
	}

}

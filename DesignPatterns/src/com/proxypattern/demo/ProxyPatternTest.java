package com.proxypattern.demo;

import java.lang.reflect.Proxy;

public class ProxyPatternTest {

	public static void main(String[] args) {
		Animal realObject = new Lion();
		Animal proxyObject = (Animal) Proxy.newProxyInstance(realObject.getClass().getClassLoader(), realObject.getClass().getInterfaces(), 
				new AnimalProxyHandler(realObject));
		proxyObject.makeSound();
	}

}

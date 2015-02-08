package com.singletonpattern.demo;

public class SingletonDemo {
	
	private SingletonDemo(){}
	
	private static SingletonDemo demo = null;

	public static SingletonDemo getInstance(){
		if(demo == null){
			demo = new SingletonDemo();
		}
		System.out.println(demo.toString());
		return demo;
	}
	
	public static void main(String[] args) {
		getInstance();
		getInstance();
	}

}

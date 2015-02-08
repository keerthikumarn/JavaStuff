package com.sample.programs;

import java.lang.reflect.Field;

public class AccessPrivateVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		MyClass myClass = new MyClass();
		Field field = myClass.getClass().getDeclaredField("myName");
		field.setAccessible(true);
		System.out.println("Variable is : "+field.getName() + " Value is "+field.get(myClass));
		field.set(myClass, "test user");
		System.out.println("Variable is : "+field.getName() + " Value is "+field.get(myClass));
	}

}

package com.proxypattern.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AnimalProxyHandler implements InvocationHandler {
	
	private Object realObject = null;
	
	public AnimalProxyHandler(Object realObject){
		this.realObject = realObject;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		try{
			result = method.invoke(realObject, args);
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}

}

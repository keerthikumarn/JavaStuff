package com.servicelocatorpattern.demo;

public class MyServiceLocator {
	private static CacheHandler cache;
	
	static{
		cache = new CacheHandler();
	}
	
	public static MyService getService(String jndiName){
		MyService service = cache.getService(jndiName);
		
		if(service != null){
			return service;
		}
		
		InitialContext context = new InitialContext();
		MyService myService = (MyService) context.lookup(jndiName);
		cache.addService(myService);
		return myService;
	}
}

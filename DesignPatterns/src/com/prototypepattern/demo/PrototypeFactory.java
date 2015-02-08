package com.prototypepattern.demo;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
	
	public static class ModelType{
		public static final String MOVIE = "movie";
		public static final String ALBUM = "album";
	}
	
	private static Map<String, PrototypeCapable> prototypes = new HashMap<String, PrototypeCapable>();
	
	static{
		prototypes.put(ModelType.MOVIE, new Movie());
		prototypes.put(ModelType.ALBUM, new Album());
	}
	
	public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException{
		return ((PrototypeCapable) prototypes.get(s)).cloneObject();
	}
}

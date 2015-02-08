package com.sample.programs;

public final class ImmutableClass {
	
	private final Integer num;
	
	private final String str;
	
	public ImmutableClass(int num, String str){
		this.num = num;
		this.str = str;
	}
	
	public static ImmutableClass createNewInstance(Integer num, String str){
		return new ImmutableClass(num, str);
	}

	public Integer getNum() {
		return num;
	}

	public String getStr() {
		return str;
	}

	@Override
	public String toString() {
		return "ImmutableClass [num=" + num + ", str=" + str + "]";
	}
	
}

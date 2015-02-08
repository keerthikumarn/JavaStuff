package com.sample.programs;

public class TestImmutableClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ImmutableClass im = ImmutableClass.createNewInstance(10,
				"Keerthi Kumar");
		System.out.println(im);
		tryModificationOfClass(im.getNum(), im.getStr());
		System.out.println(im);
	}

	private static void tryModificationOfClass(Integer immutableField1,
			String immutableField2) {
		immutableField1 = 15;
		immutableField2 = "Value changed";
	}

}

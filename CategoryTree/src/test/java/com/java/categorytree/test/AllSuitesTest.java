package com.java.categorytree.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllSuitesTest extends TestSuite{
	public static Test suite() {  
		TestSuite suite = new TestSuite("AllSuitesTest test");  
		suite.addTest(com.java.categorytree.test.CategoryTreeTestSuite.suite());
		suite.addTest(com.java.categorytree.test.TreeTestSuite.suite());
		return suite;  
	}  
}

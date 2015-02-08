package com.java.categorytree.test;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCategoryTree.class, TestCategoryTreeNode.class })
public class TreeTestSuite extends TestSuite{
	public static Test suite() {  
		TestSuite suite = new TestSuite("TreeTestSuite test");  
		suite.addTest(com.java.categorytree.test.TreeTestSuite.suite());
		return suite;  
	}

}

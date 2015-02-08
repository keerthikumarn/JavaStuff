package com.java.categorytree.test;
import junit.framework.Test;
import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({TestCategoryTree.class,TestCategoryTreeNode.class })
public class CategoryTreeTestSuite extends TestSuite{
	public static Test suite() {  
		TestSuite suite = new TestSuite("CategoryTreeTestSuite test");  
		suite.addTest(com.java.categorytree.test.CategoryTreeTestSuite.suite());
		return suite;  
	}
}

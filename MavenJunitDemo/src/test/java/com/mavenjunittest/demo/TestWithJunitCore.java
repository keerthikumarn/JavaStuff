package com.mavenjunittest.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

@SuppressWarnings("rawtypes")
public class TestWithJunitCore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Object> testCases = new ArrayList<Object>();
		
		//add the test cases to the list
		testCases.add(TestCaseOne.class);
		testCases.add(TestCaseTwo.class);
		
		for(Object testCase : testCases){
			runTestCase((Class) testCase);
		}
	}
	
	private static void runTestCase(Class testCase){
		Result result = JUnitCore.runClasses(testCase);
		for(Failure failure : result.getFailures()){
			System.out.println(failure.toString());
		}
	}

}

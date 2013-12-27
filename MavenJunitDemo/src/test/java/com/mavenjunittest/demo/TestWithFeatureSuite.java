package com.mavenjunittest.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestCaseOne.class, TestCaseTwo.class})
public class TestWithFeatureSuite {

}

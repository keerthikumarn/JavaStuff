This is the sample maven project which tells about the best practices of running Junit test cases !!

a) Run all test cases with command "mvn test" - This command run all test cases present inside test folder irrespective of any other criteria.

b) Execute a particular test class only with “-Dtest=TestSurefire test” - This will execute all test cases inside test class TestSurefire.

c) Test only a certain test case inside test class with “mvn -Dtest=TestSureFire#testFirst test“ - This command will execute only single test case method i.e. testFirst().
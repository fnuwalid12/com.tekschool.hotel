package testNG.concepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	//@Test : This annotation will be use to run acutal test Method.
	//@BeforeMethod: This annotation will be executed before each test method
	//AfterMethod: This annotation will be executed after each test method
	//BeforeTest: This annotation will be executed  before all test medhots
	//AfterTest: This annotation will be executed after all test methods
	//BeforeClass: This annotation will be executed before Class if we have multiple test cases in 
	// TestNG.This annotation will execute before each class.
	// @AfterClass: This annotation will be executed after class if we have multiple test caeses in
	// TestNG. This annotation will be executed after each class
	// @BeforeGroup and @AfterGroup: these annotation will be executed before and after set of test cases
	// which are grouped by specific name.
	// in real world we use mainly @Test for each Test case. and @BeforeMethod and @AftrerMethod
	// to setup properties and Tear down after each execution. and @BeforeMethod and @AfterMethod are similiar
	// to BeforeHooks and AfterHooks of Cucumber.

	
	@BeforeTest
	public void beforeTest () {
		System.out.println("This method executes before first test");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This method executes before each test");
	}
	@Test (priority = 1)
	public void test_one() {
		System.out.println("This is test one");
	}
	
	@Test (priority = 2)
	public void test_two() {
		System.out.println("This is test two");
	}
	
	@Test (priority = 3)
	public void test_three() {
		System.out.println("This is test three");
	}
	
	@Test 
	public void test_withoutP() {
		System.out.println("This is test withoutP");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This method executes after each test");
	}
	
	@AfterTest
	public void afterTest () {
		System.out.println("This method will execute after  all tests are executed");
	}
	
}

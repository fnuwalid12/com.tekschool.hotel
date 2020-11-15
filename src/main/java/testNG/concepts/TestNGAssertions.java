package testNG.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions {
	
	// Assertions are used to validate expected result against actual result
	
	// TestNG provides two types of assertions
	// Hard Assertions: if expected is not equal to actual execution will stop at this point.
	// Soft Assertions: if expected is not equal to actual, execution will continue but test case will fail
	
	// syntax for hard assertion : Assert.MethodName (Actual, Expected)
	
	@Test (enabled = false) // enabled = false will ignore a test fro execution
	public void hardAssertion () {
		
		int actualValue = 4;
		int expectedValue = 4;
		
		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("This line of code will be executed if assertion passed");
		
	}
	
	@Test
	
	public void softAssertion () {
	
		int a = 10;
		int b = 15;
		
		SoftAssert softAssert = new SoftAssert () ;
		softAssert.assertEquals(a, b);
		System.out.println("This line of code will be executed regardless of asserttion pass or fail");
		softAssert.assertTrue(false);
		System.out.println("This is after second execution");
		
		softAssert.assertAll();
		
		
	}
	
	

}

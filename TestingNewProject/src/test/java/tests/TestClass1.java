package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass1 {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforesuite TestClass1");
	}
	
	@Parameters("alpha")
	@BeforeTest
	public void beforetest(String data) { 
		System.out.println("beforetest TestClass1");
		System.out.println(data);
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass TestClass1");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod TestClass1");
	}
	
	@Test
	public void testA() {
		
		System.out.println("testA TestClass1");
		
	}
	
	@Test
	public void testB() {
		
		System.out.println("testB TestClass1");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod TestClass1");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass TestClass1");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest TestClass1");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite TestClass1");
	}

}




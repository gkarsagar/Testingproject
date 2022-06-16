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
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass2 {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforesuite TestClass2");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest TestClass2");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass TestClass2");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod TestClass2");
	}
	
	@Test
	public void testA() {
		System.out.println("testA TestClass2");
		
		
	}
	
	@Test
	public void testB() {
		
		System.out.println("testB TestClass2");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod TestClass2");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass TestClass2");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest TestClass2");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite TestClass2");
	}


}




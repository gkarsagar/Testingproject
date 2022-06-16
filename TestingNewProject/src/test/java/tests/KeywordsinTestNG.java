package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeywordsinTestNG{
	
	@BeforeClass
	public void beforeclass() {
		
		System.out.println("before class");
		
	}
	
	@BeforeMethod
	public void beforemethod() {
		
		System.out.println("before method");
	}
	
	
	@ Test(timeOut=3000)
	public void testA() throws InterruptedException {
		
		System.out.println("testA");
		Thread.sleep(5000);
		System.out.println("hi");
		
		
	}
	
	@Test(priority=1,dependsOnMethods= {"testA"})
	public void testB() {
		
		System.out.println("testB");
	}
	
	@Test(invocationCount=2)
	public void testC() {
		System.out.println("testC");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");
	}
	
	
	@AfterClass
	public void afterclass() {
		
		System.out.println("after class");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}






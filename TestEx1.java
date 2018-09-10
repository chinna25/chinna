package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestEx1 {
	
	@BeforeMethod
	public void before()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void after()
	{
		System.out.println("After Method");
	}

	@Test(priority=5,groups={"Smoke","Regression"},invocationCount=10)
	public void printA()
	{
		System.out.println("Just printing A");
	}
	
	@Test(priority=3,groups={"Smoke","Regression","Functional"})
	public void printB()
	{
		System.out.println("Just printing B");
	}
	
	@Test(priority=1,groups={"Smoke"})
	public void printC()
	{
		System.out.println("Just printing C");
	}
	
	@Test(priority=4,enabled=false,groups={"Functional"})
	public void printD()
	{
		System.out.println("Just printing D");
	}

	@Test(priority=2,groups={"Smoke"})
	public void printZ()
	{
		System.out.println("Just printing Z");
	}
	
	@Test(priority=10,groups={"Regression"})
	public void printY()
	{
		System.out.println("Just printing Y");
	}
	
	@Test(priority=-1,groups={"Functional"})
	public void printX()
	{
		System.out.println("Logging into the application");
		Assert.fail();
		System.out.println("Just printing Y");
	}
	
	@Test(priority=11,groups={"Functional"},dependsOnMethods= {"printX"})
	public void printU()
	{
		System.out.println("Verifying the home page");
	}
}

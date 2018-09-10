package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestEx2 {
	
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

	@Test
	public void printA()
	{
		System.out.println("Just printing A");
	}
	
	@Test
	public void printB()
	{
		System.out.println("Just printing B");
	}
	
	@Test
	public void printC()
	{
		System.out.println("Just printing C");
	}
	
	
	//Parameter Example
	@Test
	@Parameters(value= {"BName","Wait"})
	public void printParameter(String BrowserName,String WaitTime)
	{
		System.out.println("My Browser name is "+ BrowserName);
		Assert.assertEquals("FIREFOX", BrowserName);
		System.out.println("My wait time is "+ WaitTime);
	}
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void asuite()
	{
		System.out.println("After Suite");
		
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before Class");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After Class");
	}
}

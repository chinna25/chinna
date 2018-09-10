package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestEx3 {
	
	@BeforeMethod
	public void before()
	{
		System.out.println("Before Method3");
	}
	
	@AfterMethod
	public void after()
	{
		System.out.println("After Method3");
	}

	@Test
	public void printA()
	{
		System.out.println("Just printing A from Test3");
	}
	
	@Test
	public void printB()
	{
		System.out.println("Just printing B from Test3");
	}
	
	@Test
	public void printC()
	{
		System.out.println("Just printing C from Test3");
	}
	
	
}

package TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx1 {

	@Test(dataProvider="add")
	public void addition(int a ,int b,int c)
	{
		int result = a+b;
		Assert.assertEquals(result, c);
	}
	
	@DataProvider(name="add")
	public Object[][] data1()
	{
		Object[][] obj=new Object[6][3];
		
		obj[0][0]=10;
		obj[0][1]=20;
		obj[0][2]=30;
		
		obj[1][0]=30;
		obj[1][1]=20;
		obj[1][2]=50;
		
		obj[2][0]=40;
		obj[2][1]=20;
		obj[2][2]=60;
		
		obj[3][0]=10;
		obj[3][1]=50;
		obj[3][2]=60;

		
		obj[4][0]=40;
		obj[4][1]=20;
		obj[4][2]=60;
		
		obj[5][0]=10;
		obj[5][1]=50;
		obj[5][2]=60;
		
		return obj;
		
	}
	
		
	
}

package TestngActPack;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass1 {

	@BeforeMethod
	public void bmethod()
	{
		System.out.println("-----------------before method");
		
		
	}
	
	
	@Parameters("OS")
	@Test(description="test case 1",priority=1,groups={"smoke","regression"})
	public void m1(String OS)
	{
		System.out.println("Method 1"+OS);
	}
	@Parameters("OS")
	@Test(groups={"smoke"})
	public void m2(String OS)
	{
		System.out.println("Method 2"+OS);
	}
	
	@Test(priority=2,groups="regression")
	public void m3()
	{
		System.out.println("Method 3");
		Assert.assertTrue(false,"Failed");
	}
	
	@Test(dependsOnMethods={"m3"})
	public void m4()
	{
		System.out.println("Method 4");
	}
	
	@AfterMethod
	public void aftmethod()
	{
		System.out.println("--------------------After Method");
	}
	
}

package TestngActPack;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;




public class TestClass1 {

	ExtentReports rep;
	ExtentTest Reporter;
	
	@BeforeTest(alwaysRun=true)
	public void betest()
	{
		
		rep = new ExtentReports("C:\\Users\\Rajib\\git\\RajPracv1\\cucumberTestng\\target\\testngReports\\report.html", true);
		
		Reporter = rep.startTest("first test of testng");
		
	}
	
	
	@BeforeMethod()
	public void bmethod()
	{
		System.out.println("-----------------before method");
	}
	
	
	@Parameters("OS")
	@Test(description="test case 1",priority=1,groups={"smoke","regression"})
	public void m1(String OS)
	{
		System.out.println("Method 1"+OS);
		
		Reporter.log(LogStatus.PASS, "test case 1 passed");
	}
	@Parameters("OS")
	@Test(groups={"smoke"})
	public void m2()
	{
		System.out.println("Method 2");
		
		//Reporter.log(LogStatus.PASS, Reporter.addScreenCapture("") +"test case 2 passed");
		
	}
	
	@Test(priority=2,groups="regression")
	public void m3()
	{
		System.out.println("Method 3");
		Assert.assertTrue(false,"Failed");
		
		Reporter.log(LogStatus.FAIL, "test case 3 failed ");
	}
	
	@Test(dependsOnMethods={"m3"})
	public void m4()
	{
		System.out.println("Method 4");
		
		Reporter.log(LogStatus.SKIP, "test case 4 skipped ");
	}
	
	@AfterMethod
	public void aftmethod()
	{
		System.out.println("--------------------After Method");
	}
	
	@AfterTest(alwaysRun=true)
	public void afterTest()
	{
		rep.endTest(Reporter);
		rep.flush();
	}
	
}

package org.cucumberTestng.cucumberTestng;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseUtils {
	
	public WebDriver driver;
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	
	@AfterMethod
	public void teardown(ITestResult result)
	{
		
		System.out.println(result.getStatus());
		
	}

	
	
	
	
}

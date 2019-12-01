package StepDefinition;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.cucumberTestng.cucumberTestng.BaseUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot extends BaseUtils {

	public void getfullscreenshot(WebDriver driver) throws IOException
	{
		
		TakesScreenshot ts = ((TakesScreenshot)driver);
		
		File ssfull =  ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(ssfull, new File(""));				
		
		
	}
	
	
	
	
	
}

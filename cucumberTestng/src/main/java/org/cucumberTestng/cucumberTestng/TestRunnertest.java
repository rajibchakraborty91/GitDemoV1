package org.cucumberTestng.cucumberTestng;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\Java Documents\\text\\cucumberTestng\\src\\main\\java\\Features",
		glue = {"StepDefinition"},
		plugin = {"pretty","html:target","junit:target/cucumberxml.xml","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome = true,
		strict = true,
		tags = "@tagall"
		)

public class TestRunnertest extends AbstractTestNGCucumberTests {
	@AfterClass
	public static void writeExtentReport() throws FileNotFoundException, IOException {
		
		ConfigFileReader cfr = new ConfigFileReader();
		Reporter.loadXMLConfig(new File(cfr.getReportConfigPath()));
		
	}
	
	
}

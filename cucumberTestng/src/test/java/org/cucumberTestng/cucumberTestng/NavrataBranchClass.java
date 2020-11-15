package org.cucumberTestng.cucumberTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavrataBranchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey navrata, I am navrata");
		
		System.setProperty("Webdriver.chrome.driver", "D:/Doc.view/chromedriver.exe");
		
		WebDriver dv = new ChromeDriver();
		
		dv.get("https://davies-group.com/");
		
		
	}

}

package com.time.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void testVerifyTitle()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		String expectedTitle = "Soogle";
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			Reporter.log("Title is matching so pass", true);
		}
		       
		else
		{
			Reporter.log("Title is not matching so failed", true);
		}
		driver.close();
	}
}


package com.time.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoPOM 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testUserName()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//stores the username textbox address as @a1 in untbx
		WebElement untbx = driver.findElement(By.id("username"));
		//refresh the page and address of the username textbox will changes to @p1
		driver.navigate().refresh();
		//try to enter admin and username textbox using old address that is @a1
		untbx.sendKeys("admin");
	}

}

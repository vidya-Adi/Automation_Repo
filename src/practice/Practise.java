package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise 

{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./data/chromedriver.exe");
	}
	

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).click();
		driver.findElements(By.xpath("//div[@class='aajZCb']"));
		
		
		
		

	}

}

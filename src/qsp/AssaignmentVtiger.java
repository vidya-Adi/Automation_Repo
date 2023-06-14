package qsp;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssaignmentVtiger 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		driver.get("https://www.vtiger.com/");
		Actions a=new Actions(driver);
		WebElement resourcesTab = driver.findElement(By.partialLinkText("Resources"));
		a.moveToElement(resourcesTab).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		driver.findElement(By.partialLinkText("READ FULL STORY")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		

	}

}
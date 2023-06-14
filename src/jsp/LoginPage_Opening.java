package jsp;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage_Opening
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().pageLoadTimeout(7, TimeUnit.SECONDS);
		
		try
		{
			driver.get("https://demo.actitime.com/");
			System.out.println("page is loaded within 7 seconds");
		}
		catch(Exception e)
		{
			System.out.println("page is not loaded within 7 seconds");
		}
		driver.close();
		
	}
}
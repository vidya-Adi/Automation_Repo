package jsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook_date 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("//a[@rel='async']")).click();   //create new account
		
		driver.findElement(By.xpath("//select[@name='birthday_day'")).sendKeys("29");
		
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("june");
		
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1995");
		
		driver.close();
	}

}

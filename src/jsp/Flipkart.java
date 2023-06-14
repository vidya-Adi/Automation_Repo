package jsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[.='✕'")).click();
		
		
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 11");
		List<WebElement> text = driver.findElements(By.xpath("//span[contains(text(),'iphone 11')]"));
		int count=text.size();
		System.out.println("Total suggestions are:"+count);
		
		for(WebElement sugg:text)
		{
			System.out.println(text);
		}
		
		text.get(text.size()-1).click();
	
		

	}

}

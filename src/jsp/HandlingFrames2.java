package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames2
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/Desktop/Page1.html");
		
		driver.switchTo().frame(3);
		driver.findElement(By.id("t2")).sendKeys("a");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("d");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("e");
		WebElement frame = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("t2")).sendKeys("c");
		
	}
}
package jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YYYy 
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
       driver.get("https://www.amazon.in/");
       WebElement xp = driver.findElement(By.xpath("//input[@type='text']"));
       xp.sendKeys("mobile");
       driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
       driver.findElement(By.xpath("//span[contains(.,'Samsung') and @class=\"a-size-base a-color-base\"]")).click();
       int location = driver.findElement(By.xpath("//span[contains(text(),\"₹10,000 - ₹20,000\")]")).getLocation().getY();
       System.out.println(location);
       JavascriptExecutor je= (JavascriptExecutor)driver;
       je.executeScript("window.scrollBy(0,"+location+")");
       driver.findElement(By.xpath("//span[contains(text(),\"₹10,000 - ₹20,000\")]")).click();
       
	}

}

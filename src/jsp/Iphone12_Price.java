package jsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone12_Price 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iPhone 12");
		driver.findElement(By.xpath("//input[@type='text']")).submit();
		
		
		
		List<WebElement> text = driver.findElements(By.xpath("//div[@class='col col-7-12']//div[contains(text(),'iPhone 12')]"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='col col-7-12']//div[contains(text(),'iPhone 12')]/../..//div[2]/div[1]/div/div[1][contains(text(),'₹')]"));
		
		for(int i = 0; i < text.size(); i++)
		{
			 String pro = text.get(i).getText();
			 String p = price.get(i).getText();
			 System.out.println(pro+" -> "+p);
		}
		
		driver.close();
		
			

	}

}



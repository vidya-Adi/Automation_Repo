package jsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutQuitMethod 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> alltabs = driver.getWindowHandles();
		int count = alltabs.size();
		System.out.println(count);
		for(String tab:alltabs)
		{
			driver.switchTo().window(tab);
			driver.close();
		}
		
		

	}

}

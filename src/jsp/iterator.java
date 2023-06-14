package jsp;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iterator 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> alltabs = driver.getWindowHandles();
	    Iterator<String> itr = alltabs.iterator();
	    String pwh=itr.next();
	    String cwh=itr.next();
	    driver.switchTo().window(cwh);
	    driver.close();
	    driver.switchTo().window(pwh);
	    driver.close();
	}
}
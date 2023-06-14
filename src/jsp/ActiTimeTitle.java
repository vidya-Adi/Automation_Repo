package jsp;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTitle
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager"); //insect again
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.xpath("(//a[@class='item_link'])[13]")).click();
		driver.findElement(By.xpath("(//a[@href='javascript:void(0)'])[2]")).click();
		Set<String> alltabs = driver.getWindowHandles();
		Iterator<String> itr = alltabs.iterator();
		String pwh = itr.next();
		String cwh = itr.next();
		driver.switchTo().window(cwh); 
		
	
		List<WebElement> titles = driver.findElements(By.xpath("//h2"));
		for(WebElement wh:titles)
	
		{
			String Print = wh.getText(); 
			System.out.println(Print);
		}
		
		driver.close();
	
	
		
		
		
		
		
		

	}

}

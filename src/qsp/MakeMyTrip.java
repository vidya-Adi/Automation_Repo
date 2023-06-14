package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		//driver.findElement(By.xpath("//div[@class='autopop__wrap makeFlex column defaultCursor']")).click(); //popup try to use click here
		
		
		driver.findElement(By.xpath("//span[@class='lbl_input latoBold  appendBottom5']")).click();     
		driver.findElement(By.xpath("(//input[@type='text'][1])")).sendKeys("BLR");  
		
		driver.findElement(By.xpath("(//span[@class='lbl_input latoBold  appendBottom5'])[2]")).sendKeys("GOI");
		
		driver.findElement(By.xpath("//span[.='SEARCH']")).click();
		Set<String> alltabs = driver.getWindowHandles();
		Iterator<String> itr = alltabs.iterator();
		String pwh = itr.next();
		String cwh = itr.next();
		driver.switchTo().window(cwh);
		List<WebElement> titles = driver.findElements(By.xpath("//div[@id='left-side--wrapper']"));
		for(WebElement wh: titles)
		{
			 String Print = wh.getText();
			 System.out.println(Print);
			
			
		}
		driver.close();
		
		

	}

}

package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/Desktop/hotel.html");
		Thread.sleep(5000);
		WebElement mtrlistbox =driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		 s.selectByIndex(0);
		 s.selectByValue("v");
		 s.selectByVisibleText("dosa");
		 s.deselectByIndex(2);
		 s.deselectByVisibleText("idly");
		 s.deselectByValue("d");
		 System.out.println(s.isMultiple());
		 driver.close();
		
	}	

	}
	
	
	
	
	
	
	



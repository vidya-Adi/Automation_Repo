package jsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CarInsurance 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) 
	{
		
           WebDriver driver = new ChromeDriver();
           driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           
           driver.findElement(By.xpath("//input[@placeholder='Policy Number']")).sendKeys("123");
           driver.findElement(By.xpath("//input[@placeholder='DOB']")).click();
           WebElement monthlist = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
           Select m=new Select(monthlist);
           m.selectByIndex(0);
          
           
           
           WebElement yearlist = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
           Select y=new Select(yearlist);
		   
           y.selectByValue("1995");
           
           driver.findElement(By.xpath("//a[.='21']")).click();
           
           
           
         driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("9845775432");
         driver.findElement(By.xpath("//button[@class='submit-login']")).submit();
	}

}

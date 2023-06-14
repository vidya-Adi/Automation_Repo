package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) 
	{
	
     WebDriver driver=new ChromeDriver();
     driver.get("file:///C:/Users/ADMIN/Desktop/Demo.html");
     driver.findElement(By.cssSelector( "a[id='d1']" )).click();
     driver.navigate().back();
     driver.findElement(By.cssSelector("a[name='n1']"  )).click();
     driver.navigate().back();
     driver.findElement(By.cssSelector( "a[class='c1']" )).click();
     driver.navigate().back();
     driver.findElement(By.cssSelector("a[href='https://jspiders.com/']"  )).click();
     driver.close();
     }

}

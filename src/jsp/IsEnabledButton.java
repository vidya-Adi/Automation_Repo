package jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledButton 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //implicite wait
		driver.findElement(By.xpath("//a[@title=\"English (UK)\"]")).click();
		driver.findElement(By.xpath("//button[.='Log In']"));
		boolean e = driver.findElement(By.xpath("//button[.='Log In']")).isEnabled();
		System.out.println(e);
		if(e==true)
		{
			System.out.println("Button is working");
		}
		else
		{
			System.out.println("Button is not working");
		}
		
		driver.close();
		
		

	}

}

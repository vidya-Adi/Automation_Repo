package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * WAs to search for "Wipro jobs" in google.com and capture all the urls after navigating to search page (by clicking enter)
 * and print it on the console?
 */

public class WiPro 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@type='text']"));//search
		
		driver.findElement(By.xpath("//h3[@class=\"LC20lb DKV0Md\"]")).sendKeys("wipro");
		driver.findElement(By.xpath("//h3[@class=\"LC20lb DKV0Md\"]")).submit(); //continue
		WebElement link = driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']"));
		String htmlcode = link.getAttribute("outerHTML");
		System.out.println(htmlcode);
		driver.close();

	}

}

package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* open the browser
 * go to amazon.in
 * on the search box type pendrive
 * collect all the auto suggestion and display all
 * click on the 3rd suggestion 
 * 
 */
public class Azn 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pendrive");
		
		List<WebElement> text = driver.findElements(By.xpath("//div[contains(text(),'pendrive')]"));
		for(WebElement sugg: text)
		{
			System.out.println(text);
		}
		text.get(3).click();

	}

}

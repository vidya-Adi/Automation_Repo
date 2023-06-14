package jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEach 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		//opening browser and opening google.com
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//finding search box
		WebElement xp=driver.findElement(By.name("q"));
		xp.sendKeys("java");
		Thread.sleep(1000);
		//find all the autosuggestions and print the count
		List<WebElement> allAutoSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count =allAutoSugg.size();
		System.out.println(count);
		for(WebElement Sugg:allAutoSugg)
		{
			
			System.out.println(Sugg.getText());
		}
		Thread.sleep(1000);
		
		//clicking on the first autosuggestion
		allAutoSugg.get(0).click();
				
		


	}

}

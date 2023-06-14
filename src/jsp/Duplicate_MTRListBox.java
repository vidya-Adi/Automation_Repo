package jsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicate_MTRListBox 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		HashSet<String>hs=new HashSet<>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/Desktop/hotel.html");
		
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
	
		for(int i = 0; i < allOptions.size(); i++)
		{
			String text = allOptions.get(i).getText();
			if(hs.add(text)==false)   // if we use here true it prints only unique value
			{
				System.out.println(text);	
			}
			
			}
		
		driver.close();
	}

}



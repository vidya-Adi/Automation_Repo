package jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//write a script to select all the options present in all the mtr listbox and deselect them in reverse order.


public class SelectAllOptions 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/Desktop/hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> allOptions = s.getOptions();
		int count=allOptions.size();
		for(int i=0;i<count;i++)
		{
			s.selectByIndex(i);
		}
		for(int i=count-1;i>=0;i--)
		{
			s.deselectByIndex(i);
		}
		
		driver.close();

	}

}

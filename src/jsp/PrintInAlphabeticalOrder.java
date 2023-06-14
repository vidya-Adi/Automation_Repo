package jsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintInAlphabeticalOrder 
{
	static
	{
		    System.setProperty ("webdriver.chrome.driver", "./driver/chromedriver.exe" );
    }

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/Desktop/hotel.html");
		WebElement mtrlistbox =driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> allOptions = s.getOptions();
		for(int i=0;i<allOptions.size();i++)
		{
			String text=allOptions.get(i).getText();
			al.add(text);
		}
		Collections.sort(al);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		driver.close();

	}
	

}

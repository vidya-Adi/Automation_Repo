package jsp;
//
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel_Mtr_Without_Duplicates 
{
		static
		{
             System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		public static void main(String[] args) 
		{
			WebDriver driver = new ChromeDriver();
			HashSet<String> hs = new HashSet<>();
			driver.get("file:///C:/Users/ADMIN/Desktop/hotel.html");
		
			WebElement mtrListBox = driver.findElement(By.id("mtr"));
			Select s = new Select(mtrListBox);
			List<WebElement> allOptions = s.getOptions();
		
			for(int i = 0; i < allOptions.size(); i++)
			{
				String text = allOptions.get(i).getText();
				hs.add(text);
			}
			for(String text:hs)//set only support for each loop
			{
				System.out.println(text);
			}
			driver.close();
		}
}

//Q.	WAS to print all the duplicate options present in MTR list box?
	

//Q.	WAS to print all the options present in MTR list box in alphabetical order with and without using tree set? (Hint: use sort() which is present in collection class)
	




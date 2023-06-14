package jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.actitie.pom.CheckBoxPage;

public class AllCheckBox 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	}

	@Test
	public void testCheckBox() 
	{
	 WebDriver driver = new ChromeDriver();
	 driver.get("file:///C:/Users/ADMIN/Desktop/CheckBox.html");
	 CheckBoxPage c= new CheckBoxPage(driver);
	 c.setCheckBoxClick();
	 
   }
}

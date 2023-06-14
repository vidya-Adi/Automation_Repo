package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelFirstSelected 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/Desktop/hotel.html");
		Thread.sleep(3000);
		WebElement slvListBox = driver.findElement(By.id("slv"));
		Select s = new Select(slvListBox);
		s.selectByIndex(1);
		s.selectByValue("g");
		Thread.sleep(5000);
		WebElement firstOption = s.getFirstSelectedOption(); //to check first selected option from the list
		String text = firstOption.getText();
		System.out.println(text);
		driver.close();
		
	}

}

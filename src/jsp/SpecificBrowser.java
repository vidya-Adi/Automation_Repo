package jsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificBrowser 
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args)
	{
		System.out.println("Enter the title which you want to close");
		Scanner sc=new Scanner(System.in);
		String expectedTitle = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allwh = driver.getWindowHandles();
		for (String wh:allwh)
		{
			driver.switchTo().window(wh);
			String actualTitle=driver.getTitle();
			if(actualTitle.equals(expectedTitle))
			{
			driver.close();
		}
		
	}
	}

}

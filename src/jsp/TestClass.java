package jsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	
	@Test
	public void validLogin() throws InterruptedException
	{
		WebDriver driver  =new ChromeDriver();          //using initelement in mainmethod 
		driver.get("https://demo.actitime.com");
		LoginPage l= new LoginPage(driver);           // LoginPage l= new LoginPage( );
		l.setLogin("admin","manager");                 //PageFactory.initElements(driver,l);
		Thread.sleep(3000);                           //l.setLogin("admin","manager");
		l.setLogin("admin", "manager");
	}
	
	

}

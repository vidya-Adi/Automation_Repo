package jsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Actitime 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String title = p.getProperty("url");
		String un = p.getProperty("username");
	    String pw = p.getProperty("password");
	    
	    
	    driver.get(title);
	    driver.findElement(By.name("username")).sendKeys(un);
	    driver.findElement(By.name("pwd")).sendKeys(pw);
	    driver.findElement(By.id("loginButton")).click();	
		
	

	}

	
}

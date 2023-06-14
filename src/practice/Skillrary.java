package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillrary {
	static {
	System.setProperty ("webdriver.chrome.driver", "./driver/chromedriver.exe" );
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.skillrary.com/profile/qspiders");
	String s =driver.getPageSource();
	System.out.println(s);
	driver.close();
	
	}
	
	
	
	
}

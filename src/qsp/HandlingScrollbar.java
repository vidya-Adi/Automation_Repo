package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingScrollbar 
{
	static

	{
	    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }


public static void main(String[] args) 
{
    WebDriver driver =new ChromeDriver();
    driver.get("https://www.bbc.com/");
    JavascriptExecutor j=(JavascriptExecutor)driver;
    j.executeScript("window.scrollBy(0,4000)");
    
}

}
    

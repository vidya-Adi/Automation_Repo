package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Automation\\driver\\chromedriver.exe");
//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");//to open browser
driver.close();//to close the browser


   }

}

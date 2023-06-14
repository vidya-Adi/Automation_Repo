package jsp;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZZZZX {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test
	public void asdf() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(.,\"Living\")and @class=\"topnav_itemname\"]")).click();
		driver.findElement(By.xpath("//span[contains(.,\"Lounge Chairs\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),\"Close\")]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),\"Genoa Wing Chair \")])[1]")).click();
		Set<String> allwd = driver.getWindowHandles();
		Iterator<String> itr = allwd.iterator();
		String main = itr.next();
		String child = itr.next();

		driver.switchTo().window(child);
		driver.findElement(By.xpath("//a[contains(text(),\"Close\")]")).click();
		String valuePrice = driver.findElement(By.xpath("//*[@content=\"18639.2\"]")).getAttribute("content");

		double price = Double.parseDouble(valuePrice);
		int actualPrice = (int) price;
		if (actualPrice < 20000) {
			driver.findElement(By.xpath("(//button[contains(text(),\"Add to Cart\")])[4]")).click();

		}
		String expectedTitle = "Cart";
		String actualtittle = driver.findElement(By.xpath("//span[.=\"1. Cart\"]")).getText();
		Assert.assertEquals(actualtittle.contains(expectedTitle), true);
		driver.quit();
		

	}

}
package jsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class DemoRobotClass 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws IOException, AWTException 
	{
       Runtime.getRuntime().exec("notepad");
       Robot r=new Robot();
       r.keyPress(KeyEvent.VK_SHIFT);
       r.keyPress(KeyEvent.VK_Q);
       r.keyPress(KeyEvent.VK_SHIFT);
       r.keyPress(KeyEvent.VK_S);
       r.keyPress(KeyEvent.VK_SHIFT);
       r.keyPress(KeyEvent.VK_P);
	}

}

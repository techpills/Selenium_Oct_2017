package java_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TextBox {

	public static void main(String args[]) throws InterruptedException
	{
		//Set the IE Driver path 
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\VK5033314\\Documents\\Selenium Resources\\IEDriverServer.exe"); 
		//Invoke the Internet explorer 
		//WebDriver driver = new InternetExplorerDriver(); 
		
		//Invoke Firefox Driver
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//
		driver.get("http://www.calculator.net/percent-calculator.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("cpar1")).sendKeys("10");
		
		 Thread.sleep(5000);
		 
		 String result = driver.findElement(By.id("cpar1")).getAttribute("value");
		 
		 System.out.println(" The Result is " + result);
		 
		 
	}	
}

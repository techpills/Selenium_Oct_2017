package allSocialShare;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gtattribute {
	
	public static void main(String args[])
	
	{
		//Launching the firefoxbrowser
		WebDriver driver = new FirefoxDriver();
		
	    //Implicit wait, this method is used to wait for the webelement to load  
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		
		//Navigate to FB page
		driver.get("http://www.facebook.com");
		
		//typing the texts using sendkeys method for user id and password
		 driver.findElement(By.id("email")).sendKeys("xxxxx@gmail.com");   
		 driver.findElement(By.id("pass")).sendKeys("xxxxx@123");  
		 driver.findElement(By.id("loginbutton")).click(); 
		 
		 //Navigate to google search page
		 driver.navigate().to("https://www.google.com");
		 
		 //Enter the text using SHIFT keys in search box
		 WebElement gsearch = driver.findElement(By.name("q"));
		 gsearch.sendKeys(Keys.chord(Keys.SHIFT,"qa freaks"));
		 
		
	}
}

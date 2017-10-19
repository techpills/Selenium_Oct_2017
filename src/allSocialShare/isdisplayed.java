package allSocialShare;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isdisplayed {
	
	public static void main(String args[])
	
	{
		//Launching the firefoxbrowser
		WebDriver driver = new FirefoxDriver();
		
	    //Implicit wait, this method is used to wait for the webelement to load  
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		
		//Navigate to FB page
		driver.get("http://www.facebook.com");
		
		//
		WebElement loginbutton = driver.findElement(By.id("loginbutton"));
		
		boolean boolloginbutton = loginbutton.isDisplayed();
		
		if(boolloginbutton == true)
		{
			System.out.println("Login Button is present");
		}
			else
		{
			System.out.println("Loging Button is NOT present");
		}
	}
}

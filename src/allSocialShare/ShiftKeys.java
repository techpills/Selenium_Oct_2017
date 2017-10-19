package allSocialShare;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ShiftKeys {
	
	public static void main(String args[])
	{
//invoke firefox browser
WebDriver dr = new FirefoxDriver();
		
//navigate to onedrive.com cloud storage
dr.get("http://www.google.com");
		
//Implicit wait, this method is used to wait for the webelement to load  
dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
Actions builder = new Actions(dr);

//SHIFT key for UPPER case or LOWER case
builder.keyDown(Keys.SHIFT)
.sendKeys("wORLD wRestling fEDERATION")
.perform();
	} 
	}
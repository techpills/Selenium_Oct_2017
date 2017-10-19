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

public class clickCurrentLocation {
	
	public static void main(String args[])
	{
//invoke firefox browser
WebDriver dr = new FirefoxDriver();
		
//navigate to onedrive.com cloud storage
dr.get("https:\\www.google.com");
		
//Implicit wait, this method is used to wait for the webelement to load  
dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
//searching the image using source of the google.com pictures. you need to 
//replace the contains keyword search as it is dynamic value
WebElement gogldodlImage = dr.findElement(By.xpath("//img[contains(@src, 'google-gameday-doodle-4-6521809350426624.2')]"));
		
//Actions and performing
Actions builder = new Actions(dr);
dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
builder.moveByOffset(gogldodlImage.getLocation().x, gogldodlImage.getLocation().y).click();

// Perform the action.
builder.perform(); 		
} 
}
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

public class moveByOffset {
	
	public static void main(String args[])
	{
		//invoke firefox browser
		WebDriver dr = new FirefoxDriver();
		
		//navigate to onedrive.com cloud storage
		dr.get("https://onedrive.live.com");
		
		//Implicit wait, this method is used to wait for the webelement to load  
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		//assigning the webelement variables
		WebElement signin = dr.findElement(By.xpath(".//*[@id='site-nav']/div/nav/ul[2]/li[3]/a"));
		
		//click the Sign in button
		signin.click();
		
		//Assign the variable for email login input field
		WebElement emailid = dr.findElement(By.name("email"));
		//Type user id;
		emailid.sendKeys("onlytest1911@outlook.com");
		
		dr.findElement(By.cssSelector(".btn.submit")).click();
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//EnterPassword
		dr.findElement(By.name("passwd")).sendKeys("blue@123");
		
		//Click Signin
		dr.findElement(By.name("SI")).click();
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement worddoc = dr.findElement(By.xpath("//img[contains(@src, '6XcJqOouagIrfO')]"));
		WebElement DocumentFolder = dr.findElement(By.xpath(".//*[text()='Documents']"));
		
		//List<WebElement> ll = dr.findElements(By.className("ItemCheck"));
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> ll = dr.findElements(By.className("ItemCheck"));
		
		System.out.println(ll.get(0).getLocation());
		
		//Point listaxis = ll.get(0).getLocation();
		
		//((WebElement) listaxis).click();
		
		//Performing CTRL + CLICK option using Actions/Builder/Perform  
		Actions builder = new Actions(dr);
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		builder.moveByOffset(ll.get(2).getLocation().x, ll.get(2).getLocation().y)
		.click();

		// Perform the action.
		builder.perform(); 
		
	} 
}

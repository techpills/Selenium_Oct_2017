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

public class ClickOnWebElement {
	
	public static void main(String args[]) throws InterruptedException
	{
		//invoke firefox browser
		WebDriver dr = new FirefoxDriver();
		
		//Google Drive Login - replace your login info with XXXXXXXXX
		dr.get("https:\\www.drive.google.com");   
	    dr.findElement(By.id("Email")).sendKeys("xxxxxxxxx");
	    dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    dr.findElement(By.id("next")).click();
	    dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    dr.findElement(By.id("Passwd")).sendKeys("xxxx@xxxx");
	    Thread.sleep(1000);
	    dr.findElement(By.id("signIn")).click(); 
	    Thread.sleep(5000);

				
		//Implicit wait, this method is used to wait for the webelement to load  
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				
		//locating the webelement with id : replace the id below
		WebElement clickFirstElement = dr.findElement(By.id(":1v.0B7TXlJomtjRdc3RhcnRlcl9maWxl"));
		WebElement clickSecondElement = dr.findElement(By.id(":1v.1PwjVbBhDDCKbp_yyK-XCr5EmBpRENEB7JHl2t0JGR5I"));
				
		//Actions and performing // it will click two files or folder with the located id 
		Actions builder = new Actions(dr);
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		builder.click(clickFirstElement);
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		builder.click(clickSecondElement);
		
		// Perform the action.
		builder.perform(); 		

}
}
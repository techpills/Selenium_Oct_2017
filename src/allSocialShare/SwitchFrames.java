package allSocialShare;
import java.io.File;  
import java.io.IOException;  

import org.apache.commons.io.FileUtils;  
import org.openqa.selenium.By;  
import org.openqa.selenium.OutputType;  
import org.openqa.selenium.TakesScreenshot;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.interactions.Actions;

public class SwitchFrames {  

   
 public static void main(String args[]) throws IOException, InterruptedException
 {
	 WebDriver driver = new FirefoxDriver();
	 driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_frame_cols");
	 Thread.sleep(10000);
	 Actions action = new Actions(driver);
	 driver.switchTo().frame(0);
	driver.findElement(By.xpath("html/body/p/strong")).click();
	 //driver.switchTo().defaultContent();
	 
	 driver.switchTo().frame(1);
	 driver.findElement(By.xpath("html/body/h3")).click();
	
 	}
 }
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

public class SwitchBrowserWindow {  

   
 public static void main(String args[]) throws IOException, InterruptedException
 {
 	 WebDriver driver = null;  

 	driver = new FirefoxDriver();
 	driver.get("http://www.microsoft.com/en-us/privacystatement/default.aspx");
 	String winBrowser_1 = driver.getWindowHandle();
 	System.out.println("First Window Handle is: "+winBrowser_1);
 	WebElement link = driver.findElement(By.id("psp_microsoft_services_agreement"));
 	link.click();
 	
 	String winBrowser_2 = driver.getWindowHandle();
 	Thread.sleep(10000);
 	System.out.println("Second Window Handle is: "+winBrowser_2);
 	System.out.println("Window Handles Count " 	+driver.getWindowHandles().size());
 	Thread.sleep(5000);
 	driver.switchTo().window(winBrowser_1);
 	}
 }
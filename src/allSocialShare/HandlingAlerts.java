package allSocialShare;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HandlingAlerts {
	
	
		
		public static void main(String[] args) throws InterruptedException{
			
		 System.setProperty("webdriver.chrome.driver", "C://Selenium_Training//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();


	//Launching qafreaks website and click the try it button for popup alert
	driver.get("http://www.qafreaks.com/p/example-for-javascript-to-handle-alerts.html");
	WebElement element = driver.findElement(By.id("tryit"));
	
	//Printing the element text on the console
	System.out.println(element.getText());
	element.click();
	
    Thread.sleep(10000);	
    
    //Handling alert to accept
	//driver.switchTo().alert().accept();
    
    //Cancelling the alert
    Alert alert = driver.switchTo().alert();
    alert.dismiss();
    
    
	
 
		}

}


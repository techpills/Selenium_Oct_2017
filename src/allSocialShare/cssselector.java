package allSocialShare;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssselector{
public static void main(String[] args){

//Launching the firefoxbrowser
WebDriver driver = new FirefoxDriver();
			
//Implicit wait, this method is used to wait for the webelement to load  
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
			
//Navigate to Google search page
driver.get("http://www.google.com");

//click the value using cssSelector method
driver.findElement(By.cssSelector("#lst-ib")).sendKeys("www.qafreaks.com");

}
}
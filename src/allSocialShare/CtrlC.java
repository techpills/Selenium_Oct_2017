package allSocialShare;

import java.util.List;
import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.*;  
import org.openqa.selenium.firefox.FirefoxDriver;  

public class CtrlC{
public static void main(String[] args) throws InterruptedException{

//Launching firefox Browser
WebDriver driver = new FirefoxDriver();

//Launching google search 
driver.get("http://www.google.com");

Thread.sleep(5000);

driver.findElement(By.name("q")).sendKeys(Keys.CONTROL + "v");

}
}
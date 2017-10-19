package allSocialShare;

import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.*;  
import org.openqa.selenium.firefox.FirefoxDriver;  

public class byName {
public static void main(String[] args){
	
//invoking firefox browser	
WebDriver driver = new FirefoxDriver();

//Launching bing website
driver.get("http://www.bing.com");

//Assigning the name attribute value to the variable using By.name
WebElement Bsearch = driver.findElement(By.name("go"));

driver.findElement(By.id("sb_form_q")).sendKeys("www.qafreaks.com");

//Submit the search button
Bsearch.submit();
}
}
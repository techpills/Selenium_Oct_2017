package allSocialShare;

import java.util.List;
import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.*;  
import org.openqa.selenium.firefox.FirefoxDriver;  

public class bytagname{
public static void main(String[] args){

//Launching firefox Browser
WebDriver driver = new FirefoxDriver();

//Launching linkedin.com
driver.get("http://www.linkedin.com");

//Getting all the button tagname and listing in to an array
List<WebElement> Lbuttonlist = driver.findElements(By.tagName("button"));

//printing the result into the console
System.out.println(Lbuttonlist);
}
}
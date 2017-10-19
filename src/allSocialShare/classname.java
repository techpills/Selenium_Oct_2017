package allSocialShare;

import java.util.List;
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.*;  
import org.openqa.selenium.firefox.FirefoxDriver;  

public class classname {
public static void main(String[] args){

//Launching firefox Browser
WebDriver driver = new FirefoxDriver();

//Launching facebook.com
driver.get("http://www.facebook.com");

//Getting the classname value and assigning it to variable
WebElement fClassName = driver.findElement(By.className("inputtext"));

//printing the result into the console
System.out.println(fClassName);
}
}
package java_test;

import java.io.File;  
import java.io.IOException;  

import org.apache.commons.io.FileUtils;  
import org.openqa.selenium.By;  
import org.openqa.selenium.OutputType;  
import org.openqa.selenium.TakesScreenshot;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;  

public class InsideDivider {  

private static WebDriver driver = null;  

public static void main(String args[]) throws IOException, InterruptedException
{

//Open Chrome Browser
System.setProperty("webdriver.chrome.driver", "C:/Project1/lib/driver/chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize(); 

//Open QAFreaks.com
driver.get("http://www.qafreaks.blogspot.com/p/selenium-links.html");

//find inner value of div which has classname to get the attribute value of itemprop;
String insideDiv = driver.findElement(By.xpath("//div[@class='post-body entry-content']")).getAttribute("itemprop");

System.out.println(driver.findElement(By.xpath("//div[@class='post-body entry-content']")).getAttribute("itemprop"));
 
//Wait for some seconds sleep mode
Thread.sleep(5000);
}  
}  

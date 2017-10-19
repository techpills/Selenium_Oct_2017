package java_test;

import java.io.File;  
import java.io.IOException;  
import org.apache.commons.io.FileUtils;  
import org.openqa.selenium.By;  
import org.openqa.selenium.OutputType;  
import org.openqa.selenium.TakesScreenshot;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;  

public class testing {  

private static WebDriver driver = null;  

public static void main(String args[]) throws IOException, InterruptedException
{

//Open Chrome Browser
System.setProperty("webdriver.chrome.driver", "C:/SeleniumResources/chromedriver.exe");
driver = new ChromeDriver();
 

//Open QAFreaks.com
driver.get("http://www.qafreaks.com");  
driver.findElement(By.linkText("Home")).click();  
 
//Wait for some seconds sleep mode
Thread.sleep(5000);
  
  //Takes the screenshot  when test fails  
     File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
     FileUtils.copyFile(scrFile, new File("C:\\Selenium_Screenshots\\QaFreaks_Home_TestPass.png"));  

  }  
 }  

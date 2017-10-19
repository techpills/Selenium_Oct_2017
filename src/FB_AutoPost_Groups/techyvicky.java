package FB_AutoPost_Groups;

import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.lang.reflect.InvocationTargetException; 
import java.util.concurrent.TimeUnit;   

import org.apache.poi.xssf.usermodel.XSSFSheet; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
import org.openqa.selenium.*;   
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.Random;
import java.util.StringTokenizer;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

 
public class techyvicky {
		
 private static WebDriver driver = null;

  
 public static void main(String[] args) throws InterruptedException, IOException {   
 //Create a new instance of the Chrome driver   
// System.setProperty("webdriver.chrome.driver", "C://Selenium_Training//chromedriver.exe");
	// Create a new instance of the Chrome driver   
		System.setProperty("webdriver.chrome.driver", "C://Selenium_Training//chromedriver.exe"); 

	// File pathToBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	// FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	// FirefoxProfile firefoxProfile = new FirefoxProfile();       

		 WebDriver driver=new ChromeDriver();
	
driver.get("http://techyvicky.com");
 
 	   for (int i =1; i <=10000; i++)
    	 { 
 
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

      driver.get("http://techyvicky.com");
      driver.get("http://www.qafreaks.com");
         Thread.sleep(100);
         //driver.switchTo().activeElement().click();
        // Thread.sleep(randomInt);
     
    	 }
 }
}
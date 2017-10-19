package FB_AutoPost_Groups;

import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.lang.reflect.InvocationTargetException; 
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
import org.openqa.selenium.*;   
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.Random;
import java.util.StringTokenizer;

import org.openqa.selenium.firefox.FirefoxDriver;

//import com.gargoylesoftware.htmlunit.BrowserVersion;

 
public class EbayIndia {
	private static XSSFCell cell;
	private static XSSFRow row;
	private static WebDriver driver = null;
 private static String path = "C://New folder//fbgrouplist.xlsx";

  
 public static void main(String[] args) throws InterruptedException {   
 //Create a new instance of the Chrome driver   
 //System.setProperty("webdriver.chrome.driver", "C://Selenium_Training//chromedriver.exe");
	// Create a new instance of the Chrome driver   
		//System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe"); 

	// File pathToBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	// FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	// FirefoxProfile firefoxProfile = new FirefoxProfile();       
	// WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
	 System.setProperty("webdriver.gecko.driver", "C://Selenium_Training//geckodriver.exe");
 //WebDriver driver=new FirefoxDriver();
 
 ProfilesIni profile = new ProfilesIni();

	FirefoxProfile myprofile = profile.getProfile("Buffer");

	driver = new FirefoxDriver(myprofile);
 
 //WebDriver driver=new ChromeDriver();
driver.get("http://cgi5.ebay.in/ws/eBayISAPI.dll?SellHub3");
 

 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
 driver.findElement(By.id("aidZ6")).click();
driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
driver.findElement(By.id("keywords")).sendKeys("motherboard");
 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
driver.findElement(By.id("aidZ4")).click();
driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
Actions builder = new Actions(driver);
builder.sendKeys(Keys.TAB)
.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB);

Actions compositeaction = builder.click();
compositeaction.perform();
driver.findElement(By.className("accorRightHeaderReply")).click();	
     } 
     }
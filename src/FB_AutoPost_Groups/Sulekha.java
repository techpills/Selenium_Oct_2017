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
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

import org.openqa.selenium.firefox.FirefoxDriver;

//import com.gargoylesoftware.htmlunit.BrowserVersion;

 
public class Sulekha {
	private static XSSFCell cell;
	private static XSSFRow row;
	private static WebDriver driver = null;
 private static String path = "C://Selenium//sheets//fbgrouplist.xlsx";
private static String url = "https://www.youtube.com/watch?v=2ymkDe8o6Eg";
  
 public static void main(String[] args) throws InterruptedException {   
 //Create a new instance of the Chrome driver   s
 //System.setProperty("webdriver.chrome.driver", "C://Selenium_Training//chromedriver.exe");
	// Create a new instance of the Chrome driver   w
		//System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe"); 

	// File pathToBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	// FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	// FirefoxProfile firefoxProfile = new FirefoxProfile();       
	// WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
	 System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver.exe");
 //WebDriver driver=new FirefoxDriver();
 
 ProfilesIni profile = new ProfilesIni();

	FirefoxProfile myprofile = profile.getProfile("Buffer");

	driver = new FirefoxDriver(myprofile);
 
 //WebDriver driver=new ChromeDriver();
driver.get("http://localservices.sulekha.com/educational-lessons/act-tutor-in-phoenix-metro-area");
//String cssSelectorOfSameElements=".gobtn.gobtn-primary";

List<WebElement> a=driver.findElements(By.cssSelector(".gobtn.gobtn-primary")) ;
System.out.println(a.size());
Thread.sleep(8000);
for(int i=8; i<=a.size(); i++)
{
	
	try {
a.get(i).click();
Thread.sleep(8000);
		driver.findElement(By.id("txtlslcfnamepopup")).sendKeys("Steve Austin\n");
		driver.findElement(By.id("txtlslcfemailpopup")).sendKeys("onlyfortest1901@gmail.com");
		driver.findElement(By.id("txtlslcfmobilenopopup")).sendKeys("6025550123");
		driver.findElement(By.id("txtlslcfservicedescriptionpopup")).sendKeys("AMAZON GREAT DEALS 90% OFFER");
		driver.findElement(By.id("txtlslcfservicedescriptionpopup")).sendKeys("\n");
		driver.findElement(By.id("txtlslcfservicedescriptionpopup")).sendKeys("http://amzn.to/2hIsqxf");
		Thread.sleep(8000);
		driver.findElement(By.id("alslcfgetquotepopup")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='divlslcfoverallpopup']/div[1]/div/div[1]/a")).click();
		Thread.sleep(8000);
}//.//*[@id='divlslcfsecondpopup']/div[5]/a

catch(Exception e)
{
	
}
}
 }
 }
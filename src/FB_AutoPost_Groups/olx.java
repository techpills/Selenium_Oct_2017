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
import java.util.Random;
import java.util.StringTokenizer;

import org.openqa.selenium.firefox.FirefoxDriver;

//import com.gargoylesoftware.htmlunit.BrowserVersion;

 
public class olx {
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
	
driver.get("https://www.olx.in/item/red-bear-plush-toy-ID1fJdql.html#4edf59ba09");
Thread.sleep(8000);
for(int i=0; i<=100; i++)
{
	try {
		driver.findElement(By.id("ask-text2")).clear();
		driver.findElement(By.id("ask-text2")).sendKeys("UNBOXING : Mattel Justice League Multiverse Action Figure - Cyborg (6 inch) : Hobbies & Collectibles\n");
		driver.findElement(By.id("ask-text2")).sendKeys("\n");
		driver.findElement(By.id("ask-text2")).sendKeys("https://www.youtube.com/watch?v=kIxP2xH4Cec&list=PLLKmTFb-30OnmDsmSf4vjN9SxUkPtjVp_\n");
		driver.findElement(By.id("ask-text2")).sendKeys("\n");
		
		driver.findElement(By.id("ask-text2")).sendKeys("How to download YouTube videos to iPhone & iPad And watch them of offline?\n");
		driver.findElement(By.id("ask-text2")).sendKeys("\n");
		driver.findElement(By.id("ask-text2")).sendKeys("https://www.youtube.com/watch?v=593cEPjBIKU&list=PLLKmTFb-30Onzcxa-T-mc_pAyOnxywDAJ\n");
		driver.findElement(By.id("ask-text2")).sendKeys("\n");
		//WebElement attach = driver.findElement(By.xpath(".//*[@id='upload-a']/span[2]/span"));
		//attach.click();
		//WebElement browse = driver.findElement(By.id("attachment0")); 
		//browse.sendKeys("C:\\Selenium\\Resume.zip");
		System.out.println("No."+i+"Uploaded");
/*driver.findElement(By.id("ask-text2")).sendKeys("CLICK ON AMAZON FOR 90% OFFER");
driver.findElement(By.id("ask-text2")).sendKeys("\n");
driver.findElement(By.id("ask-text2")).sendKeys("http://amzn.to/2xIs5p6");
driver.findElement(By.id("ask-text2")).sendKeys("\n");
driver.findElement(By.id("ask-text2")).sendKeys(url);*/
Thread.sleep(8000);
driver.findElement(By.cssSelector(".cfff.large.sendchat")).click();
Thread.sleep(8000);
driver.navigate().back();
Thread.sleep(8000);
driver.findElement(By.partialLinkText("Next Ad")).click();
}

catch(Exception e)
{
	
}
}
 }
 }
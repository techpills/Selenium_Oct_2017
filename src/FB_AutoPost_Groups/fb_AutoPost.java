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

 
public class fb_AutoPost {
		
 private static WebDriver driver = null;
 private static String path = "C://New folder//testdata_.xlsx";

  
 public static void main(String[] args) throws InterruptedException {   
 //Create a new instance of the Chrome driver   
 System.setProperty("webdriver.chrome.driver", "C://Selenium_Training//chromedriver.exe");
	// Create a new instance of the Chrome driver   
		//System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe"); 

	// File pathToBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	// FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	// FirefoxProfile firefoxProfile = new FirefoxProfile();       
	// WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
 //WebDriver driver=new FirefoxDriver();
 
 ProfilesIni profile = new ProfilesIni();

	FirefoxProfile myprofile = profile.getProfile("Buffer");

	driver = new FirefoxDriver(myprofile);
 
 //WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
 
 /*driver.findElement(By.id("email")).sendKeys("blueonelove82@gmail.com");
 driver.findElement(By.id("pass")).sendKeys("Phoenix@567");  
 driver.findElement(By.id("loginbutton")).click();*/
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

 //alert.dismiss();
 //WebDriverWait wait = new WebDriverWait(driver, 20);
//driver.switchTo().activeElement().click();

//driver.switchTo().alert().accept();
 //Accepting alert.
 //alert.accept();
//driver.findElement(null).sendKeys(Keys.ESCAPE);
// Random randomGenerator = new Random();
 //int randomInt = randomGenerator.nextInt(100);
 
 //Thread.sleep(randomInt);	
 //Thread.sleep(1000);
 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
 
 try { 
 FileInputStream file = new FileInputStream(new File(path)); 
 XSSFWorkbook workbook = new XSSFWorkbook(file); 
 XSSFSheet sheet = workbook.getSheetAt(0); 
  
   //for (int i =101; i <= sh	eet.ge	tLastRowNum(); i++)
	   for (int i=487 ; i <=490; i++)
    	 { 
     String keyword = sheet.getRow(i).getCell(0).getStringCellValue( );
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

         driver.get(keyword);
         //driver.switchTo().activeElement().click();
        // Thread.sleep(randomInt);
     
         //Posting status or message in groups
         
        // ADT - Plug In - https://dl-ssl.google.com/android/eclipse/
        
         WebElement returnhome = null;
         WebElement textarea = null;
         WebElement JoinGroup = null;
         
        
           	 //driver.findElement(By.tagName("textarea")).click();
             //driver.findElement(By.tagName("textarea")).sendKeys("https://www.youtube.com/watch?v=gGgBcs6lqcg"); 
           		 
           		//driver.findElement(By.tagName("textarea")).sendKeys("https://www.youtube.com/watch?v=Z79e0zYSbs0&index=1&list=PLLKmTFb-30OlX-2tT2-m3o-Qq-zNdwiUp");
           	 Thread.sleep(7000);
             //driver.findElement(By.tagName("textarea")).sendKeys(Keys.CONTROL, "v"); 
             
             //driver.findElement(By.tagName("textarea")).sendKeys("https://goo.gl/Nq2Ir0");
             //WebElement postButton = driver.findElement(By.cssSelector("._42ft._4jy0._11b._4jy3._4jy1.selected._51sy"));
             //postButton.click();
         /*    Thread.sleep(randomInt);
             Actions builder = new Actions(driver);
             builder.sendKeys(Keys.TAB)
             .sendKeys(Keys.TAB)
             .sendKeys(Keys.TAB)
             .sendKeys(Keys.TAB)
             .sendKeys(Keys.TAB)
             .sendKeys(Keys.TAB)
             .sendKeys(Keys.TAB)
             .sendKeys(Keys.TAB)
             .sendKeys(Keys.ENTER);
             Action compositeaction = builder.build();
             compositeaction.perform();
             Thread.sleep(randomInt); */
                 
             //driver.findElement(By.cssSelector(".UFILikeLinkIcon.img.sp_CyzWktPCcmJ.sx_5a6285")).click();
             
        
         //CLICK post Button             
  
         //driver.findElement(By.tagName("textarea")).sendKeys(Keys.chord(Keys.CONTROL + "v"));
         
         //WaitforSometime
         //Thread.sleep(randomInt);
         System.out.println("No." +i+ " Posted on Group Name: " +keyword);
         
     
     }
 
	   workbook.close(); 
       file.close(); 
     } catch (FileNotFoundException fnfe) { 
     fnfe.printStackTrace(); 
     } catch (IOException ioe) { 
     ioe.printStackTrace(); 
     } 
     } 
     }
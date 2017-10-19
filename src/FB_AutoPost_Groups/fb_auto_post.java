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
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
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

//import com.gargoylesoftware.htmlunit.BrowserVersion;

 
public class fb_auto_post {
		
 private static WebDriver driver = null;

 
  
 public static void main(String[] args) throws InterruptedException, IOException {   
 //Create a new instance of the Chrome driver   
 System.setProperty("webdriver.chrome.driver", "C://Selenium_Training//chromedriver.exe");
	// Create a new instance of the Chrome driver   
		//System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe"); 

	// File pathToBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	// FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	// FirefoxProfile firefoxProfile = new FirefoxProfile();       
	// WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
 //WebDriver driver=new FirefoxDriver();
ChromeDriver driver=new ChromeDriver();
driver.get("https:\\www.facebook.com");
 
 driver.findElement(By.id("email")).sendKeys("vikan.kg@gmail.com");
 driver.findElement(By.id("pass")).sendKeys("america@567");  
 driver.findElement(By.id("loginbutton")).click();
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

 //alert.dismiss();
 //WebDriverWait wait = new WebDriverWait(driver, 20);
//driver.switchTo().activeElement().click();

//driver.switchTo().alert().accept();
 //Accepting alert.
 //alert.accept();
//driver.findElement(null).sendKeys(Keys.ESCAPE);
 Random randomGenerator = new Random();
 int randomInt = randomGenerator.nextInt(100);
 


 
 try { 
 FileInputStream file = new FileInputStream(new File("C://New folder//testdata.xlsx")); 
 XSSFWorkbook workbook = new XSSFWorkbook(file); 
 XSSFSheet sheet = workbook.getSheetAt(0); 
  
   //for (int i =101; i <= sh	eet.ge	tLastRowNum(); i++)
	   for (int i =206; i <=210; i++)
    	 { 
     String keyword = sheet.getRow(i).getCell(0).getStringCellValue( );
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.navigate().to(keyword);
         //driver.switchTo().activeElement().click();
        // Thread.sleep(randomInt);
     
         //Posting status or message in groups
         
        // ADT - Plug In - https://dl-ssl.google.com/android/eclipse/
        
         WebElement returnhome = null;
         WebElement textarea = null;
         WebElement JoinGroup = null;
         
         try
         {
  //      	 returnhome = driver.findElement(By.className("_1mf _1mj"));
    //    	 driver.findElement(By.tagName("textarea")).sendKeys("How to Mirror Your iPhone or iPad's Screen on Your Windows or Mac PC? Free tool"); 
      //  	 driver.findElement(By.tagName("textarea")).sendKeys("https://www.youtube.com/watch?v=G8ZCHE7PY0w&list=PLLKmTFb-30OkaB1csi7c91wCNyjrwTx2w");
         }
         catch(Exception e)
         {
        	 
         }
       driver.findElement(By.tagName("textarea")).click();
       Thread.sleep(10000);
//        driver.findElement(By.tagName("textarea")).sendKeys("https://www.youtube.com/watch?v=gGgBcs6lqcg"); 
       	//driver.findElement(By.tagName("textarea")).sendKeys("https://www.youtube.com/watch?v=Z79e0zYSbs0&index=1&list=PLLKmTFb-30OlX-2tT2-m3o-Qq-zNdwiUp");
       	
           	//driver.findElement(By.className("_5rpb")).sendKeys("How to Mirror Your iPhone or iPad's Screen on Your Windows or Mac PC? Free tool");
            //driver.findElement(By.className("_5rpb")).sendKeys("https://www.youtube.com/watch?v=Z79e0zYSbs0&list=PLLKmTFb-30OlX-2tT2-m3o-Qq-zNdwiUp");   
           //driver.findElement(By.className("_5rpb")).sendKeys(Keys.CONTROL, "v"); 
             
             //driver.findElement(By.tagName("textarea")).sendKeys("https://goo.gl/Nq2Ir0");
             //WebElement postButton = driver.findElement(By.cssSelector("._42ft._4jy0._11b._4jy3._4jy1.selected._51sy"));
             //postButton.click();
            
                
        
         //CLICK post Button             
         
         //driver.findElement(By.tagName("textarea")).sendKeys(Keys.chord(Keys.CONTROL + "v"));
         
         //WaitforSometime
         Thread.sleep(randomInt);
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
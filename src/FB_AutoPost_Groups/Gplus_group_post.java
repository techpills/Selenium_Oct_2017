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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.Random;
import java.util.StringTokenizer;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Gplus_group_post {
		
 private static WebDriver driver = null;
 static String path = "C://Selenium//sheets//Gplus_URL_New.xlsx";
 
 public static void main(String[] args) throws InterruptedException 
 {   
	 System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver.exe");

 
 ProfilesIni profile = new ProfilesIni();

	FirefoxProfile myprofile = profile.getProfile("Buffer");

	driver = new FirefoxDriver(myprofile);
 
 Thread.sleep(8000);
 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
 
 try { 
 FileInputStream file = new FileInputStream(new File(path)); 
 XSSFWorkbook workbook = new XSSFWorkbook(file); 
 XSSFSheet sheet = workbook.getSheetAt(0); 
  
   //for (int i =101; i <= sh	eet.ge	tLastRowNum(); i++)
	   for (int i=15; i <=20; i++)
    	 {
		   String keyword = sheet.getRow(i).getCell(0).getStringCellValue( );
		     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


		   driver.navigate().to(keyword);

		   Thread.sleep(10000);
		   driver.findElement(By.cssSelector(".jXDCJf.Tek5Ce.BDrJf")).click();
		   Thread.sleep(10000);
		   driver.findElement(By.id("XPxXbf")).click();
		   Thread.sleep(10000);
		   driver.findElement(By.id("XPxXbf")).sendKeys(Keys.CONTROL, "v");
		   Thread.sleep(10000);
		   driver.findElement(By.id("XPxXbf")).clear();
		   driver.findElement(By.xpath(".//*[@id='yDmH0d']/div[4]/div[2]/div[2]/c-wiz/c-wiz/content/div[2]/div[3]/content/span")).click();
		   Thread.sleep(10000);
		   //driver.findElement(By.xpath(".//*[@id='yDmH0d']/div[4]/div[2]/div[2]/c-wiz/c-wiz/content/div[3]/div[3]/content/span")).click();
		   //Thread.sleep(20000);
		   try
		   {
			   driver.findElement(By.xpath(".//*[@id='dwrFZd1']/div/div/content[1]/div[2]")).click();
			   Thread.sleep(20000);
		   }
		   catch(Exception e)
		   {
			   
		   }
		   System.out.println("No." +i+ " Posted on Group Name: " +keyword);
		   //driver.findElement(By.id("XPxXbf")).clear();
		   
    	 }
 }
 catch(Exception e)
 {
 }
 }
}
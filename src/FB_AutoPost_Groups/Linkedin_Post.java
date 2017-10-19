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

 
public class Linkedin_Post {
	private static XSSFCell cell;
	private static XSSFRow row;
	private static WebDriver driver = null;
 private static String path = "C://Selenium//sheets//Linkedin_groupList.xlsx";

  
 public static void main(String args[]) throws InterruptedException
	{
		 System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver.exe");
		 //WebDriver driver=new FirefoxDriver();
		 
		 ProfilesIni profile = new ProfilesIni();

			FirefoxProfile myprofile = profile.getProfile("Buffer");

			driver = new FirefoxDriver(myprofile);
		 
		driver.get("http://www.techyvicky.com");

 
 //WebDriver driver=new ChromeDriver();
//driver.get("https://www.youtube.com/watch?v=FnWE1Co8I-I&list=PLLKmTFb-30OmojVUwq4ht5Kkn7JlsddHV");
 
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
 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
 Thread.sleep(10000);
 try { 
 FileInputStream file = new FileInputStream(new File(path)); 
 XSSFWorkbook workbook = new XSSFWorkbook(file); 
 XSSFSheet sheet = workbook.getSheetAt(0); 
  
   //for (int i =101; i <= sh	eet.ge	tLastRowNum(); i++)
	   for (int i=25; i <=30; i++)
    	 {
		   String keyword = sheet.getRow(i).getCell(0).getStringCellValue( );
		     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


		   driver.navigate().to(keyword);

		 // driver.findElement(By.name("title")).click();
		   
			WebElement clickTitle = (new WebDriverWait(driver, 100))
			   .until(ExpectedConditions.presenceOfElementLocated(By.name("title")));
		   clickTitle.click();
		   clickTitle.sendKeys("How to REMOVE any ADWARE or MALWARE from your computer? Free Tools included\r\n");
		   //driver.findElement(By.id("title")).click();
		   
		   Thread.sleep(5000);
		   
		   WebElement clickBody = (new WebDriverWait(driver, 100))
				   .until(ExpectedConditions.presenceOfElementLocated(By.name("body")));
				   Thread.sleep(10000);
		   clickBody.click();
		   Thread.sleep(10000);
		   clickBody.sendKeys("https://www.youtube.com/watch?v=2ymkDe8o6Eg&list=PLLKmTFb-30Onzcxa-T-mc_pAyOnxywDAJ");
		   Thread.sleep(10000);
		   clickBody.clear();
		   WebElement clickPost = (new WebDriverWait(driver, 100))
				   .until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='js-chrome-main']/div/div[2]/div[1]/div[1]/div/form/div[2]/div[5]/button[1]"))); 
		   clickPost.submit();		   
Thread.sleep(5000);
             
             System.out.println("No." +i+ " Posted on Group Name: " +keyword);             
             Thread.sleep(20000);

                 
             //driver.findElement(By.cssSelector(".UFILikeLinkIcon.img.sp_CyzWktPCcmJ.sx_5a6285")).click();
             
        
         //CLICK post Button             
  
         //driver.findElement(By.tagName("textarea")).sendKeys(Keys.chord(Keys.CONTROL + "v"));

         //WaitforSometime
         //Thread.sleep(randomInt);
     
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
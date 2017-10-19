package FB_AutoPost_Groups;

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

public class Buffer_AutoPost
{
	
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C://Selenium_Training//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://buffer.com/");
		 
		 driver.findElement(By.linkText("Log In")).click();
		 
		 driver.findElement(By.id("email")).sendKeys("techpills.org@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("blue@123");  
		 //driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.id("sign-into-account-button")).click();
		 
		 driver.findElement(By.linkText("Cancel")).click();
		 
		 driver.manage().window().maximize();

		 
		 
		 driver.get("https://buffer.com/app/profile/57496c6868c7ffd02955e217/buffer/queue/list");
		 
		 driver.findElement(By.linkText("Cancel")).click();
		 
		 

				 FileInputStream file = new FileInputStream(new File("C://New folder//testdata.xlsx")); 
				 XSSFWorkbook workbook = new XSSFWorkbook(file); 
				 XSSFSheet sheet = workbook.getSheetAt(0); 
				 
			 
				  
				   //for (int i =101; i <= sh	eet.ge	tLastRowNum(); i++)
				
				 
					   for (int i =1; i <=3; i++)
				    	 { 
				     String keyword = sheet.getRow(i).getCell(0).getStringCellValue( );
				     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

				        	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				    		//driver.findElement(By.className("dummy-composer-input")).click();
				    		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				    		 driver.findElement(By.id("composer")).sendKeys(keyword);
				    		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

				          
				    		 driver.findElement(By.xpath(".//*[@id='overlay-actions']/div[7]/div/button[2]")).click();
				    		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				    		 driver.findElement(By.linkText("Schedule Post")).click();
				    		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				    		 driver.findElement(By.className("next")).click();
				         	
				    		 for(int j=4; j<sheet.getLastRowNum(); j++)
				    		 {
				    		 driver.findElement(By.xpath("html/body/div[8]/div[1]/table/tbody/tr[1]/td["+j+"]")).click();
				    		 j = j+1;
				    		 }
				    		 Select dropdown = new Select(driver.findElement(By.name("hour")));
				    	      dropdown.selectByVisibleText("10");
				    	      
				    			 driver.findElement(By.cssSelector(".btn-primary.js-set-button")).click();
				         
				    	 }
				    	 }
			 }
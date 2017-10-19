package java_test;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;

public class IFTTTDateToLinkedin {
	
	private static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException
	{

	//Chrome Browser Driver Path
	//System.setProperty("webdriver.chrome.driver", "C:/Selenium_Training/chromedriver.exe");

	//Invoke Chrome Browser
	//driver = new ChromeDriver();
	

	
	//System.setProperty("webdriver.chrome.driver", "C:/Selenium_Training/chromedriver.exe");
	ProfilesIni profile = new ProfilesIni();

	FirefoxProfile myprofile = profile.getProfile("Buffer");

	driver = new FirefoxDriver(myprofile);
	driver.get("https://ifttt.com/login");	
	//driver.findElement(By.id("login")).sendKeys("techpillsorg");
	//driver.findElement(By.id("password")).sendKeys("blue@123");
	//driver.findElement(By.name("commit")).click();
	
	Thread.sleep(5000);
	try { 
		 FileInputStream file = new FileInputStream(new File("C://New folder//SeleniumJavaHyperLinks.xlsx")); 
		 XSSFWorkbook workbook = new XSSFWorkbook(file); 
		 XSSFSheet sheet = workbook.getSheetAt(0); 
		  
		   //for (int i =101; i <= sh	eet.ge	tLastRowNum(); i++)
			   for (int i =36; i <=66; i++)
		    	 { 
		     String keyword = sheet.getRow(i).getCell(0).getStringCellValue( );
		     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		        // driver.navigate().to(keyword);

	driver.navigate().to("https://ifttt.com/myrecipes/personal/new");
	
	driver.findElement(By.linkText("this")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("trigger_search_channels_field")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("trigger_search_channels_field")).sendKeys("Date");
	Thread.sleep(5000);
	driver.findElement(By.id("channel_3")).click();
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("Every day at")).click();
	Thread.sleep(5000);
	WebElement element=driver.findElement(By.id("statement_live_trigger_attributes_live_trigger_fields_attributes_0_datetime_value_4i"));
	Select se=new Select(element);
	se.selectByVisibleText("10 AM");
	Thread.sleep(5000);
	driver.findElement(By.className("btn-primary")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("that")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("action_search_channels_field")).sendKeys("linkedin");
	Thread.sleep(10000);
	driver.findElement(By.id("ind_a_channel_34")).click();
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("link")).click();
	Thread.sleep(10000);
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).click();
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).sendKeys("Selenium Tutorial using JAVA :\n");
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).sendKeys(keyword);
	Thread.sleep(2000);
	driver.findElement(By.id("validate_action_btn")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("statement_create_task_submit")).click();
	Thread.sleep(2000);
		    	 }
	}
			   catch(Exception e)
			   {
				   
			   }
}
}
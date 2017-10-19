package FB_AutoPost_Groups;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;

public class ifttt_facebookpage {
	private static XSSFCell cell;
	private static XSSFRow row;
	private static WebDriver driver = null;
 private static String path = "C://Selenium//sheets//exceltricksplaylist.xlsx";	
	

	

	
	public static void main(String args[]) throws InterruptedException, IOException
	{
		 System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver.exe");
		 //WebDriver driver=new FirefoxDriver();
		 
		 ProfilesIni profile = new ProfilesIni();

			FirefoxProfile myprofile = profile.getProfile("Buffer");

			driver = new FirefoxDriver(myprofile);
		 
		
		 FileInputStream file = new FileInputStream(new File(path)); 
		 XSSFWorkbook workbook = new XSSFWorkbook(file); 
		 XSSFSheet sheet = workbook.getSheetAt(0); 
		  
		   //for (int i =101; i <= sh	eet.ge	tLastRowNum(); i++)
			   for (int i=12; i <=13;)
		    	 {
				   driver.get("https://ifttt.com/create");
				   String keyword = sheet.getRow(i).getCell(0).getStringCellValue( );
				     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				     System.out.println(keyword);

		Thread.sleep(25000);

	
	driver.findElement(By.className("this-that")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/input")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/input")).sendKeys("Date");
	Thread.sleep(5000); 
	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/ul/li/a/div/img")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/ul/li[2]")).click();
	Thread.sleep(5000);
	//Select hourOptions = new Select(driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li/span[2]/div/div/select")));
//	hourOptions.selectByVisibleText("11 AM");
	//Thread.sleep(5000);
	Select minuteOptions = new Select(driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li/span[2]/div/div/select")));
	minuteOptions.selectByVisibleText("00");
	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/input")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div/a/span")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/input")).sendKeys("Facebook");
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/ul/li[2]/a/div/img")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/ul/li[1]/span[2]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li/span[2]/div/div[1]/textarea")).clear();
	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li/span[2]/div/div[1]/textarea")).sendKeys(keyword);
	System.out.println();
	keyword = sheet.getRow(i+1).getCell(0).getStringCellValue( );
	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li/span[2]/div/div[1]/textarea")).sendKeys(keyword);
	System.out.println(keyword);
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/input")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/input")).click();
	
	/*
	Select hourOptions = new Select(driver.findElement(By.className("hour-options")));
	hourOptions.selectByVisibleText("11 am");
	Thread.sleep(5000);
	Select minuteOptions = new Select(driver.findElement(By.className("minute-options")));
	hourOptions.selectByVisibleText("00 minutes");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/input")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/input")).sendKeys("Date");
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/ul/li[1]/span[2]")).sendKeys("Date");
	Thread.sleep(5000);
	driver.findElement(By.id("channel_3")).click();
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("Every day at")).click();
	Thread.sleep(5000);
	WebElement element=driver.findElement(By.id("statement_live_trigger_attributes_live_trigger_fields_attributes_0_datetime_value_4i"));
	Select se=new Select(element);
	se.selectByVisibleText("08 AM");
	Thread.sleep(5000);
	WebElement element1=driver.findElement(By.id("statement_live_trigger_attributes_live_trigger_fields_attributes_0_datetime_value_5i"));
	Select se1=new Select(element1);
	se1.selectByVisibleText("00");
	Thread.sleep(5000);
	driver.findElement(By.className("btn-primary")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("that")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("action_search_channels_field")).sendKeys("facebook");
	Thread.sleep(10000);
	driver.findElement(By.id("ind_a_channel_10")).click();
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("link")).click();
	Thread.sleep(10000);
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).click();
	//driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).sendKeys("Start your own blog and Earn money from Google Adsense\n");
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).sendKeys("How to remove your name or URL from Google search?\n");
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).sendKeys("https://www.youtube.com/watch?v=ZhDRZ1K_5s0&list=PLLKmTFb-30OmojVUwq4ht5Kkn7JlsddHV\n");
	
	//driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).sendKeys("http://qafreaks.blogspot.com/p/selenium-links.html");
	Thread.sleep(2000);
	driver.findElement(By.id("validate_action_btn")).click();
	Thread.sleep(2000);
	*/
	try {
	driver.findElement(By.id("statement_create_task_submit")).click();
	}
	catch(Exception e)
	{
		
	}
}	
}
}

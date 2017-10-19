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

public class ifttt_fb_pm {
	private static XSSFCell cell;
	public static String keyword;
	public static Select minuteOptions;
	public static int count;
	private static XSSFRow row;
	public static Select hourOptions;
	private static WebDriver driver = null;
    private static String path = "C://Selenium//sheets//exceltricksplaylist.xlsx";
	public static void main(String args[]) throws InterruptedException, IOException
	{
		 System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver.exe");
		 //WebDriver driver=new FirefoxDriver();
		 
		 ProfilesIni profile = new ProfilesIni();

			FirefoxProfile myprofile = profile.getProfile("Buffer");

			driver = new FirefoxDriver(myprofile);
		 
		driver.get("https://ifttt.com/create");		
			
				 
				 FileInputStream file = new FileInputStream(new File(path)); 
				 XSSFWorkbook workbook = new XSSFWorkbook(file); 
				 XSSFSheet sheet = workbook.getSheetAt(4);
				 
				 for ( count=1; count <=sheet.getLastRowNum();)
				 {
				    
					 keyword = sheet.getRow(count).getCell(0).getStringCellValue();
			 	     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			 	     System.out.println(keyword);
				 
				 
		       time : for(int i=7; i<=9; i++)
			     
		        {
		        	minutes : for(int j=0; j<=45; j=j+15)
		        if(j==0 | j==15 | j==30 | j==45)
		        {
		        	
		        int minutes = j;
		        	switch(minutes)
		        	{
		        	case 0:
		        		
			            System.out.println("0"+j +" minutes");
			            driver.get("https://ifttt.com/create");
			            Thread.sleep(5000);
			            driver.findElement(By.xpath(elementConstants.thisButton)).click();
			            Thread.sleep(5000);
			            driver.findElement(By.xpath(elementConstants.sendKeysField)).sendKeys("Date");
			            Thread.sleep(5000);
			            driver.findElement(By.xpath(elementConstants.dateButton)).click();
			            Thread.sleep(5000);
			            driver.findElement(By.xpath(elementConstants.everyDayAt)).click();
			            Thread.sleep(5000);
			            hourOptions = new Select(driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li/span[2]/div/div/select[1]")));
			            hourOptions.selectByVisibleText("0"+i +" pm");
			            Thread.sleep(5000);
			            minuteOptions = new Select(driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li/span[2]/div/div/select[2]")));
			        	minuteOptions.selectByVisibleText("00 minutes");
			            System.out.println(i +" pm");
			            Thread.sleep(5000);
			            
			            
			            driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/input")).click();
			        	Thread.sleep(5000);
			        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div/a/span")).click();
			        	Thread.sleep(5000);
			        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/input")).sendKeys("facebook");
			        	Thread.sleep(5000);
			        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/ul/li[1]/a/div/img")).click();
			        	Thread.sleep(5000);
			        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/ul/li[2]/span[1]")).click();
			        	Thread.sleep(5000);
			        	//driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li[1]/span[2]/div/div[1]/textarea")).sendKeys("Step by Step Selenium Tutorial with JAVA - How to select the values from dropdown list using select ");
			        	//driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li[1]/span[2]/div/div[1]/textarea")).sendKeys("\n");
			        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li[1]/span[2]/div/div[1]/textarea")).sendKeys(keyword);
			        	
			        	//driver.findElement(By.className("tube")).click();
			        	Thread.sleep(5000);
			        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li[2]/span[2]/div/div[1]/textarea")).clear();
			        	Thread.sleep(5000);
			        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/input")).click();
			        	Thread.sleep(5000);
			        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/input")).click();
			        //	driver.findElement(By.id("statement_create_task_submit")).click();
			        	
		        		keyword = sheet.getRow(++count).getCell(0).getStringCellValue();
		        		System.out.println("No : "+  keyword);
			        	break;
			        	
		        	
		        	
		        case 15:
		        	System.out.println(keyword);
		        	
		        	System.out.println("0"+j +" minutes");
		            driver.get("https://ifttt.com/create");
		            Thread.sleep(5000);
		            driver.findElement(By.xpath(elementConstants.thisButton)).click();
		            Thread.sleep(5000);
		            driver.findElement(By.xpath(elementConstants.sendKeysField)).sendKeys("Date");
		            Thread.sleep(5000);
		            driver.findElement(By.xpath(elementConstants.dateButton)).click();
		            Thread.sleep(5000);
		            driver.findElement(By.xpath(elementConstants.everyDayAt)).click();
		            Thread.sleep(5000);
		            hourOptions = new Select(driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li/span[2]/div/div/select[1]")));
		            hourOptions.selectByVisibleText("0"+i +" pm");
		            Thread.sleep(5000);
		            minuteOptions = new Select(driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li/span[2]/div/div/select[2]")));
		        	minuteOptions.selectByVisibleText("15 minutes");
		            System.out.println(i +" pm");
		            Thread.sleep(5000);
		            
		            
		            driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/input")).click();
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div/a/span")).click();
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/input")).sendKeys("facebook");
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/ul/li[1]/a/div/img")).click();
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/ul/li[2]/span[1]")).click();
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li[1]/span[2]/div/div[1]/textarea")).sendKeys(keyword);
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li[2]/span[2]/div/div[1]/textarea")).clear();
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/input")).click();
		        	Thread.sleep(5000);
		        	
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/input")).click();
		        	
		        	keyword = sheet.getRow(++count).getCell(0).getStringCellValue();
		        	System.out.println("No : " + count +  keyword);
		        	
		        	break;
		        	
		        case 30:
		        	System.out.println(keyword);
		        	
		        	System.out.println("0"+j +" minutes");
		            driver.get("https://ifttt.com/create");
		            Thread.sleep(5000);
		            driver.findElement(By.xpath(elementConstants.thisButton)).click();
		            Thread.sleep(5000);
		            driver.findElement(By.xpath(elementConstants.sendKeysField)).sendKeys("Date");
		            Thread.sleep(5000);
		            driver.findElement(By.xpath(elementConstants.dateButton)).click();
		            Thread.sleep(5000);
		            driver.findElement(By.xpath(elementConstants.everyDayAt)).click();
		            Thread.sleep(5000);
		            hourOptions = new Select(driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li/span[2]/div/div/select[1]")));
		            hourOptions.selectByVisibleText("0"+i +" pm");
		            Thread.sleep(5000);
		            minuteOptions = new Select(driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li/span[2]/div/div/select[2]")));
		        	minuteOptions.selectByVisibleText("30 minutes");
		            System.out.println(i +" pm");
		            Thread.sleep(5000);
		            
		            
		            driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/input")).click();
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div/a/span")).click();
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/input")).sendKeys("facebook");
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/ul/li[1]/a/div/img")).click();
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/ul/li[2]/span[1]")).click();
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li[1]/span[2]/div/div[1]/textarea")).sendKeys(keyword);
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li[2]/span[2]/div/div[1]/textarea")).clear();
		        	Thread.sleep(5000);
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/input")).click();
		        	Thread.sleep(5000);
		        	

		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/input")).click();
		        	
		        	keyword = sheet.getRow(++count).getCell(0).getStringCellValue();
		        	System.out.println("No : " + count +  keyword);
		        	
		        	break;
		        case 45:
		        	System.out.println(keyword);
		        	System.out.println("0"+j +" minutes");
		            driver.get("https://ifttt.com/create");
		            Thread.sleep(5000);
		            driver.findElement(By.xpath(elementConstants.thisButton)).click();
		            Thread.sleep(5000);
		            driver.findElement(By.xpath(elementConstants.sendKeysField)).sendKeys("Date");
		            Thread.sleep(5000);
		            driver.findElement(By.xpath(elementConstants.dateButton)).click();
		            Thread.sleep(5000);
		            driver.findElement(By.xpath(elementConstants.everyDayAt)).click();
		            Thread.sleep(5000);
		            hourOptions = new Select(driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li/span[2]/div/div/select[1]")));
		            hourOptions.selectByVisibleText("0"+i +" pm");
		            Thread.sleep(5000);
		            minuteOptions = new Select(driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li/span[2]/div/div/select[2]")));
		        	minuteOptions.selectByVisibleText("45 minutes");
		            System.out.println(i +" pm");
		            Thread.sleep(5000);
		            
		            
		            driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/input")).click();
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div/a/span")).click();
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/input")).sendKeys("facebook");
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/ul/li[1]/a/div/img")).click();
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/ul/li[2]/span[1]")).click();
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li[1]/span[2]/div/div[1]/textarea")).sendKeys(keyword);
		        	Thread.sleep(5000);
		        	//driver.findElement(By.className("tube")).click();
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/ul/li[2]/span[2]/div/div[1]/textarea")).clear();
		        	Thread.sleep(5000);

		        	
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/div/input")).click();
		        	Thread.sleep(5000);
		        	
		        	
		        	driver.findElement(By.xpath(".//*[@id='composer']/div/div/span/div[2]/form/input")).click();
		        	
		        	keyword = sheet.getRow(++count).getCell(0).getStringCellValue();
		        	System.out.println("No : " + count +  keyword);
		        	
		        	break;
		        	default:
		        		break;
		        		      	
	        	}
		        }
			 	   // keyword = sheet.getRow(++count).getCell(0).getStringCellValue();
			 	    
		        }	
			 	    
		        }
		        }    			            
				        }
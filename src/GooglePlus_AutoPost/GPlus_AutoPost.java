package GooglePlus_AutoPost;

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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.BrowserVersion;
 
 
public class GPlus_AutoPost { 
 private static WebDriver driver = null;   
  
  
 public static void main(String[] args) throws InterruptedException, IOException {   
     //Create a new instance of the Chrome driver   
	 System.setProperty("webdriver.chrome.driver", "C://Selenium_Training//chromedriver.exe");
	 //FirefoxProfile profile = new FirefoxProfile();
	    WebDriver driver=new ChromeDriver();
	    
	    //Login with User ID and Password
	    driver.get("https://accounts.google.com/ServiceLogin?sacu=1&continue=https%3A%2F%2Fplus.google.com%2F%3Fhl%3Den%26gpsrc%3Dgplp0&hl=en&service=oz#identifier");   
	    driver.findElement(By.id("Email")).sendKeys("techpills.org");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.id("next")).click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.id("Passwd")).sendKeys("xxxxxxx@786");
	    Thread.sleep(1000);
	    driver.findElement(By.id("signIn")).click(); 
	    Thread.sleep(5000);

	    
  try { 
 
     FileInputStream file = new FileInputStream(new File("C://Selenium_Training//testdata_GPlus.xlsx")); 
     XSSFWorkbook workbook = new XSSFWorkbook(file); 
     XSSFSheet sheet = workbook.getSheetAt(0); 
      
     for (int i=84; i <= sheet.getLastRowNum(); i++)
    	 { 
     String keyword = sheet.getRow(i).getCell(0).getStringCellValue();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      
 //Launch the GooglePlus Groups
 driver.navigate().to(keyword);  
 Thread.sleep(10000);
 driver.findElement(By.cssSelector(".j7")).click();
 Thread.sleep(5000);
 driver.findElement(By.cssSelector(".df.b-K.b-K-Xb.URaP8.editable")).sendKeys(Keys.CONTROL, "v");
 Thread.sleep(10000);
 /*
 driver.findElement(By.cssSelector(".po.iL")).click();
 Thread.sleep(5000);
 driver.findElement(By.cssSelector(".a-pb-N-z.b-hb")).sendKeys("https://www.youtube.com/watch?v=jThjEffBDGs&list=PLLKmTFb-30OntTdDNxsgJfLB32IZ6w3qu");
 driver.findElement(By.cssSelector(".b-c-W")).click();
 Thread.sleep(5000);
 driver.findElement(By.cssSelector(".a-Ca-e-B")).click();
 
 driver.findElement(By.id("picker:ap:2")).click();
 Thread.sleep(5000);
 WebElement dropDownList = null;
 WebElement dropdownlistNotenabled = null;
 /*
 try
 {
	 dropDownList =  driver.findElement(By.cssSelector(".d-k-l.b-c.b-c-Ba.qy.jt"));
   }
	catch(Exception e)
  {
	
  }
 
 if (dropDownList.isEnabled() == true)
 {
	 
	 driver.findElement(By.cssSelector(".d-k-l.b-c.b-c-Ba.qy.jt")).click();
	  System.out.println("Posted on Group Name: " +keyword);
	  //WaitforSometime
	  Thread.sleep(10000);
	  //driver.findElement(By.className("H3")).click();
	  
	 
}
 
 try
 {
	 dropdownlistNotenabled =  driver.findElement(By.cssSelector(".BA.pi.d-e.d-k-l.d-r-c"));
 }
 catch(Exception e)
 {
	
 }
 Thread.sleep(2000);
if (dropdownlistNotenabled.isEnabled() == true)
 {
	dropdownlistNotenabled.click();
	driver.findElement(By.cssSelector(".d-A-B>span")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector(".d-k-l.b-c.b-c-Ba.qy.jt")).click();
	 System.out.println("Posted on Group Name: " +keyword);
	 Thread.sleep(10000);
	 driver.findElement(By.className("H3")).click();
	 
 }
 */   
    	   
  workbook.close(); 
  file.close(); 
  }
  }catch (FileNotFoundException fnfe) { 
  fnfe.printStackTrace(); 
  } catch (IOException ioe) { 
  ioe.printStackTrace(); 
  } 
  }
}
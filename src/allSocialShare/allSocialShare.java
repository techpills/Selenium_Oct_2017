package allSocialShare;

import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.lang.reflect.InvocationTargetException; 
import java.util.Set;
import java.util.concurrent.TimeUnit;   

import org.apache.poi.xssf.usermodel.XSSFSheet; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
import org.openqa.selenium.*;   
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.BrowserVersion;
 
 
public class allSocialShare { 
 private static WebDriver driver = null;   
  
  
 public static <List> void main(String[] args) throws InterruptedException, IOException {   
     //Create a new instance of the Chrome driver   
	 System.setProperty("webdriver.chrome.driver", "C://Selenium_Training//chromedriver.exe");
	 //FirefoxProfile profile = new FirefoxProfile();
	    WebDriver driver=new ChromeDriver();
	    
	    //Login with User ID and Password
	    //driver.get("https://accounts.google.com/ServiceLogin?passive=true&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Fapp%3Ddesktop%26feature%3Dsign_in_button%26next%3D%252Fwatch%253Fv%253D-BZAPe1xETA%2526index%253D4%2526list%253DPLLKmTFb-30Omg4Jx2i0Ykk69S4bBKhfM3%26hl%3Den%26action_handle_signin%3Dtrue&hl=en&uilel=3&service=youtube#identifier");   
	    //driver.findElement(By.id("Email")).sendKeys("techpills.org");
	    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    //driver.findElement(By.id("next")).click();
	    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    //driver.findElement(By.id("Passwd")).sendKeys("techpills@275");
	    //Thread.sleep(1000);
	    //driver.findElement(By.id("signIn")).click(); 
	    //Thread.sleep(5000);

	    driver.navigate().to("https://www.youtube.com/watch?v=-BZAPe1xETA&index=4&list=PLLKmTFb-30Omg4Jx2i0Ykk69S4bBKhfM3");
	    Thread.sleep(10000);
	    driver.findElement(By.xpath(".//*[@id='watch8-secondary-actions']/button")).click();
	    Thread.sleep(1000);
	    String windowHandle1 = driver.getWindowHandle();
	    driver.findElement(By.xpath(".//*[@id='share-services-container']/div/ul/li[1]/button")).click();
	    Set<String> windowHandle2 = driver.getWindowHandles();
	    //driver.switchTo().window(windowHandle2);
	    System.out.println(windowHandle1);
	    System.out.println(windowHandle2);
	    Thread.sleep(10000);
	    //driver.switchTo().alert();
        //alert.accept();
	    
	    /*
	    driver.findElement(By.id("Email")).sendKeys("techpills.org");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.id("next")).click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.id("Passwd")).sendKeys("techpills@275");
	    Thread.sleep(1000);
	    driver.findElement(By.id("signIn")).click(); 
	    
//	    driver.findElement(By.id("email")).sendKeys("blueonelove82@gmail.com");
	//    driver.findElement(By.id("pass")).sendKeys("techpills@275");
	  //  driver.findElement(By.name("login")).click();
	    //driver.findElement(By.cssSelector("._42ft._4jy0.layerConfirm._51_n.autofocus._4jy3._4jy1.selected._51sy")).click();
        Thread.sleep(10000);
	    
	    /*   try { 
 
  FileInputStream file = new FileInputStream(new File("C://Selenium_Training//testdata_GPlus.xlsx")); 
     XSSFWorkbook workbook = new XSSFWorkbook(file); 
     XSSFSheet sheet = workbook.getSheetAt(0); 
      
     for (int i=3; i <= sheet.getLastRowNum(); i++)
    	 { 
     String keyword = sheet.getRow(i).getCell(0).getStringCellValue();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      
 //Launch the GooglePlus Groups
 driver.navigate().to(keyword);  
 Thread.sleep(10000);
 driver.findElement(By.cssSelector(".j7")).click();
 Thread.sleep(5000);
 driver.findElement(By.cssSelector(".po.iL")).click();
 Thread.sleep(5000);
 driver.findElement(By.cssSelector(".a-pb-N-z.b-hb")).sendKeys("https://www.youtube.com/watch?v=jThjEffBDGs&index=3&list=PLLKmTFb-30Omg4Jx2i0Ykk69S4bBKhfM3");
 driver.findElement(By.cssSelector(".b-c-W")).click();
 Thread.sleep(5000);
 driver.findElement(By.cssSelector(".a-Ca-e-B")).click();
 
 driver.findElement(By.id("picker:ap:2")).click();
 Thread.sleep(5000);
 WebElement dropDownList = null;
 WebElement dropdownlistNotenabled = null;
 
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
    
    	   
  workbook.close(); 
  file.close(); 
  }
  }catch (FileNotFoundException fnfe) { 
  fnfe.printStackTrace(); 
  } catch (IOException ioe) { 
  ioe.printStackTrace(); 
  } 
  }
} */
 
 }
}
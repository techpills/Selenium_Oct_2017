package GooglePlus_AutoPost;

import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.*;  
import org.openqa.selenium.firefox.FirefoxDriver;  
 
public class google_getallurl { 
  
private static WebDriver driver = null;  
  
  
public static void main(String[] args) throws InterruptedException {  

	  // Create a new instance of the Firefox driver  
      driver = new FirefoxDriver();  
  
      //Implicit wait, this method is used to wait for the webelement to load  
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
    
      //Launch youtube channel web Page 
      //driver.get("https://www.youtube.com/techpills");
      
      driver.get("https://plus.google.com/communities?hl=en");   
	    driver.findElement(By.id("Email")).sendKeys("techpills.org");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.id("next")).click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.id("Passwd")).sendKeys("techpills@275");
	    Thread.sleep(1000);
	    driver.findElement(By.id("signIn")).click(); 
	    Thread.sleep(5000);
   
      //get the tagname for hyperlink and store it in variable list using findElements method
      java.util.List<WebElement> links = driver.findElements(By.tagName("a")); 
       
      //Printing the link size in console which means total hyperlinks of the webpage
      System.out.println(links.size()); 
 
      
      for (int i = 1; i<=links.size(); i=i+1) 
     {
	   //System.out.println(links.get(i).getText()); 
       System.out.println("No."+i+ " " +links.get(i).getAttribute("href"));
      } 
            
  }
}  
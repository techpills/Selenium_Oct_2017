package GooglePlus_AutoPost;

import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;  
 
public class msexcel_playlistURL { 
  
private static WebDriver driver = null;  
  
  
public static void main(String[] args) throws InterruptedException {  



	// Create a new instance of the Chrome driver   
		System.setProperty("webdriver.chrome.driver", "C://Selenium_Training//chromedriver.exe"); 
driver=new ChromeDriver();
  
      //Implicit wait, this method is used to wait for the webelement to load  
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
    
      //Launch youtube channel web Page 
      //driver.get("https://www.youtube.com/techpills");
      
      driver.get("https://www.youtube.com/playlist?list=PLLKmTFb-30OmMHXQ907zibUXrVTtJ_CJR");   
	    
	    Thread.sleep(5000);
   
      //get the tagname for hyperlink and store it in variable list using findElements method
      java.util.List<WebElement> links = driver.findElements(By.tagName("a")); 
       
      //Printing the link size in console which means total hyperlinks of the webpage
      //System.out.println(links.size()); 
 
      
      for (int i = 1; i<=links.size(); i=i+1) 
     {
	   //System.out.println(links.get(i).getText());
    	  System.out.println(links.get(i).getText());
          System.out.println(links.get(i).getAttribute("href"));
       
      } 
            
  }
}  
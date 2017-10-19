package allSocialShare;
import java.io.File;  
import java.io.IOException;  
import org.apache.commons.io.FileUtils;  
import org.openqa.selenium.By;  
import org.openqa.selenium.OutputType;  
import org.openqa.selenium.TakesScreenshot;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;  

public class Testing {  

   WebDriver driver;  

 @BeforeTest  
 public void start(){  
 driver = new FirefoxDriver();  
 }  

 @Test  
 public void Test() throws IOException{  
 try{  
  driver.get("https://google.com/");  
  driver.findElement(By.id("link-signup")).click();  


 }catch(Exception e){  
  //Takes the screenshot  when test fails  
     File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
     FileUtils.copyFile(scrFile, new File("C:\\Selenium_Screenshots\\Google_TestPass.png"));  

  }  
 }  
}
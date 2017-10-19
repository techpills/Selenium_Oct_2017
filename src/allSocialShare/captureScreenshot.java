package allSocialShare;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;

public class captureScreenshot {
	
//Webdriver intiation for firefox
WebDriver driver = new FirefoxDriver();
	
//function to capture the screen
public String captureScreeAndSave() 
	
{
   String path;

   try 
{
//Assigning driver into augmentedDriver	   
WebDriver augmentedDriver = new Augmenter().augment(driver);
File source = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
path = "c:\\Selenium_Screenshots\\" + source.getName();
FileUtils.copyFile(source, new File(path)); 
}
catch(IOException e) {
path = "Failed to capture screenshot: " + e.getMessage();
}
return path;
}
	
public static void main(String args[]) throws IOException
{
captureScreenshot funcScreenshot = new captureScreenshot();
funcScreenshot.captureScreeAndSave();
} 
}
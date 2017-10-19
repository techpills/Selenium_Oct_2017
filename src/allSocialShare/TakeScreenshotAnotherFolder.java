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
import org.openqa.selenium.remote.DesiredCapabilities;

public class TakeScreenshotAnotherFolder {
	
	public static void main(String args[]) throws IOException
	{

//Launching firefox browser
WebDriver driver = new FirefoxDriver();
		
//Launching website
driver.get("http://www.techyvicky.com/");
		
//Screenshot syntax and code
File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
//Copying screenshot and placing it to the folder.
FileUtils.copyFile(scrFile, new File("c:\\Selenium_Screenshots\\screenshot.png"));

} 
}
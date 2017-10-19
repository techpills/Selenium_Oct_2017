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

public class BrowserDesiredCapability {
	
	public static void main(String args[]) throws IOException
	{

//Launching firefox browser
WebDriver driver = new FirefoxDriver();
		
//Launching website
driver.get("http://www.techyvicky.com/");
		
//Screenshot syntax and code
File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
//Pause your script to see the screenshot - Go to %TEMP% folder to verify
//System.out.println(scrFile.getAbsolutePath());
FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));

} 
}
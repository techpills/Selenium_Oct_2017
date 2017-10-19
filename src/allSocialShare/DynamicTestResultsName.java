package allSocialShare;
import java.io.File;  
import java.io.IOException;  

import org.apache.commons.io.FileUtils;  
import org.openqa.selenium.By;  
import org.openqa.selenium.OutputType;  
import org.openqa.selenium.TakesScreenshot;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  

public class DynamicTestResultsName {  

  
public static void main(String args[]) throws IOException
{
	 WebDriver driver = null;  

 driver = new FirefoxDriver();
	    String location = "C:/eStore/Projects/Screenshots/Catalog/";  
	    //location for images
	    String methodname = "Screen"; // fetching test method name
	    try  { 
	    	File screenshots = ((TakesScreenshot)driver) .getScreenshotAs(OutputType.FILE); 
	    	FileUtils.copyFile( screenshots, new File(location + "05Electrical" +".jpg")); 
	    }
	    	catch (Exception e) {
	             e.printStackTrace();
	    } finally {
	          driver.quit();
	    }
	}
}
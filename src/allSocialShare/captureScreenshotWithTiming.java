package allSocialShare;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
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

public class captureScreenshotWithTiming {
	
static //Webdriver intiation for firefox
WebDriver driver = new FirefoxDriver();
public  void captureScreenShot(String obj) throws IOException {
    File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screenshotFile,new File("Screenshots\\"+obj+""+GetTimeStampValue()+".png"));
}

public  String GetTimeStampValue()throws IOException{
    Calendar cal = Calendar.getInstance();       
    Date time=cal.getTime();
    String timestamp=time.toString();
    System.out.println(timestamp);
    String systime=timestamp.replace(":", "-");
    System.out.println(systime);
    return systime;
}
    private static void main(String args[])
    {
    	captureScreenshotWithTiming cs = new captureScreenshotWithTiming();
    	String url ="http://www.google.com";
    	//cs.captureScreenShot();
    	//cs.GetTimeStampValue();
    	
    }
}

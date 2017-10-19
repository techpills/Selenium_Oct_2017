package allSocialShare;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

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
import org.openqa.selenium.internal.WrapsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TakeScreenshotRectangle {
	
	public void takeScreenshotElement(WebElement element) throws IOException {
	    WrapsDriver wrapsDriver = (WrapsDriver) element;
	    File screenshot = ((TakesScreenshot) wrapsDriver.getWrappedDriver()).getScreenshotAs(OutputType.FILE);
	    Rectangle rectangle = new Rectangle(element.getSize().width, element.getSize().height);
	    Point location = element.getLocation();
	    BufferedImage bufferedImage = ImageIO.read(screenshot);
	    BufferedImage destImage = bufferedImage.getSubimage(location.x, location.y, rectangle.width, rectangle.height);
	    ImageIO.write(destImage, "png", screenshot);
	    File file = new File("c:\\Selenium_Screenshots\\");
	    FileUtils.copyFile(screenshot, file);
	}
	public static void main(String args[]) throws IOException
	{
		WebDriver driver = new FirefoxDriver();
		TakeScreenshotRectangle TSR = new TakeScreenshotRectangle();
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		TSR.takeScreenshotElement(element);

} 
}
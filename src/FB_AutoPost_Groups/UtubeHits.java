package FB_AutoPost_Groups;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtubeHits {
	
	private static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException
	{
	/*	System.setProperty("webdriver.gecko.driver", "C://Selenium_Training//geckodriver.exe");
		ProfilesIni profile = new ProfilesIni();

		FirefoxProfile myprofile = profile.getProfile("Buffer");

		driver = new FirefoxDriver(myprofile); */
		
		 System.setProperty("webdriver.chrome.driver", "C://Selenium_Training//chromedriver.exe");

		 ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://utubehits.com");

	Thread.sleep(5000);
	driver.findElement(By.name("login")).click();
	driver.findElement(By.name("login")).sendKeys("vikan.kg@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("blue@123");
	driver.findElement(By.name("connect")).click();
	Thread.sleep(5000);
	driver.navigate().to("http://utubehits.com/p.php?p=y_outube");
	
	
	 Actions builder = new Actions(driver);
		
	driver.findElement(By.id("remove18621")).click();
	Thread.sleep(8000);
	
	builder.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
	.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
	.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
	.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
	.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
	.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
	.sendKeys(Keys.ENTER)
	.perform();
	Thread.sleep(35000);
	
	
	driver.quit();
}
}
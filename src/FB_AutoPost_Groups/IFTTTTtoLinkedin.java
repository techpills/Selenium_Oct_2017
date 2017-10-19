package FB_AutoPost_Groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;

public class IFTTTTtoLinkedin {
	
	private static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException
	{

		ProfilesIni profile = new ProfilesIni();

		FirefoxProfile myprofile = profile.getProfile("Buffer");

		driver = new FirefoxDriver(myprofile);
		driver.get("https://ifttt.com/login");

	
	Thread.sleep(5000);
	driver.navigate().to("https://ifttt.com/myrecipes/personal/new");
	
	driver.findElement(By.linkText("this")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("trigger_search_channels_field")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("trigger_search_channels_field")).sendKeys("Date");
	Thread.sleep(5000);
	driver.findElement(By.id("channel_3")).click();
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("Every day at")).click();
	Thread.sleep(5000);
	WebElement element=driver.findElement(By.id("statement_live_trigger_attributes_live_trigger_fields_attributes_0_datetime_value_4i"));
	Select se=new Select(element);
	se.selectByVisibleText("02 PM");
	Thread.sleep(5000);
	WebElement element1=driver.findElement(By.id("statement_live_trigger_attributes_live_trigger_fields_attributes_0_datetime_value_5i"));
	Select se1=new Select(element1);
	se1.selectByVisibleText("45");
	Thread.sleep(5000);
	driver.findElement(By.className("btn-primary")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("that")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("action_search_channels_field")).sendKeys("linkedin");
	Thread.sleep(10000);
	driver.findElement(By.id("channel_34")).click();
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("link")).click();
	Thread.sleep(10000);
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).click();
	//driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).sendKeys("Start your own blog and Earn money from Google Adsense\n");
	//driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).sendKeys("How to Mirror your Android Mobile to PC or Laptop - Plug and Play - No Configurations   \n");
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).sendKeys("https://www.youtube.com/watch?v=8vS4wZj654w&list=PLLKmTFb-30On-f_i-3i7R3GNlzb_2SuAV \n");
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_1_value")).clear();
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_1_value")).sendKeys("How to set interval time pin according to your current time in android device?  \n");
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_1_value")).sendKeys("https://www.youtube.com/watch?v=8vS4wZj654w&list=PLLKmTFb-30On-f_i-3i7R3GNlzb_2SuAV \n");
	//driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).sendKeys("http://qafreaks.blogspot.com/p/selenium-links.html");
	Thread.sleep(2000);
	driver.findElement(By.id("validate_action_btn")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("statement_create_task_submit")).click();
}
}
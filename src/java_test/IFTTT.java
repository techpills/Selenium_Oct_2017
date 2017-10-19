package java_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFTTT {
	
	private static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException
	{

	//Chrome Browser Driver Path
	System.setProperty("webdriver.chrome.driver", "C:/Project1/lib/driver/chromedriver.exe");

	//Invoke Chrome Browser
	driver = new ChromeDriver();
	
	String url = "https://ifttt.com/login"; 
	
	driver.get(url);
	
	driver.findElement(By.id("login")).sendKeys("onlyfortest1982");
	driver.findElement(By.id("password")).sendKeys("blue@123");
	driver.findElement(By.name("commit")).click();
	
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
	se.selectByVisibleText("10 AM");
	WebElement element1=driver.findElement(By.id("statement_live_trigger_attributes_live_trigger_fields_attributes_0_datetime_value_5i"));
	Select se1=new Select(element1);
	se1.selectByVisibleText("00");
	Thread.sleep(5000);
	driver.findElement(By.className("btn-primary")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("that")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("action_search_channels_field")).sendKeys("facebook");
	Thread.sleep(10000);
	driver.findElement(By.id("ind_a_channel_10")).click();
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("link")).click();
	Thread.sleep(10000);
	
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).click();
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).sendKeys("Selenium with JAVA Tutorial\n");
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).sendKeys("\nHow to retrieve and add cookies for login activity on selenium scripts?\n");
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).sendKeys("http://www.qafreaks.blogspot.com/p/how-to_4.html");
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.id("validate_action_btn")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("statement_create_task_submit")).click();
}
}
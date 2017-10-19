package java_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AdminLoginPage {
static WebDriver driver;
WebElement email;
WebElement password;
WebElement submit;
public AdminLoginPage(WebDriver driver){
this.driver = driver;
driver.get("https://ifttt.com/myrecipes/personal/new");
email = driver.findElement(By.id("login"));
password = driver.findElement(By.id("password"));
submit = driver.findElement(By.name("commit"));
}
public void login() throws InterruptedException{
email.sendKeys("techpillsorg1");
password.sendKeys("blue@123");
submit.click();
Thread.sleep(10000);
}


public void datetolinkedin()
{
driver.findElement(By.linkText("this")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.id("trigger_search_channels_field")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.id("trigger_search_channels_field")).sendKeys("Date");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.id("channel_3")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.partialLinkText("Every day at")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement element=driver.findElement(By.id("statement_live_trigger_attributes_live_trigger_fields_attributes_0_datetime_value_4i"));
	Select se=new Select(element);
	se.selectByVisibleText("02 PM");
	WebElement element1=driver.findElement(By.id("statement_live_trigger_attributes_live_trigger_fields_attributes_0_datetime_value_5i"));
	Select se1=new Select(element1);
	se1.selectByVisibleText("45");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.className("btn-primary")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.linkText("that")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.id("action_search_channels_field")).sendKeys("linkedin");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.id("ind_a_channel_34")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.partialLinkText("link")).click();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).click();
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).sendKeys("Selenium with JAVA Tutorial - \n");
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).sendKeys("\ndoubleClick on WebElement - The Second Way\n");
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).sendKeys("http://qafreaks.blogspot.com/p/blog-page_55.html");
	driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).click();
	
	//driver.findElement(By.id("statement_live_action_attributes_live_action_fields_attributes_0_value")).sendKeys("How to add the Firebug extension on Firefox Browser?\nhttp://www.qafreaks.com/p/how-to-add-firebug-extension-to-firefox.html");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.id("validate_action_btn")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.id("statement_create_task_submit")).click();
}


public static void main(String args[]) throws InterruptedException
{
	//Chrome Browser Driver Path
		System.setProperty("webdriver.chrome.driver", "C:/Project1/lib/driver/chromedriver.exe");

		//Invoke Chrome Browser
		driver = new ChromeDriver();
		AdminLoginPage lp = new AdminLoginPage(driver);
		lp.login();
	
		lp.datetolinkedin();
}

}
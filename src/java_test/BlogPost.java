package java_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BlogPost{
	WebDriver driver;
	@FindBy(how=How.ID, id="user_login")
	WebElement email;
	@FindBy(how=How.ID, id="user_pass")
	WebElement password;
	@FindBy(how=How.ID, id="wp-submit")
	WebElement submit;
	
	public void AdminLoginPage(WebDriver driver){
	this.driver = driver;
	driver.get("http://pageobjectpattern.wordpress.com/wpadmin");
	}
	
	public void login(){
	email.sendKeys("pageobjectpattern@gmail.com");
	password.sendKeys("webdriver123");
	submit.click();
	}
	}
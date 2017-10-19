package allSocialShare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestAddNewPostUsingPageObjects {
public static void main(String... args){
	WebDriver driver = new FirefoxDriver();
	AdminLoginPage loginPage
	= PageFactory.initElements(driver, AdminLoginPage.class);
	loginPage.login();
	}
	}

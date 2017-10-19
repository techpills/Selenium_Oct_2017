package java_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
 

import java_test.ChapterFirstPage;
import java_test.ChapterSecondPage;
import java_test.HomePage;
 
public class TestBase {
 
	protected static WebDriver driver;
	protected static String baseUrl;
	protected static HomePage homePage;
	protected static ChapterSecondPage chapterSecond;
	protected static ChapterFirstPage chapterFirstPage;
 
	// Method-1.
	@BeforeSuite
	public static void main(String args[]) {
		baseUrl = "http://book.theautomatedtester.co.uk/";
		System.setProperty("webdriver.chrome.driver", "C:/Project1/lib/driver/chromedriver.exe");

		//Invoke Chrome Browser
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 
	}
 

}
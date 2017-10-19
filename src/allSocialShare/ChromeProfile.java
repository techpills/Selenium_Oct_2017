package allSocialShare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeProfile {
	static WebDriver driver = null;
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "C:/Selenium_Training/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:/Users/onlyfortest1901/AppData/Local/Google/Chrome/User Data");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
	//WebDriver driver = new ChromeDriver(options);
	driver.get("http://buffer.com");
}
}
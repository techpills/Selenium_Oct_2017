package java_test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeProfile {
	static WebDriver driver = null;
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "C:/Project1/lib/driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-data-dir=C:/Users/VK5033314/AppData/Local/Google/Chrome/User Data");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
	//WebDriver driver = new ChromeDriver(options);
	driver.get("www.buffer.com");
	driver.navigate().to("http://buffer.com");
		
	/*	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		String chromeProfile = "C:\\Users\\VK5033314\\AppData\\Local\\Google\\Chrome\\User Data";
		ArrayList<String> switches = new ArrayList<String>();
		switches.add("--user-data-dir=" + chromeProfile);
		capabilities.setCapability("chrome.switches", switches);
		WebDriver driver = new ChromeDriver(capabilities);
		driver.get("http://www.buffer.com");		*/
		
}
}
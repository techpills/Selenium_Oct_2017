package allSocialShare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeDriver {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.ie.driver", "C:\\Selenium_Training\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
	}

}

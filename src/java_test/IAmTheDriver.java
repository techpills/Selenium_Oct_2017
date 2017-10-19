package java_test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;




public class IAmTheDriver {
	
	static WebDriver driver =null;
	
public static void main(String[] args)
{
	
	System.setProperty("webdriver.chrome.driver", "C:/Project1/lib/driver/chromedriver.exe");
	driver = new ChromeDriver();
	

EventFiringWebDriver eventFiringDriver = new EventFiringWebDriver(driver);
//IAmTheEventListener eventListener = new IAmTheEventListener();
//eventFiringDriver.register(eventListener);
eventFiringDriver.get("http://www.google.com");
eventFiringDriver.get("http://www.facebook.com");
eventFiringDriver.navigate().back();
}
}
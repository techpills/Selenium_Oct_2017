package allSocialShare;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitlyWait {
public static void main(String... args) {
	
WebDriver driver = new FirefoxDriver();

//Implicitly wait time is used to wait for sometime and then continue.
//10 second is used below for waiting time
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("www.QaFreaks.com");
}
}
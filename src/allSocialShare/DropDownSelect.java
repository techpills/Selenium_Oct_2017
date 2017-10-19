package allSocialShare;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {
	private static WebDriver driver = null;
public static void main(String[] args){
	
	//Check this code on http://www.qafreaks.blogspot.com
	//Check this code on http://www.qafreaks.com
	
//Set ChromDriver.exe path	
	System.setProperty("webdriver.chrome.driver", "C:/Selenium_Training/chromedriver.exe");

	//Invoke Chrome Browser
	ChromeDriver driver = new ChromeDriver();
	
	//Launching facebook website
	driver.get("http://www.facebook.com");

	
	//Assign the WebElement variable using Select Method
	Select selectMonth = new Select(driver.findElement(By.id("month")));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	selectMonth.selectByIndex(11);
	System.out.println(selectMonth);
	
	List<WebElement> mon = driver.findElements(By.id("month"));
	for(int i=0; i<mon.size();i++){
		String elementText = mon.get(i).getText();
		System.out.println(elementText);
		
	}
	
	//Assign the WebElement variable using Select Method
	Select selectDay = new Select(driver.findElement(By.id("day")));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	selectDay.selectByIndex(3);
	System.out.println(selectDay);
		
	}
private static char[] mon(int i) {
	// TODO Auto-generated method stub
	return null;
}
}

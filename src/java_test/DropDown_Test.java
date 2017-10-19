package java_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown_Test {
private static WebDriver driver = null;
	public static void main(String[] args) {
System.setProperty("webdriver.ie.driver", "C:\\Users\\VK5033314\\Documents\\Selenium Resources\\IEDriverServer.exe"); 
				//Invoke the Internet explorer 
			 driver = new InternetExplorerDriver();
				 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				
				driver.get("http://www.calculator.net/interest-calculator.html");
				
				driver.manage().window().maximize();
				
				Select dropdown = new Select(driver.findElement(By.id("ccompound")));
				
				dropdown.selectByVisibleText("continuously");
				
				Select anotherdropdown = new Select(new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("ccompound"))));
				
				anotherdropdown.selectByVisibleText("biweekly");
				
				

	}

}

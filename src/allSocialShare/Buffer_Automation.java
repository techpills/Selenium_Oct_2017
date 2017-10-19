
package allSocialShare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Buffer_Automation{

public static void main(String[] args) throws InterruptedException
{

WebDriver driver = null;

//Chrome Browser Driver Path
System.setProperty("webdriver.chrome.driver", "C:/Selenium_Training/chromedriver.exe");

//Invoke Chrome Browser
driver = new ChromeDriver();

driver.get("http://buffer.com");
driver.findElement(By.linkText("Log In")).click();
driver.findElement(By.id("email")).sendKeys("techpills.org@gmail.com");
Thread.sleep(1000);
driver.findElement(By.id("password")).sendKeys("blue@123");
Thread.sleep(1000);
driver.findElement(By.id("sign-into-account-button")).click();
Thread.sleep(10000);
try{
driver.findElement(By.className("dummy-composer-input")).click();
}
catch(Exception e){
}
Thread.sleep(1000);
try{
driver.findElement(By.id("composer")).sendKeys("http://qafreaks.blogspot.com/p/blog-page_18.html");
}
catch(Exception e){
}
Thread.sleep(1000);
try{
driver.findElement(By.cssSelector(".button.btn-primary.dropdown-toggle.js-share-options-menu")).click();
}
catch(Exception e)
{
	
}
Thread.sleep(5000);
driver.findElement(By.id("js-custom-time")).click();
Thread.sleep(1000);
//Get number of rows In table.
int Row_count = driver.findElements(By.xpath("html/body/div[8]/div[1]/table/tbody/tr[2]/td[4]")).size();
System.out.println("Number Of Rows = "+Row_count);

//Get number of columns In table.
int Col_count = driver.findElements(By.xpath("html/body/div[8]/div[1]/table/tbody/tr[2]/td[4]")).size();
System.out.println("Number Of Columns = "+Col_count);

Select dropdownhour = new Select(driver.findElement(By.name("hour")));
dropdownhour.selectByVisibleText("10");
Select dropdownminute = new Select(driver.findElement(By.name("minute")));
dropdownminute.selectByVisibleText("30");
Select dropdownampm = new Select(driver.findElement(By.name("ampm")));
dropdownampm.selectByVisibleText("AM");

driver.findElement(By.cssSelector(".btn-primary.js-set-button")).click();
}}
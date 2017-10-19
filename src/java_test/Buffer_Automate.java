package java_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buffer_Automate{

public static void main(String[] args) throws InterruptedException
{

WebDriver driver = null;

//Chrome Browser Driver Path
System.setProperty("webdriver.chrome.driver", "C:/Project1/lib/driver/chromedriver.exe");

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
driver.findElement(By.className("dummy-composer-input")).click();
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
int Row_count = driver.findElements(By.xpath("//*[@id='datepicker-days']/div[1]/table/tbody/tr")).size();
System.out.println("Number Of Rows = "+Row_count);

//Get number of columns In table.
int Col_count = driver.findElements(By.xpath("//*[@id='datepicker-days']/div[1]/table/tbody/tr[1]/td")).size();
System.out.println("Number Of Columns = "+Col_count);


}}
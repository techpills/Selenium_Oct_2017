package java_test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Selenium_Test {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.ie.driver","C:\\Users\\VK5033314\\Documents\\Selenium Resources\\IEDriverServer.exe");
WebDriver driver= new InternetExplorerDriver();

driver.get("http://demo.testfire.net/");
driver.findElement(By.id("_ctl0__ctl0_LoginLink")).click();
Thread.sleep(5000);
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		
		
//driver.findElement(By.id("passw")).sendKeys("jsmith");

driver.findElement(By.name("btnSubmit")).click();

Alert alert = driver.switchTo().alert();
alert.accept();
		
	}}


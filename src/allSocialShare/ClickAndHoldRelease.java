package allSocialShare;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldRelease
{
public static void main(String... args) throws InterruptedException
{

//Invoke FirefoxBrowser	
WebDriver dr = new FirefoxDriver();

//Login drive.google.com with user id and password
dr.get("https://www.drive.google.com");
dr.findElement(By.id("Email")).sendKeys("onlytest628");
dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
dr.findElement(By.id("next")).click();
dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
dr.findElement(By.id("Passwd")).sendKeys("steverock@123");
Thread.sleep(1000);
dr.findElement(By.id("signIn")).click(); 
Thread.sleep(5000);



//To get the location of X and Y axis
System.out.println(dr.findElement(By.className("k-v-ta-za-Ln-vd")).getLocation());

//click and hold the webelement 
Actions builder = new Actions(dr);
builder.moveByOffset(225, 139)
.clickAndHold()
.moveByOffset(245, 175)
.perform();

//holding the element until 5 seconds
Thread.sleep(5000);

//release the weblement
builder.release().perform();

}
}
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

public class doubleClickSecondWay
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

//Assign the webelement into variables
WebElement doubleClickFile = dr.findElement(By.className("k-v-ta-za-Ln-vd"));

//wait for 2 seconds
dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

Actions builder = new Actions(dr);

//doublic click to open the pdf file
builder.doubleClick(doubleClickFile)
.perform();

}
}
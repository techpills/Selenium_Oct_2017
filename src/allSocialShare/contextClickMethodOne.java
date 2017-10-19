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

public class contextClickMethodOne
{
public static void main(String... args) throws InterruptedException
{

//Invoke FirefoxBrowser	
WebDriver dr = new FirefoxDriver();

//Login drive.google.com with user id and password
dr.get("http://www.w3schools.com");
Thread.sleep(5000);

//Assign the webelement into variables
WebElement clickContextMenu = dr.findElement(By.id("navbtn_tutorials"));

Thread.sleep(2000);

Actions builder = new Actions(dr);
//doublic click to open the pdf file
builder.contextClick(clickContextMenu).click(dr.findElement(By.linkText("Learn HTML")))
.perform();

Thread.sleep(100000);
dr.navigate().to("http://www.techyvicky.com");
}
}
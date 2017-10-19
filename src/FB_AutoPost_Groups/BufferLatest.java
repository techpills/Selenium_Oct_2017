package FB_AutoPost_Groups;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;

public class BufferLatest{

public static void main(String[] args) throws InterruptedException
{

WebDriver driver = null;

//Chrome Browser Driver Path
System.setProperty("webdriver.chrome.driver", "C:/Selenium_Training/chromedriver.exe");

//Invoke Chrome Browser
driver = new FirefoxDriver();

ProfilesIni profile = new ProfilesIni();

FirefoxProfile myprofile = profile.getProfile("Buffer");

driver = new FirefoxDriver(myprofile);
driver.get("https://buffer.com/app");
Thread.sleep(10000);
try
{
driver.findElement(By.className("dummy-composer-input")).click();
}
catch(Exception e)
{
	
}
Thread.sleep(1000);
try{
driver.findElement(By.id("composer")).sendKeys("https://www.youtube.com/watch?v=4BktBafaXWw&list=PLLKmTFb-30Ony_el8MrW2QwN2cTrc8b8b");
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
int Row_count = driver.findElements(By.xpath("html/body/div[8]/div[1]/table/tbody/tr[3]/td[7]")).size();
System.out.println("Number Of Rows = "+Row_count);

driver.findElement(By.xpath("html/body/div[8]/div[1]/table/tbody/tr[4]/td[3]")).click();

Select dropdown = new Select(driver.findElement(By.name("hour")));
dropdown.selectByVisibleText("10");

//Get number of columns In table.
int Col_count = driver.findElements(By.xpath("html/body/div[8]/div[1]/table/tbody/tr[3]/td[7]")).size();
System.out.println("Number Of Columns = "+Col_count);
driver.findElement(By.cssSelector(".btn-primary.js-set-button")).click();


}}

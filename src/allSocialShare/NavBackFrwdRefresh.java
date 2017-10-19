package allSocialShare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavBackFrwdRefresh{
public static void main(String... args) throws InterruptedException {
WebDriver driver = new FirefoxDriver();
driver.navigate().to("www.google.com");

//Click the Privacy hyperlink
WebElement backButton = driver.findElement(By.partialLinkText("Privacy"));
backButton.click();

System.out.println("Privacy link is clicked");
Thread.sleep(5000);

//click back button on the browser to go back to the previous webpage Ex:- Google.com
driver.navigate().back();

Thread.sleep(5000);
//click forward() button on the browser to navigate on next webpage.
driver.navigate().forward();


Thread.sleep(5000);
//refresh the webpage
driver.navigate().refresh();
}
}
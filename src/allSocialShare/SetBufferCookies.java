package allSocialShare;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SetBufferCookies {
	private static WebDriver driver = null;
public static void main(String... args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:/Selenium_Training/chromedriver.exe");
//driver = new FirefoxDriver();
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
File f = new File("browser.data");
try{
f.delete();
f.createNewFile();
FileWriter fos = new FileWriter(f);
BufferedWriter bos = new BufferedWriter(fos);
for(Cookie ck : driver.manage().getCookies()) {
bos.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()
+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));
System.out.println(ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure());
bos.newLine();
}
bos.flush();
bos.close();
fos.close();
}catch(Exception ex){
ex.printStackTrace();
}
}
}

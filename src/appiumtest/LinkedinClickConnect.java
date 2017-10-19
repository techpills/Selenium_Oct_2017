package appiumtest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LinkedinClickConnect {
public static void main(String[] args) throws InterruptedException {
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Viki");
		caps.setCapability("udid", "32040ee4cf5d31a3"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "5.1.1");
		caps.setCapability("appPackage", "com.linkedin.android");
		caps.setCapability("appActivity", "com.linkedin.android.authenticator.LaunchActivity");
		//caps.setCapability("appActivity", "com.linkedin.android.growth.login.LoginActivity");
		
		
		
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Drivers
		try {
				AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
				Thread.sleep(5000);
				//driver.findElement(By.id("com.linkedin.android:id/home_nav_tab_icon")).click();
				//Find element using ClassName property
				driver.findElement(By.xpath("//*[@content-desc = 'Feed, Tab 1 of 5']")).click();
				List<MobileElement> elements = driver.findElements(By.className("android.support.v7.app.ActionBar$Tab"));
				for(MobileElement element : elements) {
					if(element.getAttribute("contentDescription").equals("Feed, Tab 2 of 5")) {
						element.click();
						break;
					}
				}
				driver.findElement(By.xpath("//*[@content-desc = 'Feed, Tab 2 of 5']")).click();
				Thread.sleep(5000);
				driver.findElement(By.id("com.linkedin.android:id/mynetwork_pymk_vertical_card")).click();
				for(int i=0; i<=100; i++)
				{
					
				Thread.sleep(5000);
				driver.findElement(By.id("com.linkedin.android:id/mini_profile_pymk_connect_button")).click();
				Thread.sleep(5000);
				}
				
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
 
}

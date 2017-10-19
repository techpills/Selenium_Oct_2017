package java_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Chase_refer {
	private static WebDriver driver = null;
	/*public static void main(String args[])
	{
		FirefoxDriver driver = new FirefoxDriver();
		//FirefoxProfile profile = new FirefoxProfile();
		//profile.setAcceptUntrustedCertificates(true); 
		//profile.setAssumeUntrustedCertificateIssuer(true);
		//driver = new FirefoxDriver(profile); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}*/
	
			
		public static void main(String args[]) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:/Project1/lib/driver/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.chasereferafriend.com/Default.aspx");
		 Thread.sleep(2000);
			
			driver.findElement(By.id("txtLastName")).sendKeys("kumaraguru");
			driver.findElement(By.id("txtZip")).sendKeys("85032");
			driver.findElement(By.id("txtLast4")).sendKeys("0956");
			driver.findElement(By.id("ctl00_ContentPlaceHolderBody_homeSubmit")).click();
		
			Thread.sleep(10000);
			
			
			driver.findElement(By.name("txtFirstName1")).sendKeys("viknesh");
			driver.findElement(By.name("txtEmail1")).sendKeys("vikan.kg@gmail.com");
			driver.findElement(By.name("ctl00$ContentPlaceHolderBody$rafSubmit")).click();
			
			
			
			
			
			//driver.findElement(By.name("uid")).clear();
		}

	}

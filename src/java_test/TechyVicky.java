package java_test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;

public class TechyVicky {
	private static WebDriver driver = null;
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/Project1/lib/driver/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://techyvicky.blogspot.com");
		 driver.manage().window().maximize();
		 //String url = "http://www.techyvicky.com";
		 for(int i=1; i<10000; i++)
		 {
			 
		
		Thread.sleep(5000);
		String url = "http://techyvicky.blogspot.com";
				
		

		driver.navigate().to(url);
		Thread.sleep(5000);
		driver.navigate().to("http://www.qafreaks.com");
		Thread.sleep(5000);
		//Assign the webelement into variables
		WebElement xyAxisPoint = driver.findElement(By.linkText("Home"));
		//WebElement moveHere = driver.findElement(By.id("0:897:20:19_0"));
		//click and hold the file(webelement) then move to the folder(on another webelement)
		/*Actions builder = new Actions(driver);
		builder
		.clickAndHold(xyAxisPoint)
		.release(moveHere)
		.perform();*/
		driver.navigate().to("http://accountingandformulas.blogspot.com/");
		Thread.sleep(5000);
		System.out.println(i +" Times");
		 }
		
		//driver.findElement(By.name("email")).sendKeys("somi1991@gmail.com");

		
		//driver.findElement(By.className("topsubsboxbutton")).click();
	
		
	}

}

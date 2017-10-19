package java_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChennaiClick {
	static WebDriver driver;
	@FindBy(how=How.ID, id="user_login")
	WebElement email;
	@FindBy(how=How.ID, id="user_pass")
	WebElement password;
	@FindBy(how=How.ID, id="wp-submit")
	WebElement submit;
	
	
	public static void main(String args[]) throws InterruptedException
	{

	//Chrome Browser Driver Path
	System.setProperty("webdriver.chrome.driver", "C:/Project1/lib/driver/chromedriver.exe");

	//Invoke Chrome Browser
	driver = new ChromeDriver();
	
	driver.get("http://chennai.click.in/education-learning-c152");
	
	List<WebElement> contactButton = driver.findElements(By.className("clickin-postsContactBtnNoImage"));
	
	//Printing the link size in console which means total
    System.out.println(contactButton.size()); 

    //For loop to print each hyperlinks from the links list variable
    for (int i =0; i<=contactButton.size(); i=i++) 
    {
    	
    	contactButton.get(i).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("reply_from")).sendKeys("abc@gmail.com");
    	Thread.sleep(2000);
    	driver.findElement(By.id("mobile_no")).sendKeys("9884098840");
    	Thread.sleep(2000);
    	driver.findElement(By.name("msg")).sendKeys("Watch out this!\n");
    	Thread.sleep(2000);
    	driver.findElement(By.name("msg")).sendKeys("http://youtube.com/techpills\n");
    	driver.findElement(By.name("msg")).sendKeys("http://techyvicky.com\n");
    	driver.findElement(By.name("msg")).sendKeys("http://qafreaks.com\n");
    	Thread.sleep(2000);
    	driver.findElement(By.className("accorRightHeaderReply")).click();
    	Thread.sleep(2000);
            //System.out.println(links.get(i).getText()); 
    //    System.out.println("No."+i+ " " +contactButton.get(i).getAttribute("class"));
    } 
	
	
	driver.findElement(By.linkText("this")).click();
	Thread.sleep(5000);
	}
}
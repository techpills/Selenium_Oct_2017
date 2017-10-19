package allSocialShare;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isSelected {
	
	public static void main(String args[])	{

//Launching the firefoxbrowser
WebDriver driver = new FirefoxDriver();
		
//Implicit wait, this method is used to wait for the webelement to load  
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		
//Navigate to FB page
driver.get("http://www.facebook.com");
		
//assign the web element to the variable under Male or Female option 
WebElement radiobutton = driver.findElement(By.xpath(".//*[@id='u_0_n']"));
		
//Assign the element on boolean variable
boolean boolFradiobutton = radiobutton.isSelected();

//Verifying the radio button is enabled in IF statement
if(boolFradiobutton == true)
{
	System.out.println("Radio Button is Selected");
}
	else
{
	System.out.println("Radio Button NOT selected");
}

//performing radio button selection
radiobutton.click();

//verifying whether the radio button is selected
boolFradiobutton = radiobutton.isSelected();

if(boolFradiobutton == true)
{
	System.out.println("Radio Button is Selected");
}
	else
{
	System.out.println("Radio Button NOT selected");
}
}
}
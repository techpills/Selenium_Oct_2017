package java_test;

import java.awt.List;

import org.openqa.selenium.*;
 
public class PageObjectsPercCalc 
{
   private static WebElement element = null;
 
   // Math Calc Link
   public static WebElement lnk_math_calc(WebDriver driver)
   {
      element = driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a"));
      return element;
   }
	
   //Percentage Calc Link
   public static WebElement lnk_percent_calc(WebDriver driver)
   {
      element = driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a"));
      return element;
   }
	
   //Number 1 Text Box
   public static WebElement txt_num_1(WebDriver driver)
   {
      element = driver.findElement(By.id("cpar1"));
      return element;
   }
	
   //Number 2 Text Box	
   public static WebElement txt_num_2(WebDriver driver)
   {
      element = driver.findElement(By.id("cpar2"));
      return element;
   }
	
   //Calculate Button	
   public static void btn_calc(WebDriver driver)
   {
	   //java.util.List<WebElement> calculate = 
	   
      //for(int i=0; i<calculate.size(); i++)
      //{
	   
	   //if (i == 0)
	  // {
		   //element = calculate.get(i);
		      
	   //}
	   //break;
     // }
	//return element;
      
   }	
	
   // Result	
   public static WebElement web_result(WebDriver driver)
   {
      element = driver.findElement(By.xpath(".//*[@id='content']/p[2]/span/font/b"));
      return element;
   }	
}
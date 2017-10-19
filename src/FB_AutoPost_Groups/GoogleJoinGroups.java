package FB_AutoPost_Groups;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class GoogleJoinGroups {
	
private static WebDriver driver = null;
static String path = "C://New folder//Gplus_URL_New.xlsx";

public static void main(String[] args) throws InterruptedException 
{   
 System.setProperty("webdriver.gecko.driver", "C://Selenium_Training//geckodriver.exe");


ProfilesIni profile = new ProfilesIni();

FirefoxProfile myprofile = profile.getProfile("Buffer");

driver = new FirefoxDriver(myprofile);

Thread.sleep(8000);
driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

try { 
FileInputStream file = new FileInputStream(new File(path)); 
XSSFWorkbook workbook = new XSSFWorkbook(file); 
XSSFSheet sheet = workbook.getSheetAt(0); 

//for (int i =101; i <= sh	eet.ge	tLastRowNum(); i++)
   for (int i=101; i <=114; i++)
	 {
	   String keyword = sheet.getRow(i).getCell(0).getStringCellValue( );
	     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


	   driver.navigate().to(keyword);

	   Thread.sleep(10000);
	   driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
//	   Thread.sleep(10000);
	   System.out.println("Joined in Groups No. "+i+ keyword);
	   }
}
catch(Exception e)
{
}
}
}

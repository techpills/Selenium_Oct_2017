package allSocialShare;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class AddBufferCookies {
	private static WebDriver driver = null;
@SuppressWarnings("deprecation")
public static void main(String... args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:/Selenium_Training/chromedriver.exe");

	//Invoke Chrome Browser
	driver = new ChromeDriver();
	driver.get("http://www.buffer.com");
try{
	File f = new File("browser.data");
	FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	String line;
	while((line=br.readLine())!=null){
	StringTokenizer str = new StringTokenizer(line,";");
	while(str.hasMoreTokens()){
	String name = str.nextToken();
	String value = str.nextToken();
	String domain = str.nextToken();
	String path = str.nextToken();
	Date expiry = null;
	String dt;
	if(!(dt=str.nextToken()).equals("null")){
	expiry = new Date(dt);
	}
	boolean isSecure = new Boolean(str.nextToken()).
	booleanValue();
	Cookie ck = new Cookie(name,value,domain,path, expiry,isSecure);
	driver.manage().addCookie(ck);
	}
	}
	}catch(Exception ex){
	ex.printStackTrace();
	}
	driver.get("http://www.buffer.com");
	}
	}
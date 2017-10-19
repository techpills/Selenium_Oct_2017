package java_test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCookies {
private static WebDriver driver = null;

public static void main(String args[]) {

	//Invoke Driver
	driver.get("http://facebook.com");
	
	//Enter  Login Credentials
	driver.findElement(By.name("email")).sendKeys("*****Your Email ID*****");
	driver.findElement(By.name("pass")).sendKeys("*****Your Password");
	
	//Click login
	driver.findElement(By.name("LogIn")).submit();
	
//To get the cookies and store 
File f = new File("browser.data");
try{
	
f.delete();
f.createNewFile();

FileWriter fos = new FileWriter(f);
BufferedWriter bos = new BufferedWriter(fos);

for(Cookie ckie : driver.manage().getCookies()) {
bos.write((ckie.getName()+";"+ckie.getValue()+";"+ckie.getDomain()
+";"+ckie.getPath()+";"+ckie.getExpiry()+";"+ckie.isSecure()));

//Printing into console
System.out.println(ckie.getName()+";"+ckie.getValue()+";"+ckie.getDomain()
+";"+ckie.getPath()+";"+ckie.getExpiry()+";"+ckie.isSecure());
bos.newLine();
}

bos.flush();
bos.close();
fos.close();
}catch(Exception ex){
ex.printStackTrace();
}
}
}
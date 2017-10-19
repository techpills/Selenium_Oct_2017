package allSocialShare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminLoginPage {
WebDriver driver;
@FindBy(how=How.ID, id="Email")
WebElement email;
@FindBy(how=How.ID, id="user_pass")
WebElement password;
@FindBy(how=How.ID, id="wp-submit")
WebElement submit;
public AdminLoginPage(WebDriver driver){
this.driver = driver;
driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
}
public void login(){
email.sendKeys("pageobjectpattern@gmail.com");
password.sendKeys("webdriver123");
submit.click();
}
}
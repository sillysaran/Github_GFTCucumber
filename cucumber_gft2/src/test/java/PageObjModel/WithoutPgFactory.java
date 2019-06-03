package PageObjModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WithoutPgFactory {
	WebDriver driver;
	By lnyc=By.linkText("Log in");
	By uname=By.name("Email");
	By pwd=By.name("Password");
	By lin=By.xpath("//a[@class='ico-login']");
	public WithoutPgFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clicklink() {
		driver.findElement(lnyc).click();
	}
	
	public void typeusername(String username) {
		driver.findElement(uname).sendKeys("saran@gmail.com");
	}
	
	public void typepassword(String password) {
		driver.findElement(pwd).sendKeys("saranya");
	}
	public void clicklogin() {
		driver.findElement(lin).click();
	}
	


}

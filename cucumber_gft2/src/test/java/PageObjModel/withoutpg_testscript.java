package PageObjModel;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class withoutpg_testscript {
	public static void main(String[]args) {
		

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	WithoutPgFactory POObj=new WithoutPgFactory(driver);
	driver.get("http://demowebshop.tricentis.com/");

	driver.manage().window().maximize();
	POObj.clicklink();
	String username=null;
	POObj.typeusername(username);
	String password=null;
	POObj.typepassword(password);
	POObj.clicklogin();
	System.out.println("The title of the page is : "+driver.getTitle());
	}
}

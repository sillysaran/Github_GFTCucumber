package PageObjModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class withpg_testscript {
  public  void f()
  	{

  		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver_win32\\chromedriver.exe" );
  		WebDriver driver=new ChromeDriver();

  		driver.get("http://demowebshop.tricentis.com/");
  		driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  		WithPgFactory locateElements=PageFactory.initElements(driver,WithPgFactory.class);
  		locateElements.loginMethod("saran@gmail.com", "saranya123");
  	}
}

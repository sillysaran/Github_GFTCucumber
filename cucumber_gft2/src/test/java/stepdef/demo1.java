package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demo1 {
	WebDriver driver=null;
	
	@Given("the login page is opened")
	public void the_login_page_is_opened() {
		String ChromePath="C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		   driver.get("http://10.232.237.143:443/TestMeApp");
		
		   driver.manage().window().maximize();
		   driver.findElement(By.linkText("SignIn")).click();
		   System.out.println("The title of the page is: "+driver.getTitle());
	}

	@When("the user enters lalitha as username")
	public void the_user_enters_lalitha_as_username() {
			driver.findElement(By.name("userName")).sendKeys("lalitha");
	}
	

	@When("user enters password{int} as password")
	public void user_enters_password_as_password(Integer int1) {    
		driver.findElement(By.name("password")).sendKeys("password123");
	}

	@Then("user will finds TestMe App Home Page")
	public void user_will_finds_TestMe_App_Home_Page() {
		 driver.findElement(By.name("Login")).click();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
	}


}

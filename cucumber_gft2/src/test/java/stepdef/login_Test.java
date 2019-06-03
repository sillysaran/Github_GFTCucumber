package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_Test {
	WebDriver driver=null;
	@Given("user login page is opened")
	public void user_login_page_is_opened() throws InterruptedException {
		String ChromePath="C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://10.232.237.143:443/TestMeApp");
		   driver.manage().window().maximize();
		   driver.findElement(By.linkText("SignIn")).click();
		   System.out.println("The title of the page is: "+driver.getTitle());
			Thread.sleep(2000);
	}

	@When("user enters {string} as username and {string} as password")
	public void user_enters_as_username_and_as_password(String string, String string2) throws InterruptedException {
	
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("password123");
		Thread.sleep(2000);
	}

	@When("user click on Login button")
	public void user_click_on_Login_button() {
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.name("Login")).click();
	}

	@Then("user will find TestMe App homepage")
	public void user_will_find_TestMe_App_homepage() {
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
		
	}



}

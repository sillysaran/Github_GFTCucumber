package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dataDrivendemo {
	WebDriver driver=null;
	@Given("User open th application")
	public void user_open_th_application() {
		String ChromePath="C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		   driver.get("http://10.232.237.143:443/TestMeApp");

	}

	@When("User click on Sign in button")
	public void user_click_on_Sign_in_button() {
		
		   driver.manage().window().maximize();
		   driver.findElement(By.linkText("SignIn")).click();
		   System.out.println("The title of the page is: "+driver.getTitle());

	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) throws InterruptedException {
		
		driver.findElement(By.name("userName")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
		 driver.findElement(By.name("Login")).click();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
	}

	@Then("Message displayed login is Suuccessful")
	public void message_displayed_login_is_Suuccessful() {

		   System.out.println("Login is Successful");
		   
	}



}

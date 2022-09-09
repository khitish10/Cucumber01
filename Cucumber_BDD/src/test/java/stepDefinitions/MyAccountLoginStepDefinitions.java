package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyAccountLoginStepDefinitions {
	
	WebDriver driver = null;
	
	@Given("Open browser")
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khitish\\Desktop\\ChromeDriver\\One\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	  
	}

	@When("Enter URL {string}")
	public void enter_url(String string) {
		driver.get("https://practice.automationtesting.in/");
	    
	}

	@And("Click on MyAccount menu")
	public void click_on_my_account_menu() {
	    driver.findElement(By.xpath("//a[text()='My Account']")).click();
	}

	@And("Enter registered username and password")
	public void enter_registered_username_and_password() {
	    driver.findElement(By.name("username")).sendKeys("khitish10@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("Wuwwy4321l@ve");
	}

	@And("Click on login button")
	public void click_on_login_button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("User logs in successfully")
	public void user_logs_in_successfully() {
		String expected = "My Account – Automation Practice Site";
		String actual = driver.getTitle();
//		System.out.println(expected);
//		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		
	    
	}

}

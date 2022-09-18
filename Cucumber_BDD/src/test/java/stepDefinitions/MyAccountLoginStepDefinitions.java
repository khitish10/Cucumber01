package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

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
		driver.get(string);
	    
	}

	@And("Click on MyAccount menu")
	public void click_on_my_account_menu() {
	    driver.findElement(By.xpath("//a[text()='My Account']")).click();
	}


//	@When("Enter registered username {string} and password {string}")
//	public void enter_registered_username_and_password(String username, String password) {
//		driver.findElement(By.name("username")).sendKeys(username);
//	    driver.findElement(By.name("password")).sendKeys(password);
//	}
	
//Data table approach->>Single parameter
//	@When("Enter registered username and password")
//	public void enter_registered_username_and_password(io.cucumber.datatable.DataTable credentials) {//username and password coming from data table 
//																									//is strored inside credentials
//		List<List<String>>data = credentials.cells();//We store a list of list because there could be multiple sets of username and passwords 
//													 //passed and each set have two parameters i.e username and password
//		
//		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));//first row first coloumn i.e username
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));//first row 2nd column i.e password
//	}
	
	
	//Data table->>Multiple parameter and header->>Map table
	@When("Enter registered username and password")
	public void enter_registered_username_and_password(io.cucumber.datatable.DataTable credentials) {//username and password coming from data table 
																									//is strored inside credentials
		List<Map<String, String>>data = credentials.asMaps(String.class, String.class); //we modify list to map as we are storing username and password
													 //for a single list
		
		driver.findElement(By.name("username")).sendKeys(data.get(0).get("username"));//as username is the header we provided in feature file
		driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));//as password is the header we provided in feature file
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
		driver.close();
	}
	
	@Then("Verify Login")
	public void verify_login() {
	   boolean status = driver.findElement(By.xpath("//ul[@class='woocommerce-error']")).isDisplayed();
	   if(status) {
		   Assert.assertTrue("Invalid Input", true);
	   }else {
		   Assert.assertTrue(true);
	   }
	}
	
	

}

package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStepDefinitions {
	
	
	@Before//import from cucumber package
	public void initialSetup() {
		System.out.println("----------------Lunch chrome browser-----------------");
	}
	
	@After
	public void teardown() {
		System.out.println("-------------------Close browser--------------------");
	}
	
	@Given("user is on add customer page")
	public void user_is_on_add_customer_page() {
		System.out.println("User is on Add Customer Page");
	    
	}

	@When("user fills the customer details")
	public void user_fills_the_customer_details() {
		System.out.println("User fills customer details");
	}

	@Then("customer is added")
	public void customer_is_added() {
		System.out.println("Customer is added");
	}

	@Given("user is on edit customer page")
	public void user_is_on_edit_customer_page() {
		System.out.println("User is on edit customer page");
	}

	@When("user edits contact details")
	public void user_edits_contact_details() {
		System.out.println("User edits contact details");
	}

	@Then("contact details are updated")
	public void contact_details_are_updated() {
		System.out.println("User contact details are updated");
	}

	@Given("user is on delete customer page")
	public void user_is_on_delete_customer_page() {
		System.out.println("User is on delete customer page");
	}

	@When("user delete customer")
	public void user_delete_customer() {
		System.out.println("User delete customer");
	}

	@Then("customer deleted")
	public void customer_deleted() {
		System.out.println("User deleted");
	}

}

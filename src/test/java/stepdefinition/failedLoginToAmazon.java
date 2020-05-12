package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class failedLoginToAmazon {
	@Given("the Improper or no username and password")
	public void the_Improper_or_no_username_and_password() {
	    System.out.println("hi");
	}

	@Then("the user should not be navigated to the homepage of Amazon application")
	public void the_user_should_not_be_navigated_to_the_homepage_of_Amazon_application() {
		  System.out.println("hi123");
	}

	@Then("capture the screenshot of the failed testcase")
	public void capture_the_screenshot_of_the_failed_testcase() {
		  System.out.println("hi456");
	}
	
}

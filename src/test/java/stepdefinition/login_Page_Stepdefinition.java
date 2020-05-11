package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.configurable_properties;

public class login_Page_Stepdefinition {
	WebDriver driver;

	@Given("the username and password")
	public void the_username_and_password() throws IOException {

		configurable_properties.property_File();
		configurable_properties.browser_choice();

		configurable_properties.url_WindowOptimisation();
	}

	@When("the user hits on the Sign-in button")
	public void the_user_hits_on_the_Sign_in_button() {
		System.out.println("hello12");
	}

	@Then("the user should be navigated to the homepage of Amazon application")
	public void the_user_should_be_navigated_to_the_homepage_of_Amazon_application() {
		System.out.println("hello123");

	}

}

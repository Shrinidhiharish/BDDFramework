package stepdefinition;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.LoginPage;
import Pages.SearchItem_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.configurable_properties;

public class login_Page_Stepdefinition {

	WebDriver driver = null;
	Properties prop;
	
	@Given("the username and password")
	public void the_username_and_password() throws IOException {
		this.driver = configurable_properties.driver;
		LoginPage.callconfig();
//	LoginPage.loginusername();
//	LoginPage.loginpassword();

	}

	@When("the user hits on the Sign-in button")
	public void the_user_hits_on_the_Sign_in_button() throws IOException {
System.out.println("The test has successfully clicked on sign-in button");
		//LoginPage.loginpSignin();
	}

	@Then("the user should be navigated to the homepage of Amazon application")
	public void the_user_should_be_navigated_to_the_homepage_of_Amazon_application() throws IOException {
	
	SearchItem_Page.searchItem();
			
}
	
}

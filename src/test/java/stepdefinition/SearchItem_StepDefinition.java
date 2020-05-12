package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchItem_StepDefinition {

	@Given("Customer enters the Product name which he wishes to Buy in the Autosuggestive search tab")
	public void customer_enters_the_Product_name_which_he_wishes_to_Buy_in_the_Autosuggestive_search_tab() {
	   System.out.println("stepdefinition2");
	   
	}

	@When("customer filters the search applying Sort and scrolls down to apply filter by brand and toys age range")
	public void customer_filters_the_search_applying_Sort_and_scrolls_down_to_apply_filter_by_brand_and_toys_age_range() {
	   
	}

	@Then("Result is displayed after the filtered search customer picks the product of his choice")
	public void result_is_displayed_after_the_filtered_search_customer_picks_the_product_of_his_choice() {
	    
	}

	@Then("selects the colour and hovor over the product to have a closer look at the product")
	public void selects_the_colour_and_hovor_over_the_product_to_have_a_closer_look_at_the_product() {
	    
	}

	@Then("adds the product to cart")
	public void adds_the_product_to_cart() {
	    
	}

	@Then("check if the product is added to the cart")
	public void check_if_the_product_is_added_to_the_cart() {
	    
	}

}

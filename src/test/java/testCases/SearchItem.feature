Feature: This is a validation for Search module of Amazon Application

Scenario: User Enters a Product in search tab for purchase and proceeds till Add to cart module of the application.

Given Customer enters the Product name which he wishes to Buy in the Autosuggestive search tab
When customer filters the search applying Sort and scrolls down to apply filter by brand and toys age range
Then Result is displayed after the filtered search customer picks the product of his choice
And selects the colour and hovor over the product to have a closer look at the product 
And adds the product to cart
And check if the product is added to the cart


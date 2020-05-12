Feature: Testing the Login module of Amazon application. 

Scenario: Provided with the proper credentails the customer should be able to land on the homepage of the Amazon application.

Given the username and password 
When the user hits on the Sign-in button
Then the user should be navigated to the homepage of Amazon application

#
#Scenario: Provided with the Improper credentails or no Credentails the customer should not be able to land on the homepage of the Amazon application.
#Given the Improper or no username and password 
#When the user hits on the Sign-in button
#Then the user should not be navigated to the homepage of Amazon application
#And capture the screenshot of the failed testcase




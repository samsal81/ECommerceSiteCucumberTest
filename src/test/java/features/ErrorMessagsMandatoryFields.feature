@ErrorMessagesForMandatoryFields
Feature: Error Messages For Mandatory Fields Functionality 

Background: 
	Given the user is on the website page 
	
Scenario Outline: 
	When User clicks sign in button 
	Then User enters email address "<email>"
	Then User clicks Create an Account button
	Then User Leaves the mandatory fields (marked with *) blank and click Register button
	Then Verify that error has been displayed for the mandatory fields
	
	
	Examples:
	|email|
	|abc@123.com|
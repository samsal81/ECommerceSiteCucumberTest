@Menulink
Feature: Menu link functionality

Background: 
	Given the user is on the website page
	
Scenario Outline: 

	When User is on the main page get the page title and print it
	Then User clicks on first menu link contact us
	Then Get the page title and print it
	Then User navigates back to Home Page
	Then Get the page title and print it and verify that value matches the home page title

	Examples:
	|username|password|
	|samsal81@usa.com|abc123|
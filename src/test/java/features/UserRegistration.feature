@UserRegistration
Feature: User Registration Process Functionality 

Background: 
	Given the user is on the website page 
	
Scenario Outline: 
	When User clicks sign in button 
	Then User enters email address "<email>"
	Then User clicks Create an Account button
	Then User enters personal information "<FirstName>" "<LastName>" "<Password>" "<day>" "<month>" "<year>" "<aFirstName>" "<aLastName>" "<Company>" "<Address>" "<City>" "<State>" "<ZipCode>" "<Country>" "<alias>"
	Then User clicks register button
	Then Validate user account is created "<FirstName>" "<LastName>"
	
	
	Examples: 
		|email              |FirstName|LastName|Password|day|month|year|aFirstName|aLastName|Company     |Address        |City  |State |ZipCode|Country      |alias|
		|samsal81@usaaaa.com|John     |Doe     |abc123  |8  |5    |1987|John      |Doe      |Selenium inc|1568 Mulbary dr|Dallas|Texas |75648  |United States|Home |
		